/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.CTHD;
import ASM_TT_DTO.HoaDon;
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
public class DALChiTietHoDon {

    public static ResultSet getALLCTHD() {
        String sql = "SELECT * FROM ChiTietHoaDon";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet getCTHD(String SoHoaDon) {
        String sql = "SELECT * FROM ChiTietHoaDon WHERE SoHoaDon = ?";
        return SQLHalper.executeQuery(sql, SoHoaDon);
    }

    public static void Them(CTHD cthd) {
        String sql = " INSERT INTO [dbo].[ChiTietHoaDon]([SoHoaDon],[MaSanPham],[SoLuong],[GhiChu]) "
                + "     VALUES(?,?,?,?,?)";
        SQLHalper.executeUpdate(sql, 
                cthd.getGhiChu(),
                cthd.getMaSanPham(),
                cthd.getSoHoaDon(),
                cthd.getSoLuong());
  
    }

}
