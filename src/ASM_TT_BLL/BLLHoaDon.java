/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import static ASM_TT_BLL.BLLDangNhap.KiemTraSanPham;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ASM_TT_HALPER.ThongBao;
import ASM_TT_DAL.DALHoaDon;
import ASM_TT_DAL.DALKhachHang;
import ASM_TT_DAL.DALChiTietHoDon;
import ASM_TT_DAL.DALSanPham;
import ASM_TT_DTO.HoaDon;
import ASM_TT_DTO.KhachHang;
import ASM_TT_DTO.SanPham;
import ASM_TT_HALPER.ChuyenDoi;
import ASM_TT_HALPER.SQLHalper;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BLLHoaDon {

    public static void LoadHoaDon(JTable tblHoaDon) {

        DefaultTableModel tbModel = (DefaultTableModel) tblHoaDon.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALHoaDon.getALLHoaDon();
        Object obj[] = new Object[7];
        try {
            while (rs.next()) {

                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("SoHoaDon");
                obj[2] = ChuyenDoi.LayNgayString(rs.getDate("NgayNhapHoaDon"));
                obj[3] = rs.getString("MaKhachHang");
                obj[4] = rs.getString("MaNhanVien");
                obj[5] = ChuyenDoi.LaySoDouble(rs.getString("Gia"));
                obj[6] = rs.getString("GhiChu");

                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Sản Phẩm");
        }
    }

    public static HoaDon LayHoaDonTheoMa(String SoHD) {
        ResultSet rs = DALHoaDon.getHoaDon(SoHD);
        try {
            if (rs.next()) {
                // Nếu Có Nhân Viên 
                HoaDon hd = new HoaDon();
                hd.setSoHoaDon(rs.getString("SoHoaDon"));
                hd.setNgayNhapHoaDon(rs.getDate("NgayNhapHoaDon"));
                hd.setMaKhachHang(rs.getString("MaKhachHang"));
                hd.setMaNhanVien(rs.getString("MaNhanVien"));
                hd.setGia(rs.getString("Gia"));
                hd.setGhiChu(rs.getString("GhiChu"));

                // Trả về nhân viên 
                return hd;

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Lỗi Lấy Nhân Viên Theo Mã");
        }
        return null;
    }

    public static void ThemHoaDon(HoaDon hd) {

        // Kiểm tra tên đang nhập đa tồn tại
        // kiểm tra ok -> gọi hàm thêm từ DALNhanVien
        DALHoaDon.ThemHoaDon(hd);
    }

    public static void UpdateHoaDon(HoaDon hd) {

        DALHoaDon.UpdateHoaDon(hd);

    }

    public static ResultSet getHoaDon(String SoHoaDon) {
        String sql = "SELECT * FROM HoaDon WHERE SoHoaDon = ?";
        return SQLHalper.executeQuery(sql, SoHoaDon);
    }

    public static void LoadDataChiTietHoaDon(JTable tbl, SanPham sp, String SoLuongMua, String GhiChu) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();

        Object obj[] = new Object[7];

        obj[0] = tbModel.getRowCount() + 1;
        obj[1] = sp.getMaSanPham();
        obj[2] = sp.getTenSanPham();
        obj[3] = SoLuongMua;
        obj[4] = ChuyenDoi.LaySoString(sp.getGia());
        obj[5] = ChuyenDoi.LaySoString(Double.parseDouble(SoLuongMua) * sp.getGia());
        obj[6] = GhiChu;

        tbModel.addRow(obj);
        System.out.println();

    }

    public static String TinhTongTien(JTable tbl) {
        double TongTien = 0;
        for (int i = 0; i < tbl.getRowCount(); i++) {
            TongTien += ChuyenDoi.LaySoDouble(tbl.getValueAt(i, 5).toString());
        }

        return ChuyenDoi.LaySoString(TongTien);
    }

    public static String TienKhachTra(JTable tbl) {
        double TongTien = 0;
        for (int i = 0; i < tbl.getRowCount(); i++) {
            TongTien += ChuyenDoi.LaySoDouble(tbl.getValueAt(i, 5).toString());
        }

        return ChuyenDoi.LaySoString(TongTien);
    }

    //Hàm tạo số hóa đơn 
    public static String TaoSoHD() {
        String soHoaDon = "";
        try {

            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

            java.util.Date d = new java.util.Date();

            soHoaDon = dateFormat.format(d);
            System.out.println("soHoaDon: " + soHoaDon);
            ResultSet rs = DALHoaDon.CountSoHoaDon(soHoaDon);
            int rowCount = 0;
            if (rs.next()) {
                rowCount = rs.getInt(1);
            }
            boolean dup = false;
            do {
                if (rowCount > 98) {
                    soHoaDon = soHoaDon + (rowCount + 1);
                } else if (rowCount > 8) {
                    soHoaDon = soHoaDon + "0" + (rowCount + 1);
                } else {
                    soHoaDon = soHoaDon + "00" + (rowCount + 1);
                }
                System.out.println("soHoaDon: " + soHoaDon);
                ResultSet rs2 = DALHoaDon.GetBySoHoaDon(soHoaDon);
                if (rs2.next()) {
                    dup = true;
                    rowCount++;
                    soHoaDon = dateFormat.format(d);
                } else {
                    dup = false;
                }
            } while (dup);

        } catch (SQLException ex) {
            System.out.println("Lỗi số hóa đơn");
        }

        return soHoaDon;
    }

   
}
