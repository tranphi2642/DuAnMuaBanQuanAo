package com.unknownshop.form;

import com.unknownshop.constant.XConstant;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XPanel;
import javax.swing.ImageIcon;

public class PanelAccount extends javax.swing.JPanel {

    public PanelAccount() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.unknownshop.swing.RoundPanel();
        lblHinh = new com.unknownshop.swing.ImageAvatar();
        roundPanel2 = new com.unknownshop.swing.RoundPanel();
        roundLabel1 = new com.unknownshop.swing.RoundLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnChinhSua = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(220, 220, 220));
        roundPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHinh.setBorderSize(3);
        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.jpg"))); // NOI18N
        roundPanel1.add(lblHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, 160));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));

        roundLabel1.setBackground(new java.awt.Color(51, 51, 51));
        roundLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundAccount.jpg"))); // NOI18N
        roundLabel1.setText("roundLabel1");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, Short.MAX_VALUE)
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        roundPanel1.add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Họ và tên:");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Tên tài khoản:");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mật khẩu:");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Vai trò:");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email:");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 140, -1));

        lblVaiTro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(51, 51, 51));
        lblVaiTro.setText("Admin");
        roundPanel1.add(lblVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 280, -1));

        lblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(51, 51, 51));
        lblTaiKhoan.setText("thangnnc123");
        roundPanel1.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 280, -1));

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(51, 51, 51));
        lblHoTen.setText("Nguyễn Nhật Cao Thăng");
        roundPanel1.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 280, -1));

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(51, 51, 51));
        lblMatKhau.setText("*************");
        roundPanel1.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 280, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 51));
        lblEmail.setText("thangnnc123@gmail.com");
        roundPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 280, -1));

        btnChinhSua.setBackground(new java.awt.Color(51, 51, 51));
        btnChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChinhSua.setForeground(new java.awt.Color(255, 255, 255));
        btnChinhSua.setText("Chỉnh sửa thông tin");
        btnChinhSua.setContentAreaFilled(false);
        btnChinhSua.setOpaque(true);
        btnChinhSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChinhSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChinhSuaMouseExited(evt);
            }
        });
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });
        roundPanel1.add(btnChinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 422, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnChinhSua">  
    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed
        XPanel.mainForm.setEnabled(false);
        new DialogReSignIn().setVisible(true);
    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnChinhSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSuaMouseEntered
        XHover.enterButton(btnChinhSua, XConstant.LIGHT_BLUE, XConstant.WHITE_255);
    }//GEN-LAST:event_btnChinhSuaMouseEntered

    private void btnChinhSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSuaMouseExited
        XHover.exitButton(btnChinhSua);
    }//GEN-LAST:event_btnChinhSuaMouseExited
    // </editor-fold>
    
// ---------------------- End Event ----------------------


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEmail;
    private com.unknownshop.swing.ImageAvatar lblHinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblVaiTro;
    private com.unknownshop.swing.RoundLabel roundLabel1;
    private com.unknownshop.swing.RoundPanel roundPanel1;
    private com.unknownshop.swing.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        lblTaiKhoan.setText(Auth.user.getUsername());
        lblHoTen.setText(Auth.user.getFullname());
        lblEmail.setText(Auth.user.getEmail());
        lblVaiTro.setText(Auth.user.getRole());
        if(Auth.user.getImgUrl() == null) return;
        lblHinh.setIcon(new ImageIcon(Auth.user.getImgUrl()));
    }
    // </editor-fold> 
    
// ----------------------  End Method  ----------------------
}
