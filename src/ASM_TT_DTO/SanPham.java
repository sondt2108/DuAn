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
    double GiaNhap;
    double GiaBan;
    String MaLoaiSp;
    String MaHangSx;
    Date NgayNhap;
    String MoTa;
    String HinhAnh;

    public SanPham(String MaSanPham, String TenSanPham, int SoLuong, String DonViTinh, double GiaNhap, double GiaBan, String MaLoaiSp, String MaHangSx, Date NgayNhap, String MoTa, String HinhAnh) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.MaLoaiSp = MaLoaiSp;
        this.MaHangSx = MaHangSx;
        this.NgayNhap = NgayNhap;
        this.MoTa = MoTa;
        this.HinhAnh = HinhAnh;
    }

    public SanPham(String TenSanPham, int SoLuong, String DonViTinh, double GiaNhap, double GiaBan, String MaLoaiSp, String MaHangSx, Date NgayNhap, String MoTa, String HinhAnh) {
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonViTinh = DonViTinh;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.MaLoaiSp = MaLoaiSp;
        this.MaHangSx = MaHangSx;
        this.NgayNhap = NgayNhap;
        this.MoTa = MoTa;
        this.HinhAnh = HinhAnh;
    }
    

    public SanPham() {
    
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

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMaLoaiSp() {
        return MaLoaiSp;
    }

    public void setMaLoaiSp(String MaLoaiSp) {
        this.MaLoaiSp = MaLoaiSp;
    }

    public String getMaHangSx() {
        return MaHangSx;
    }

    public void setMaHangSx(String MaHangSx) {
        this.MaHangSx = MaHangSx;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    
    
}
