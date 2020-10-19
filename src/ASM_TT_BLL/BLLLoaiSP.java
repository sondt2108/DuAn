/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import ASM_TT_DAL.DALLoaiSP;
import ASM_TT_DTO.LoaiSP;
import ASM_TT_HALPER.Mycombobox;
import ASM_TT_HALPER.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Administrator
 */
public class BLLLoaiSP {
     public static void ThemLoaiSP(LoaiSP lsp) {

         DALLoaiSP.ThemNhaCC(lsp);
    }
     
    //3. Hàm đổ dữ liệu vào Combobox Loại sản phẩm
    public static void DoDuLieuVaoCBBLoaiSP(JComboBox cbb, String KeyWord){
        cbb.removeAllItems();
        try {
            ResultSet rs = DALLoaiSP.GetDuLieuCBB(KeyWord);
            
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
           
            while(rs.next()){
                Mycombobox mb = new Mycombobox(
                                            rs.getInt("MaLoaiSP"),rs.getString("TenLoaiSP"));
                cbbModel.addElement(mb);                
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoSQL("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }
}
