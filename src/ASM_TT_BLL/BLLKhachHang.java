/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import ASM_TT_HALPER.ThongBao;
import ASM_TT_DAL.DALKhachHang;
import ASM_TT_DAL.DALNhanVien;
import ASM_TT_DTO.KhachHang;
import ASM_TT_DTO.NhanVien;
import ASM_TT_HALPER.ChuyenDoi;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BLLKhachHang {

    public static void ThemKhachHang(KhachHang kh) {

        // Kiểm tra tên đang nhập đa tồn tại
        // kiểm tra ok -> gọi hàm thêm từ DALNhanVien
        DALKhachHang.ThemKhachHang(kh);
    }

    public static void LoadKhachHang(JTable tblDanhSach) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALKhachHang.getALLKhachHang();
        Object obj[] = new Object[8];
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaKhachHang");
                obj[2] = rs.getString("TenKhachHang");
                boolean gt = rs.getBoolean("GioiTinh");
                if (gt) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("SoDienThoai");
                obj[6] = rs.getString("CMND");
                obj[7] = rs.getString("GhiChu");
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Khách Hàng");
        }
    }

    public static KhachHang LayKHTheoMa(String MaKH) {
        ResultSet rs = DALKhachHang.getKhachHang(MaKH);
        try {
            if (rs.next()) {
                // Nếu Có Nhân Viên 
                KhachHang KH = new KhachHang();
                KH.setMaKhachHang(rs.getString("MaKhachHang"));
                KH.setTenKhachHang(rs.getString("TenKhachHang"));
                KH.setGioiTinh(rs.getBoolean("GioiTinh"));
                KH.setDiaChi(rs.getString("DiaChi"));
                KH.setSDT(rs.getString("SoDienThoai"));
                KH.setSoCMND(rs.getString("CMND"));
                KH.setGhiChu(rs.getString("GhiChu"));

                // Trả về nhân viên 
                return KH;

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Lỗi Lấy Nhân Viên Theo Mã");
        }
        return null;
    }

    public static void UpdateKhachHang(KhachHang KH) {

        DALKhachHang.UpdateKhachHang(KH);
    }

    public static void Delete(List<String> lstMaKH) {

        String danhSachKhongTheXoa = "";
        String danhSachDaXoa = "";

        for (String MaKH : lstMaKH) {

            if (DALKhachHang.kiemtraCoTheXoa(MaKH)) {
                DALKhachHang.DeleteKhachHang(MaKH);
                danhSachDaXoa += MaKH + " \n";
            } else {
                danhSachKhongTheXoa += MaKH + " \n";
            }
        }

        if (!danhSachDaXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Đã Xóa Mã : \n" + danhSachDaXoa);
        }
        if (!danhSachKhongTheXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Không Thể Xóa Mã :\n" + danhSachKhongTheXoa);
        }

    }

    public static void TimKhachHang(JTable tblDanhSach, String TenKhachHang) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
       ResultSet rs = DALKhachHang.TimKiem(TenKhachHang);
        Object obj[] = new Object[8];
        try {
            while (rs.next()) {
               obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaKhachHang");
                obj[2] = rs.getString("TenKhachHang");
                boolean gt = rs.getBoolean("GioiTinh");
                if (gt) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("SoDienThoai");
                obj[6] = rs.getString("CMND");
                obj[7] = rs.getString("GhiChu");
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Khách Hàng");
        }
    }
}
