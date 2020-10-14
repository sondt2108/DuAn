/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.SanPham;
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
public class DALSanPham {

    public static ResultSet getALLSanPham() {
        String sql = "SELECT * FROM SanPham";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet getSanPham(String MaNV) {
        String sql = "SELECT * FROM SanPham WHERE MaSanPham = ?";
        return SQLHalper.executeQuery(sql, MaNV);
    }

    public static void ThemSanPham(SanPham sp) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[SanPham]([MaSanPham],[TenSanPham],[SoLuong] "
                + "           ,[DonViTinh],[NgayNhap],[HangSX],[Gia]) "
                + "     VALUES(?,?,?,?,?,?,?) ";

        SQLHalper.executeUpdate(sql,
                sp.getMaSanPham(),
                sp.getTenSanPham(),
                sp.getSoLuong(),
                sp.getDonViTinh(),
                ChuyenDoi.LayNgayString(sp.getNhayNhap()),
                sp.getHangSanXuat(),
                sp.getGia());

    }

    public static void UpdateSanPham(SanPham sp) {
        String sql = " SET DATEFORMAT DMY UPDATE [dbo].[SanPham] "
                + "   SET [TenSanPham] = ? ,[SoLuong] = ? ,[DonViTinh] = ? "
                + "      ,[NgayNhap] = ? ,[HangSX] = ? ,[Gia] = ? "
                + " WHERE [MaSanPham] = ? ";
        SQLHalper.executeUpdate(sql,
                sp.getTenSanPham(),
                sp.getSoLuong(),
                sp.getDonViTinh(),
                ChuyenDoi.LayNgayString(sp.getNhayNhap()),
                sp.getHangSanXuat(),
                ChuyenDoi.LaySoString(sp.getGia()),
                sp.getMaSanPham());
    }
    // Hàm xoá sp SQL

    public static boolean kiemtraCoTheXoa(String maSp) {
        String sql = "select top 1* from ChiTietHoaDon where masanpham = ?";
        ResultSet rs = SQLHalper.executeQuery(sql, maSp);

        try {
            return !rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DALSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void DeleteSanPham(String MaSP) {

        String sql = " DELETE FROM SANPHAM WHERE MASANPHAM = ?";
        SQLHalper.executeUpdate(sql, MaSP);
    }

    public static ResultSet TimKiem(String TenSanPham, String HangSX) {
        String sql = "{call spTimSanPham (?, ?)}";
        return SQLHalper.executeQuery(sql, TenSanPham, HangSX);

    }

    public static ResultSet Getone(String MaSP) {
        String sql = " Select * from SanPham where MaSanPham = ?";
        return SQLHalper.executeQuery(sql, MaSP);
    }
}
