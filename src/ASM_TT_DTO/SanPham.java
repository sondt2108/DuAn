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
public class SanPham {
    
    String MaSanPham;
    String TenSanPham;
    int SoLuong;
    String DonViTinh;
    Date NhayNhap;
    String HangSanXuat;
    double Gia;

    public SanPham() {
    }

    public SanPham(String MaSanPham, String TenSanPham, int SoLuong, String DonViTinh, Date NhayNhap, String HangSanXuat, double Gia) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.NhayNhap = NhayNhap;
        this.HangSanXuat = HangSanXuat;
        this.Gia = Gia;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public Date getNhayNhap() {
        return NhayNhap;
    }

    public void setNhayNhap(Date NhayNhap) {
        this.NhayNhap = NhayNhap;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String HangSanXuat) {
        this.HangSanXuat = HangSanXuat;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

 
    
}
