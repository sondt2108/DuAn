/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DTO;

/**
 *
 * @author Administrator
 */
public class NhaCungCap {
    String MaNCC;
    String TenNCC;
    String SDT;
    String DiaChi;
    String GhiChu;

    public NhaCungCap(String MaNCC, String TenNCC, String SDT, String DiaChi, String GhiChu) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
    }

    public NhaCungCap(String TenNCC, String SDT, String DiaChi, String GhiChu) {
        this.TenNCC = TenNCC;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
    }
    
    

    public NhaCungCap() {
    }
    
    

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}

