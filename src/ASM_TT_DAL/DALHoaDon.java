/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.HoaDon;
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
public class DALHoaDon {

    public static ResultSet CountSoHoaDon(String SoHoaDon) {
        String sql = "select Count(*) from hoadon where SoHoaDon like ?";
        return SQLHalper.executeQuery(sql, "%" + SoHoaDon + "%");
    }

    public static ResultSet getALLHoaDon() {
        String sql = "SELECT * FROM HoaDon";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet getHoaDon(String SoHD) {
        String sql = "SELECT * FROM HoaDon WHERE SoHoaDon = ?";
        return SQLHalper.executeQuery(sql, SoHD);
    }

    public static void ThemHoaDon(HoaDon hd) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[HoaDon]([SoHoaDon],[NgayNhapHoaDon] "
                + "           ,[MaKhachHang],[MaNhanVien],[Gia],[GhiChu]) "
                + "     VALUES(?,?,?,?,?,?) ";

        SQLHalper.executeUpdate(sql,
                hd.getSoHoaDon(),
                ChuyenDoi.LayNgayString(hd.getNgayNhapHoaDon()),
                hd.getMaKhachHang(),
                hd.getMaNhanVien(),
                hd.getGia(),
                hd.getGhiChu());

    }

    public static void UpdateHoaDon(HoaDon hd) {
        String sql = " SET DATEFORMAT DMY UPDATE [dbo].[HoaDon] "
                + "   SET [NgayNhapHoaDon] = ? "
                + "      ,[MaKhachHang] = ? "
                + "      ,[Gia] = ? "
                + "      ,[GhiChu] = ? "
                + " WHERE [MaNhanVien] = ? ";
        SQLHalper.executeUpdate(sql,
                ChuyenDoi.LayNgayString(hd.getNgayNhapHoaDon()),
                hd.getMaKhachHang(),
                hd.getGia(),
                hd.getGhiChu(),
                hd.getMaNhanVien());

    }

    public static ResultSet GetBySoHoaDon(String SoHoaDon) {
        String sql = "select * from hoadon where SoHoaDon = ?";
        return SQLHalper.executeQuery(sql, SoHoaDon);
    }

}
