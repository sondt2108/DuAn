/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.SanPham;
import ASM_TT_HALPER.ChuyenDoi;
import ASM_TT_HALPER.Mycombobox;
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

    public static ResultSet getSanPham(String MaSP) {
        String sql = "SELECT * FROM SanPham WHERE MaSP = ?";
        return SQLHalper.executeQuery(sql, MaSP);
    }

    public static ResultSet GetTenLoaiSP(String MaLoaiSP) {
        String sql = "SELECT * FROM LoaiSP WHERE MaLoaiSP = ?";
        return SQLHalper.executeQuery(sql, MaLoaiSP);
    }

    public static void ThemSanPham(SanPham sp) {
        String sql = "SET DATEFORMAT DMY INSERT INTO [dbo].[SanPham] "
                + "           ([TenSP],[SoLuong],[DonViTinh],[GiaNhap] "
                + "		   ,[GiaBan],[MaLoaiSP],[MaHangSX],[MoTa] "
                + "		   ,[NgayNhap],[HinhAnh]) "
                + "     VALUES "
                + "           (?,?,?,?,?,?,?,?,?,?)";

        SQLHalper.executeUpdate(sql,
                sp.getTenSanPham(),
                sp.getSoLuong(),
                sp.getDonViTinh(),
                ChuyenDoi.LaySoString(sp.getGiaNhap()),
                ChuyenDoi.LaySoString(sp.getGiaBan()),
                sp.getMaLoaiSp(),
                sp.getMaHangSx(),
                sp.getMoTa(),
                ChuyenDoi.LayNgayString(sp.getNgayNhap()),
                sp.getHinhAnh()
        );

    }

    public static void UpdateSanPham(SanPham sp) {
        String sql = "SET DATEFORMAT DMY UPDATE [dbo].[SanPham]"
                + "   SET [TenSP] = ? "
                + "      ,[SoLuong] = ? "
                + "      ,[DonViTinh] = ? "
                + "      ,[GiaNhap] = ? "
                + "      ,[GiaBan] = ? "
                + "      ,[MaLoaiSP] = ? "
                + "      ,[MaHangSX] = ? "
                + "      ,[MoTa] = ? "
                + "      ,[NgayNhap] = ? "
                + "      ,[HinhAnh] = ? "
                + " WHERE MaSP = ? ";
        SQLHalper.executeUpdate(sql,
                sp.getTenSanPham(),
                sp.getSoLuong(),
                sp.getDonViTinh(),
                ChuyenDoi.LaySoString(sp.getGiaNhap()),
                ChuyenDoi.LaySoString(sp.getGiaBan()),
                sp.getMaLoaiSp(),
                sp.getMaHangSx(),
                sp.getMoTa(),
                ChuyenDoi.LayNgayString(sp.getNgayNhap()),
                sp.getHinhAnh(),
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

        String sql = " DELETE FROM SANPHAM WHERE MASP = ?";
        SQLHalper.executeUpdate(sql, MaSP);
    }

    public static ResultSet TimKiem(String TuKhoa, String LoaiSP) {
        String sql = "{call spTimKiemSp (?, ?)}";
        return SQLHalper.executeQuery(sql, TuKhoa, LoaiSP);

    }

    public static ResultSet Getone(String MaSP) {
        String sql = " Select * from SanPham where MaSanPham = ?";
        return SQLHalper.executeQuery(sql, MaSP);
    }
    
}
