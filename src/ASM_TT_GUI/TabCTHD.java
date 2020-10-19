/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_GUI;

import ASM_TT_BLL.BLLCTHD;
import ASM_TT_BLL.BLLSanPham;
import ASM_TT_BLL.BLLCombobox;
import ASM_TT_BLL.BLLHoaDon;
import ASM_TT_BLL.BLLNhanVien;
import ASM_TT_DAL.DALKhachHang;
import ASM_TT_DAL.DALNhanVien;
import ASM_TT_DTO.HoaDon;
import ASM_TT_DTO.SanPham;
import ASM_TT_HALPER.ChuyenDoi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class TabCTHD extends javax.swing.JPanel {

    /**
     * Creates new form TabCTHD
     */
    public TabCTHD() {
        initComponents();

        BLLSanPham.LoadSanPhamHoaDon(tblSanPham);
        //ResultSet rsKH = DALKhachHang.getALLKhachHang();
        //BLLCombobox.Load(cbbKhachHang, rsKH, false);

        // ResultSet rsNV = DALNhanVien.getALLNhanVien();
        //BLLCombobox.Load(cbbNhanVien, rsNV, false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        txtTuKhoaSanPham.setBackground(new Color(0, 0, 0, 0));
        txtTTGhiChu.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmmChiTietHoaDon = new javax.swing.JPopupMenu();
        mmiXoaSP = new javax.swing.JMenuItem();
        mmiSuaSP = new javax.swing.JMenuItem();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTuKhoaSanPham = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCHHD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        lblTienKhachTra = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTTGhiChu = new javax.swing.JTextField();

        mmiXoaSP.setText("Xoá Sản Phảm");
        mmiXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiXoaSPActionPerformed(evt);
            }
        });
        pmmChiTietHoaDon.add(mmiXoaSP);

        mmiSuaSP.setText("mmiSua");
        mmiSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiSuaSPActionPerformed(evt);
            }
        });
        pmmChiTietHoaDon.add(mmiSuaSP);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 204));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sản Phẩm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Nhập Sản Phẩm Cần Tìm");

        txtTuKhoaSanPham.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTuKhoaSanPham.setForeground(new java.awt.Color(0, 0, 153));
        txtTuKhoaSanPham.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));
        txtTuKhoaSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTuKhoaSanPhamKeyReleased(evt);
            }
        });

        tblSanPham.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên Sản Phẩm", "Số Lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setMinWidth(0);
            tblSanPham.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Chọn Loại Sản Phẩm");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(txtTuKhoaSanPham)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtTuKhoaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh Toán", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel4.setOpaque(false);

        tblCHHD.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblCHHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng Mua", "Giá", "Thành Tiền", "Ghi Chú"
            }
        ));
        tblCHHD.setComponentPopupMenu(pmmChiTietHoaDon);
        jScrollPane2.setViewportView(tblCHHD);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sự Kiện Của Hoá Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Tổng Tiền");

        lblTongTien.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 0, 51));
        lblTongTien.setText("9.500.000");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Tiền Khách Trả ");

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Huỷ");

        btnThanhToan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        lblTienKhachTra.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblTienKhachTra.setForeground(new java.awt.Color(255, 0, 51));
        lblTienKhachTra.setText("9.500.000");

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Ghi Chú");

        txtTTGhiChu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTTGhiChu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 204)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblTienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTTGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTTGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 public static String SoLuongMua = "1";
    public static String GhiChu;
    public static boolean Huy;
    private void txtTuKhoaSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTuKhoaSanPhamKeyReleased
        // TODO add your handling code here:
        String TuKhoa = "%" + txtTuKhoaSanPham.getText() + "%";
       // BllSanPham.TimSanPhamHoaDon(tblSanPham, TuKhoa, TuKhoa);
    }//GEN-LAST:event_txtTuKhoaSanPhamKeyReleased

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() >= 2) {
            jdlThongTinSanPham jdl = new jdlThongTinSanPham((JFrame) SwingUtilities.getWindowAncestor(this), true);
            jdl.setVisible(true);
            if (Huy) {
                return;
            }
            // Lấy IDSanPham <=> Lấy sản phẩm theo ID

            String MaSP = tblSanPham.getValueAt(tblSanPham.getSelectedRow(), 0).toString();
            //SanPham sp = BllSanPham.GetSanPham(MaSP);
           // BLLHoaDon.LoadDataChiTietHoaDon(tblCHHD, sp, SoLuongMua, GhiChu);

            lblTongTien.setText(BLLHoaDon.TinhTongTien(tblCHHD));
            lblTienKhachTra.setText(BLLHoaDon.TinhTongTien(tblCHHD));
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        HoaDon hd = new HoaDon();
        hd.setGhiChu(txtTTGhiChu.getText());
        hd.setNgayNhapHoaDon(new java.util.Date());
        String SoHoaDon = BLLHoaDon.TaoSoHD();
        hd.setSoHoaDon(BLLHoaDon.TaoSoHD());

        BLLHoaDon.ThemHoaDon(hd);


    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void mmiXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiXoaSPActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblCHHD.getModel();

        int ViTri = tblCHHD.getSelectedRow();
        if (ViTri >= 0) {
            tblModel.removeRow(ViTri);
            for (int i = 0; i < tblCHHD.getRowCount(); i++) {
                tblCHHD.setValueAt(i + 1, i, 1);
            }
        }
        lblTongTien.setText(BLLHoaDon.TinhTongTien(tblCHHD));
        lblTienKhachTra.setText(BLLHoaDon.TinhTongTien(tblCHHD));

    }//GEN-LAST:event_mmiXoaSPActionPerformed

    private void mmiSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiSuaSPActionPerformed
        // TODO add your handling code here:
        int viTri = tblCHHD.getSelectedRow();
        SoLuongMua = tblCHHD.getValueAt(viTri, 3).toString();
        GhiChu = tblCHHD.getValueAt(viTri, 6).toString();

        jdlThongTinSanPham jdl = new jdlThongTinSanPham((JFrame) SwingUtilities.getWindowAncestor(this), true);
        jdl.setVisible(true);
        if (Huy) {
            return;
        }

        tblCHHD.setValueAt(SoLuongMua, viTri, 3);
        double thanhTien = Double.parseDouble(SoLuongMua)
                * ChuyenDoi.LaySoDouble(tblCHHD.getValueAt(viTri, 5).toString());
        tblCHHD.setValueAt(ChuyenDoi.LaySoString(thanhTien), viTri, 5);
        tblCHHD.setValueAt(GhiChu, viTri, 6);


    }//GEN-LAST:event_mmiSuaSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTienKhachTra;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JMenuItem mmiSuaSP;
    private javax.swing.JMenuItem mmiXoaSP;
    private javax.swing.JPopupMenu pmmChiTietHoaDon;
    private javax.swing.JTable tblCHHD;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTTGhiChu;
    private javax.swing.JTextField txtTuKhoaSanPham;
    // End of variables declaration//GEN-END:variables

}
