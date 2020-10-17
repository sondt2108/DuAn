/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.NhanVien;
import ASM_TT_HALPER.ChuyenDoi;
import java.sql.*;
import javax.swing.*;
import java.util.Date.*;
import ASM_TT_HALPER.SQLHalper;
import ASM_TT_HALPER.ThongBao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class DALNhanVien {

    public static ResultSet getALLNhanVien() {
        String sql = "SELECT * FROM NhanVien";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet DangNhap(String TenDangNhap, String MatKhau) {
        String sql = "select * from NhanVien where "
                + "TenDangNhap = ? and MatKhau = ?";
        return SQLHalper.executeQuery(sql, TenDangNhap, MatKhau);
    }

    public static ResultSet getALLChucVu() {
        String sql = "SELECT * FROM dbo.ChucVu";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet getChucVu(String MaCV) {
        String sql = "SELECT * FROM dbo.ChucVu WHERE MaChucVu = ?";
        return SQLHalper.executeQuery(sql, MaCV);
    }

    public static ResultSet getNhanVien(String MaNV) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV = ?";
        return SQLHalper.executeQuery(sql, MaNV);
    }

    public static void ThemNhanVien(NhanVien nv) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[NhanVien] "
                + "([TenNV], [GioiTinh], [NgaySinh], [ChucVu], [Luong], [SoDienThoai], [DiaChi], [CMND], [TenDangNhap], [MatKhau], [NgayVaoLam], [HinhAnh] ) "
                + "     VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

        SQLHalper.executeUpdate(sql,
                nv.getTenNV(),
                nv.isGioiTinh(),
                ChuyenDoi.LayNgayString(nv.getNgaySinh()),
                nv.getChucVu(),
                nv.getLuong(),
                nv.getSDT(),
                nv.getDiaChi(),
                nv.getCMND(),
                nv.getTenDangNhap(),
                nv.getMatKhau(),
                ChuyenDoi.LayNgayString(nv.getNgayVaoLam()),
                nv.getHinhAnh());
                //push
    }

    public static void UpdateNhanVien(NhanVien nv) {
        String sql = " SET DATEFORMAT DMY  UPDATE [dbo].[NhanVien] "
                + "   SET [TenNV] = ? "
                + "      ,[GioiTinh] = ? "
                + "      ,[NgaySinh] = ? "
                + "      ,[ChucVu] = ? "
                + "      ,[Luong] = ? "
                + "      ,[SoDienThoai] = ? "
                + "      ,[DiaChi] = ? "
                + "      ,[CMND] = ? "
                + "      ,[TenDangNhap] = ? "
                + "      ,[MatKhau] = ? "
                + "      ,[NgayVaoLam] = ? "
                + "      ,[HinhAnh] = ? "
                + " WHERE MaNV = ? ";
        SQLHalper.executeUpdate(sql,
                nv.getTenNV(),
                nv.isGioiTinh(),
                ChuyenDoi.LayNgayString(nv.getNgaySinh()),
                nv.getChucVu(),
                nv.getLuong(),
                nv.getSDT(),
                nv.getDiaChi(),
                nv.getCMND(),
                nv.getTenDangNhap(),
                nv.getMatKhau(),
                ChuyenDoi.LayNgayString(nv.getNgayVaoLam()),
                nv.getHinhAnh(),
                nv.getMaNV());
    }

    // Hàm xoá nhân viên SQL
    public static boolean kiemtraCoTheXoa(String MaNV) {
        String sql = "SELECT TOP 1* FROM  HDXuat WHERE MaNV = ?";
        ResultSet rs = SQLHalper.executeQuery(sql, MaNV);

        try {
            return !rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DALSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void DeleteNhanVien(String MaNV) {
        String sql = " DELETE FROM NHANVIEN WHERE MaNV = ?";
        SQLHalper.executeUpdate(sql, MaNV);
        //push
    }

    public static ResultSet TimKiem(String TenNhanVien, String ChucVu){
      String sql = "{call spTimKiemNV (?, ?)}";
      return SQLHalper.executeQuery(sql, TenNhanVien, ChucVu);
    }

}
