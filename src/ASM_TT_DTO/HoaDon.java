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
public class HoaDon {
   
    String SoHoaDon;
    Date NgayNhapHoaDon;
    String MaKhachHang;
    String MaNhanVien;
    String Gia;
    String GhiChu;

    public HoaDon() {
    }

    public HoaDon(String SoHoaDon, Date NgayNhapHoaDon, String MaKhachHang, String MaNhanVien, String Gia, String GhiChu) {
        this.SoHoaDon = SoHoaDon;
        this.NgayNhapHoaDon = NgayNhapHoaDon;
        this.MaKhachHang = MaKhachHang;
        this.MaNhanVien = MaNhanVien;
        this.Gia = Gia;
        this.GhiChu = GhiChu;
    }

    public String getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(String SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public Date getNgayNhapHoaDon() {
        return NgayNhapHoaDon;
    }

    public void setNgayNhapHoaDon(Date NgayNhapHoaDon) {
        this.NgayNhapHoaDon = NgayNhapHoaDon;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

  

  


}
