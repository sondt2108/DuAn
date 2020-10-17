/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import ASM_TT_DAL.DALNhanVien;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ASM_TT_HALPER.ThongBao;
import ASM_TT_DAL.DALSanPham;
import ASM_TT_DTO.NhanVien;
import ASM_TT_DTO.SanPham;
import ASM_TT_HALPER.ChuyenDoi;
import ASM_TT_HALPER.Mycombobox;
import ASM_TT_HALPER.SQLHalper;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BllSanPham {

    public static boolean KtraThongTin(String TenDangNhap, String MatKhau) {
        if (TenDangNhap.isEmpty() || MatKhau.isEmpty()) {
            ThongBao.ThongBaoDangNhap("Thông báo", "Bạn chưa nhập đủ thông tin!!");
            return false;
        }
        if (TenDangNhap.length() < 5) {
            ThongBao.ThongBaoDangNhap("Thông báo", "Tên đăng nhập phải lớn hơn 5!!");
            return false;
        }
        if (MatKhau.length() < 5) {
            ThongBao.ThongBaoDangNhap("Thông báo", "Mật khẩu phải lớn hơn 5!!");
            return false;
        }
        return true;

    }

  /*  public static NhanVien DangNhap(String TenDangNhap, String MatKhau) {
        try {
            ResultSet rs = DALNhanVien.DangNhap(TenDangNhap, MatKhau);
            if (rs.next()) {
                return LayNhanVienTheoTen(rs.getString("TenDangNhap"));
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDangNhap("Thông báo lỗi", "Lỗi SQL đăng nhập!");
        }
        return null;
    }*/

    public static void ThemSanPham(SanPham sp) {

        // Kiểm tra tên đang nhập đa tồn tại
        // kiểm tra ok -> gọi hàm thêm từ DALNhanVien
        DALSanPham.ThemSanPham(sp);
    }

    public static void LoadSanPham(JTable tblDanhSach) {

        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALSanPham.getALLSanPham();
        Object obj[] = new Object[12];
        try {
            while (rs.next()) {

                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaSP");
                obj[2] = rs.getString("TenSP");
                obj[3] = rs.getInt("SoLuong");
                obj[4] = rs.getString("DonViTinh");
                obj[5] = ChuyenDoi.LaySoString(rs.getDouble("GiaNhap"));
                obj[6] = ChuyenDoi.LaySoString(rs.getDouble("GiaBan"));
                obj[7] = rs.getInt("MaLoaiSP");
                obj[8] = rs.getInt("MaHangSX");
                obj[9] = ChuyenDoi.LayNgayString(rs.getDate("NgayNhap"));
                obj[10] = rs.getString("MoTa");
                obj[11] = rs.getString("HinhAnh");
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Sản Phẩm");
        }
    }

    public static SanPham LaySanPhamTheoMa(String MaSP) {
        ResultSet rs = DALSanPham.getSanPham(MaSP);
        try {
            if (rs.next()) {
                // Nếu Có Nhân Viên 
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString("MaSP"));
                sp.setTenSanPham(rs.getString("TenSP"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setDonViTinh(rs.getString("DonViTinh"));
                sp.setGiaNhap(rs.getDouble("GiaNhap"));
                sp.setGiaBan(rs.getDouble("GiaBan"));
                sp.setMaLoaiSp(rs.getString("MaLoaiSP"));
                sp.setMaHangSx(rs.getString("MaHangSX"));
                sp.setMoTa(rs.getString("MoTa"));
                sp.setNgayNhap(rs.getDate("NgayNhap"));
                sp.setHinhAnh(rs.getString("HinhAnh"));
                // Trả về nhân viên 
                return sp;

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Lỗi Lấy Sản Phẩm Theo Mã");
        }
        return null;
    }
    
    private String LayTenLoaiSP(String MaLoaiSP) {
        ResultSet rs = DALSanPham.GetTenLoaiSP(MaLoaiSP);
        try {
            if(rs.next()) {
                return rs.getString("MaLoaiSP");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoSQL("Thông báo", "Lỗi lấy tên loại sản phẩm");
        }
        return "";
    }

    public static boolean KiemTraSanPham(SanPham sp) {
        if (sp.getMaSanPham().isBlank()) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Tên Không Được Bỏ Trống");
            return false;
        }

        return true;
    }

    public static void UpdateSanPham(SanPham sp) {
        DALSanPham.UpdateSanPham(sp);
    }
// hàm xoá nhiều nhân viên theo mã

    public static void Delete(List<String> lstMaSP) {

        String danhSachKhongTheXoa = "";
        String danhSachDaXoa = "";

        for (String MaSP : lstMaSP) {
            DALSanPham.DeleteSanPham(MaSP);
            /*if (DALSanPham.kiemtraCoTheXoa(MaSP)) {
                DALSanPham.DeleteSanPham(MaSP);
                danhSachDaXoa += MaSP + " \n";
            } else {
                danhSachKhongTheXoa += MaSP + " \n";
            }*/
        }

        if (!danhSachDaXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Đã Xóa Mã : \n" + danhSachDaXoa);
        }
        if (!danhSachKhongTheXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Không Thể Xóa Mã :\n" + danhSachKhongTheXoa);
        }

    }

    public static void TimSanPham(JTable tblDanhSach, String TuKhoa, String LoaiSp) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALSanPham.TimKiem(TuKhoa, LoaiSp);
        Object obj[] = new Object[12];
        try {
            while (rs.next()) {

                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaSP");
                obj[2] = rs.getString("TenSP");
                obj[3] = rs.getInt("SoLuong");
                obj[4] = rs.getString("DonViTinh");
                obj[5] = ChuyenDoi.LaySoString(rs.getDouble("GiaNhap"));
                obj[6] = ChuyenDoi.LaySoString(rs.getDouble("GiaBan"));
                obj[7] = rs.getInt("MaLoaiSP");
                obj[8] = rs.getInt("MaHangSX");
                obj[9] = ChuyenDoi.LayNgayString(rs.getDate("NgayNhap"));
                obj[10] = rs.getString("MoTa");
                obj[11] = rs.getString("HinhAnh");
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Sản Phẩm");
        }

    }

    /*public static SanPham GetSanPham(String MaSP) {
        SanPham sp = new SanPham();
        ResultSet rs = DALSanPham.Getone(MaSP);

        try {
            if (rs.next()) {
                sp.setMaSanPham(rs.getString("MaSanPham"));
                sp.setDonViTinh(rs.getString("DonViTinh"));
                sp.setGia(rs.getDouble("Gia"));
                sp.setHangSanXuat(rs.getString("HangSX"));
                sp.setMaSanPham(rs.getString("MaSanPham"));
                sp.setNhayNhap(rs.getDate("NgayNhap"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setTenSanPham(rs.getString("TenSanPham"));

                return sp;

            }
        } catch (Exception e) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Lỗi Lấy Sản Phẩm!!!" + e.getMessage());
        }
        return null;
    }*/

    public static void LoadSanPhamHoaDon(JTable tblDanhSach) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALSanPham.getALLSanPham();
        Object obj[] = new Object[4];
        try {
            while (rs.next()) {

                obj[0] = rs.getString("MaSanPham");
                obj[1] = rs.getString("TenSanPham");
                obj[2] = rs.getInt("SoLuong");
                obj[3] = ChuyenDoi.LaySoString(rs.getDouble("Gia"));

                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Sản Phẩm");
        }
    }

    /*public static void TimSanPhamHoaDon(JTable tblDanhSach, String TuKhoa, String HangSX) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALSanPham.TimKiem(TuKhoa, HangSX);
        Object obj[] = new Object[4];
        try {
            while (rs.next()) {

                obj[0] = rs.getString("MaSanPham");
                obj[1] = rs.getString("TenSanPham");
                obj[2] = rs.getInt("SoLuong");
                obj[3] = ChuyenDoi.LaySoString(rs.getDouble("Gia"));

                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Sản Phẩm");
        }
    }*/

    /*public static NhanVien LayNhanVienTheoTen(String TenDangNhap) {
        ResultSet rs = DALNhanVien.getNhanVien(TenDangNhap);

        try {
            if (rs.next()) {
                //Nếu có nhân viên
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("STD"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setMaChucVu(rs.getString("ChucVu"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));

                return nv;
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDangNhap("Thông báo lỗi!", "Lỗi lấy thông tin nhân viên theo mã!");
        }
        return null;
    }*/
}
