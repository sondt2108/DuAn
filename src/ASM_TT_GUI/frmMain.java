/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_GUI;

import ASM_TT_BLL.BLLNhanVien;
import ASM_TT_GUI.TabSanPham;
import ASM_TT_GUI.TabCTHD;
import ASM_TT_HALPER.ThongBao;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {

        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/ASM_TT_IMAGES/produc.png"));
        Image image = icon.getImage();
        setIconImage(image);
        this.setSize(1200, 850);


        new Thread() {

            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();
                    int Hour = ca.get(Calendar.HOUR);
                    int minute = ca.get(Calendar.MINUTE);
                    int Second = ca.get(Calendar.SECOND);
                    int PM_AM = ca.get(Calendar.AM_PM);
                    String day_night;

                    if (PM_AM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = "Time: " + Hour + ":" + minute + ":" + Second + " " + day_night;
                    lblThoiGian.setText(time);
                    
                    //4565gyhfd
                    
                }

            }

        }.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnSP = new javax.swing.JButton();
        btnNV = new javax.swing.JButton();
        btnKH = new javax.swing.JButton();
        btnHD = new javax.swing.JButton();
        btnCTHD = new javax.swing.JButton();
        btnNhaCC = new javax.swing.JButton();
        tabChuongTrinh = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        lblThoiGian = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 204));

        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        btnSP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/sanpham.png"))); // NOI18N
        btnSP.setText("Sản Phẩm");
        btnSP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSP.setFocusable(false);
        btnSP.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSP.setOpaque(false);
        btnSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSP);

        btnNV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/nhanvien.png"))); // NOI18N
        btnNV.setText("Nhân Viên");
        btnNV.setFocusable(false);
        btnNV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNV.setOpaque(false);
        btnNV.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNV);

        btnKH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/khachang.png"))); // NOI18N
        btnKH.setText("Khách Hàng");
        btnKH.setFocusable(false);
        btnKH.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnKH.setOpaque(false);
        btnKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKH);

        btnHD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/hoadon.png"))); // NOI18N
        btnHD.setText("Chi tiết hóa đơn");
        btnHD.setFocusable(false);
        btnHD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHD.setOpaque(false);
        btnHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHD);

        btnCTHD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCTHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/cthd.png"))); // NOI18N
        btnCTHD.setText("Tạo hóa đơn");
        btnCTHD.setFocusable(false);
        btnCTHD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCTHD.setOpaque(false);
        btnCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTHDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCTHD);

        btnNhaCC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNhaCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/cthd.png"))); // NOI18N
        btnNhaCC.setText("Nhà Cung Cấp");
        btnNhaCC.setFocusable(false);
        btnNhaCC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNhaCC.setOpaque(false);
        btnNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCCActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhaCC);

        tabChuongTrinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setOpaque(false);

        lblThoiGian.setFont(new java.awt.Font("Monospaced", 1, 35)); // NOI18N
        lblThoiGian.setForeground(new java.awt.Color(0, 0, 255));
        lblThoiGian.setText("TIME:");

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("PHẦN MỀM QUẢN LÝ KHO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(lblThoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM_TT_IMAGES/sp.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Copyright © 2020 Nhom F A. All rights reserved.");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        tabChuongTrinh.addTab("Giới Thiệu", jPanel1);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(tabChuongTrinh)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabChuongTrinh))
        );

        jMenuBar1.setOpaque(false);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Sign In");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Sign Up");
        jMenu1.add(jMenuItem2);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Tools");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1007, 821));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPActionPerformed
        // TODO add your handling code here:
        // pnlQlNhanVien pnl1 = new pnlQlNhanVien();
        int index1 = tabChuongTrinh.indexOfTab(" Quản Lý Sản Phẩm");
        if (index1 > 0) {
            tabChuongTrinh.remove(index1);
        } else {

            TabSanPham pnl1 = new TabSanPham();

            tabChuongTrinh.add(pnl1, "Quản Lý Sản Phẩm");

            int index = tabChuongTrinh.indexOfTab("Quản Lý Sản Phẩm");
            tabChuongTrinh.setSelectedIndex(index);
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            JLabel lblTitle = new JLabel("Quản Lý Sản Phẩm");

            JButton btnClose = new JButton("x");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            tabChuongTrinh.setTabComponentAt(index, pnlTab);
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index1 = tabChuongTrinh.indexOfTab("Quản Lý Sản Phẩm");
                    tabChuongTrinh.remove(index1);
                }
            });
        }
    }//GEN-LAST:event_btnSPActionPerformed

   
    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed
        // TODO add your handling code here:
        int index1 = tabChuongTrinh.indexOfTab("Quản Lý Nhân Viên");
        if (index1 > 0) {
            tabChuongTrinh.remove(index1);
        } else {

            TabNhanVien nv = new TabNhanVien();

            tabChuongTrinh.add(nv, "Quản Lý Nhân Viên");

            int index = tabChuongTrinh.indexOfTab("Quản Lý Nhân Viên");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            JLabel lblTitle = new JLabel("Quản Lý Nhân Viên");
            JButton btnClose = new JButton("x");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            tabChuongTrinh.setTabComponentAt(index, pnlTab);
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(index);
                    tabChuongTrinh.remove(index);
                }
            });
        }
    }//GEN-LAST:event_btnNVActionPerformed

    private void btnKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKHActionPerformed
        // TODO add your handling code here:
        int index1 = tabChuongTrinh.indexOfTab("Quản Lý Khách Hàng");
        if (index1 > 0) {
            tabChuongTrinh.remove(index1);
        } else {

            TabKhachHang nv = new TabKhachHang();

            tabChuongTrinh.add(nv, "Quản Lý Khách Hàng");

            int index = tabChuongTrinh.indexOfTab("Quản Lý Khách Hàng");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            JLabel lblTitle = new JLabel("Quản Lý Khách Hàng");
            JButton btnClose = new JButton("x");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            tabChuongTrinh.setTabComponentAt(index, pnlTab);
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(index);
                    tabChuongTrinh.remove(index);
                }
            });
        }
    }//GEN-LAST:event_btnKHActionPerformed

    private void btnHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDActionPerformed
        // TODO add your handling code here:
        int index1 = tabChuongTrinh.indexOfTab("Quản Lý Hoá Đơn");
        if (index1 > 0) {
            tabChuongTrinh.remove(index1);
        } else {

            TabHoaDon nv = new TabHoaDon();

            tabChuongTrinh.add(nv, "Quản Lý Hoá Đơn");

            int index = tabChuongTrinh.indexOfTab("Quản Lý Hoá Đơn");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            JLabel lblTitle = new JLabel("Quản Lý Hoá Đơn");
            JButton btnClose = new JButton("x");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            tabChuongTrinh.setTabComponentAt(index, pnlTab);
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(index);
                    tabChuongTrinh.remove(index);
                }
            });
        }
    }//GEN-LAST:event_btnHDActionPerformed

    private void btnCTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTHDActionPerformed
        // TODO add your handling code here:
        int index1 = tabChuongTrinh.indexOfTab("Quản Lý Chi Tiết Hoá Đơn");
        if (index1 > 0) {
            tabChuongTrinh.remove(index1);
        } else {

            TabCTHD nv = new TabCTHD();

            tabChuongTrinh.add(nv, "Quản Lý Chi Tiết Hoá Đơn");

            int index = tabChuongTrinh.indexOfTab("Quản Lý Chi Tiết Hoá Đơn");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            JLabel lblTitle = new JLabel("Quản Lý Chi Tiết Hoá Đơn");
            JButton btnClose = new JButton("x");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            tabChuongTrinh.setTabComponentAt(index, pnlTab);
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(index);
                    tabChuongTrinh.remove(index);
                }
            });
        }
    }//GEN-LAST:event_btnCTHDActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:
        int rs = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất không!!! ",
                "Xác nhận thoát", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (rs == JOptionPane.YES_OPTION) {
            JOptionPane.showConfirmDialog(this, "Vui lòng đợi trong giây lất !!!!");
            frmLogin DN = new frmLogin();
            DN.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_mnExitActionPerformed

    private void btnNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCCActionPerformed
        // TODO add your handling code here:
         int index1 = tabChuongTrinh.indexOfTab("Nhà Cung Cấp");
        if (index1 > 0) {
            tabChuongTrinh.remove(index1);
        } else {

            TabNhaCungCap nv = new TabNhaCungCap();

            tabChuongTrinh.add(nv, "Nhà Cung Cấp");

            int index = tabChuongTrinh.indexOfTab("Nhà Cung Cấp");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            JLabel lblTitle = new JLabel("Nhà Cung Cấp");
            JButton btnClose = new JButton("x");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            tabChuongTrinh.setTabComponentAt(index, pnlTab);
            btnClose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(index);
                    tabChuongTrinh.remove(index);
                }
            });
        }
        
    }//GEN-LAST:event_btnNhaCCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTHD;
    private javax.swing.JButton btnHD;
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnNhaCC;
    private javax.swing.JButton btnSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblThoiGian;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JTabbedPane tabChuongTrinh;
    // End of variables declaration//GEN-END:variables
}