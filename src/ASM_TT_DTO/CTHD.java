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
public class CTHD {
     int SoHoaDon;
     String MaSanPham;
     int SoLuong;
     String GhiChu;

    public CTHD() {
    }

    public CTHD(String MaSanPham, String GhiChu) {
        this.MaSanPham = MaSanPham;
        this.GhiChu = GhiChu;
    }

   

    public CTHD(int SoHoaDon, String MaSanPham, int SoLuong, String GhiChu) {
        this.SoHoaDon = SoHoaDon;
        this.MaSanPham = MaSanPham;
        this.SoLuong = SoLuong;
        this.GhiChu = GhiChu;
    }

    public int getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(int SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

   
     
}
