/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import ASM_TT_DAL.DALHangSx;
import ASM_TT_DTO.HangSX;
import ASM_TT_HALPER.Mycombobox;
import ASM_TT_HALPER.ThongBao;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class BLLHangSX {
    public static void ThemHangSX(HangSX hsx) {

         DALHangSx.ThemHangSX(hsx);
    }
     
    //3. Hàm đổ dữ liệu vào Combobox Loại sản phẩm
    public static void DoDuLieuVaoCBBHangSX(JComboBox cbb, String KeyWord){
        cbb.removeAllItems();
        try {
            ResultSet rs = DALHangSx.GetDuLieuCBB(KeyWord);
            
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
           
            while(rs.next()){
                Mycombobox mb = new Mycombobox(
                                            rs.getInt("MaHangSX"),rs.getString("TenHangSX"));
                cbbModel.addElement(mb);                
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoSQL("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }
}
