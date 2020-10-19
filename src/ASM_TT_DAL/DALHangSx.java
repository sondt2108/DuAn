/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.HangSX;
import ASM_TT_HALPER.SQLHalper;
import java.sql.ResultSet;

/**
 *
 * @author Q.Đ
 */
public class DALHangSx {

    public static ResultSet GetAll() {
        String sql = "Select * from HangSX";
        return SQLHalper.executeQuery(sql);
    }

    public static void ThemHangSX(HangSX hsx) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[HangSX] "
                + "           ([TenHangSX] "
                + "           ,[MoTa]) "
                + "     VALUES "
                + "           (?, ?) ";

        SQLHalper.executeUpdate(sql,
                hsx.getTenHangSX(),
                hsx.getGhiChu());
        //push
    }

    public static ResultSet GetDuLieuCBB(String KeyWord) {
        String sql = "Select * from HangSX where TenHangSX like N'%" + KeyWord + "%' or MaHangSX like '%" + KeyWord + "%' ";
        return SQLHalper.executeQuery(sql);
    }
}
