/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DTO;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class KhachHang {

    String MaKhachHang;
    String TenKhachHang;
    boolean GioiTinh;
    String DiaChi;
    String SDT;
    String SoCMND;
    String GhiChu;

    public KhachHang() {
    }

    public KhachHang(String MaKhachHang, String TenKhachHang, boolean GioiTinh, String DiaChi, String SDT, String SoCMND, String GhiChu) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.SoCMND = SoCMND;
        this.GhiChu = GhiChu;
    }

    public KhachHang(String TenKhachHang, boolean GioiTinh, String DiaChi, String SDT, String SoCMND, String GhiChu) {
        this.TenKhachHang = TenKhachHang;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.SoCMND = SoCMND;
        this.GhiChu = GhiChu;
    }
    
    
    
    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
    
}
