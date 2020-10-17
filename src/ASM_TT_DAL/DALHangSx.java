/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

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
}
