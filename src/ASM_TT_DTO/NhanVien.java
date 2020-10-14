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
public class NhanVien {

    String MaNV;
    String TenNV;
    boolean GioiTinh;
    Date NgaySinh;
    String ChucVu;
    double Luong;
    String DiaChi;
    String SDT;
    String CMND;
    Date NgayVaoLam;
    String TenDangNhap;
    String MatKhau;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, boolean GioiTinh, Date NgaySinh, String ChucVu, double Luong, String DiaChi, String SDT, String CMND, Date NgayVaoLam, String TenDangNhap, String MatKhau) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.CMND = CMND;
        this.NgayVaoLam = NgayVaoLam;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
    }

    public NhanVien(String TenNV, boolean GioiTinh, Date NgaySinh, String ChucVu, double Luong, String DiaChi, String SDT, String CMND, Date NgayVaoLam, String TenDangNhap, String MatKhau) {
        this.TenNV = TenNV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.CMND = CMND;
        this.NgayVaoLam = NgayVaoLam;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
    }
    
    

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
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

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    
    
   
}
