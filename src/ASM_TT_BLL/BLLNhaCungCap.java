/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import ASM_TT_DAL.DALNhaCungCap;
import ASM_TT_DAL.DALSanPham;
import ASM_TT_DTO.NhaCungCap;
import ASM_TT_HALPER.ChuyenDoi;
import ASM_TT_HALPER.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BLLNhaCungCap {
    public static void LoadNCC(JTable tblDanhSach) {

        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALNhaCungCap.getALLNCC();
        Object obj[] = new Object[6];
        try {
            while (rs.next()) {

                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaNhaCungCap");
                obj[2] = rs.getString("TenNCC");
                obj[3] = rs.getString("SoDienThoai");
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("GhiChu");
                
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Sản Phẩm");
        }
    }
    
    public static NhaCungCap LayNCCTheoMa(String MaNCC) {
        ResultSet rs = DALNhaCungCap.getMaNCC(MaNCC);
        try {
            if (rs.next()) {
                // Nếu Có Nhân Viên 
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNCC(rs.getString("MaNhaCungCap"));
                ncc.setTenNCC(rs.getString("TenNCC"));
                ncc.setSDT(rs.getString("SoDienThoai"));
                ncc.setDiaChi(rs.getString("DiaChi"));
                ncc.setGhiChu(rs.getString("GhiChu"));
                
                // Trả về nhân viên 
                return ncc;

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Lỗi Lấy Nhân Viên Theo Mã");
        }
        return null;
    }
    
    public static void UpdateNhaCC(NhaCungCap ncc) {

        DALNhaCungCap.SuaNhaCC(ncc);
    }
    
    public static void ThemNhaCC(NhaCungCap ncc) {

        DALNhaCungCap.ThemNhaCC(ncc);
    }
    
    public static void Delete(List<String> lstMaNV) {

        String danhSachKhongTheXoa = "";
        String danhSachDaXoa = "";

        for (String MaNCC : lstMaNV) {

            if (DALNhaCungCap.kiemtraCoTheXoa(MaNCC)) {
                DALNhaCungCap.DeleteNCC(MaNCC);
                danhSachDaXoa += MaNCC + " \n";
            } else {
                danhSachKhongTheXoa += MaNCC + " \n";
            }
        }

        if (!danhSachDaXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Đã Xóa Mã : \n" + danhSachDaXoa);
        }
        if (!danhSachKhongTheXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Không Thể Xóa Mã :\n" + danhSachKhongTheXoa);
        }

    }
}
