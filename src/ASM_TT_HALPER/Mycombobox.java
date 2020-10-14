/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_HALPER;

/**
 *
 * @author LENOVO
 */
public class Mycombobox {

    Object value; // lưu mã
    Object text; // tên loại

    public Mycombobox(Object value, Object text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return text.toString();
    }

    // hàm trả về vale kieu int 
    public int maInt() {
        return Integer.parseInt(value.toString());
    }

    // hàm trả về kiểu String
    public String maString() {
        return value.toString();
    }

}
