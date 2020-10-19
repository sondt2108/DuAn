/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.NhaCungCap;
import ASM_TT_HALPER.SQLHalper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DALNhaCungCap {

    public static ResultSet getALLNCC() {
        String sql = "SELECT * FROM NhaCungCap";
        return SQLHalper.executeQuery(sql);
    }

    // lấy NCC theo mã
    public static ResultSet getMaNCC(String MaNCC) {
        String sql = "SELECT * FROM NhaCungCap WHERE MaNhaCungCap = ?";
        return SQLHalper.executeQuery(sql, MaNCC);
    }

    public static void ThemNhaCC(NhaCungCap ncc) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[NhaCungCap] "
                + "           ([TenNCC] "
                + "           ,[SoDienThoai] "
                + "           ,[DiaChi] "
                + "           ,[GhiChu]) "
                + "     VALUES "
                + "           (?, ?, ?, ?) ";

        SQLHalper.executeUpdate(sql,
                ncc.getTenNCC(),
                ncc.getSDT(),
                ncc.getDiaChi(),
                ncc.getGhiChu());
        //push
    }

    public static void SuaNhaCC(NhaCungCap ncc) {
        String sql = " SET DATEFORMAT DMY UPDATE [dbo].[NhaCungCap] "
                + "   SET [TenNCC] = ? "
                + "      ,[SoDienThoai] = ? "
                + "      ,[DiaChi] = ? "
                + "      ,[GhiChu] =? "
                + " WHERE [MaNhaCungCap] = ? ";

        SQLHalper.executeUpdate(sql,
                ncc.getTenNCC(),
                ncc.getSDT(),
                ncc.getDiaChi(),
                ncc.getGhiChu(),
                ncc.getMaNCC());
                
        //push
    }
    
    public static boolean kiemtraCoTheXoa(String MaNCC) {
        String sql = "SELECT TOP 1* FROM  HDNhap WHERE MaNhaCungCap = ?";
        ResultSet rs = SQLHalper.executeQuery(sql, MaNCC);

        try {
            return !rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DALSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }
    
    public static void DeleteNCC(String MaNV) {
        String sql = " DELETE FROM NhaCungCap WHERE MaNhaCungCap = ?";
        SQLHalper.executeUpdate(sql, MaNV);
        //push
    }
}
