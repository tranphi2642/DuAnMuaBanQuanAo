package com.unknownshop.form.user;

import com.unknownshop.form.*;
import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XPanel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.text.JTextComponent;

public class DialogSignIn extends javax.swing.JFrame {

    private UserDAO dao = new UserDAO();
    private String user = "";
    private String pass = "";
    public DialogSignIn() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.unknownshop.swing.RoundPanel();
        roundPanel1 = new com.unknownshop.swing.RoundPanel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new com.unknownshop.swing.textfield.TextField();
        txtPassword = new com.unknownshop.swing.textfield.PasswordField();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorUsername = new javax.swing.JLabel();
        lblIconUsername = new javax.swing.JLabel();
        lblIconPassword = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        lblQuenMK = new javax.swing.JLabel();
        btnQRCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel2.setBackground(new java.awt.Color(0, 102, 204));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnClose.setBackground(new java.awt.Color(255, 0, 51));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Nhập");

        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setLabelText("Tên Tài Khoản");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setLabelText("Mật Khẩu");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorPassword.setText("Error!");

        lblErrorUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorUsername.setText("Error!");

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        btnDangNhap.setBackground(new java.awt.Color(0, 102, 204));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(51, 51, 51));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setContentAreaFilled(false);
        btnDangNhap.setOpaque(true);
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseExited(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lblQuenMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuenMK.setForeground(new java.awt.Color(255, 255, 255));
        lblQuenMK.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblQuenMK.setText("Quên mật khẩu?");
        lblQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseExited(evt);
            }
        });

        btnQRCode.setBackground(new java.awt.Color(0, 102, 204));
        btnQRCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQRCode.setForeground(new java.awt.Color(51, 51, 51));
        btnQRCode.setText("QR Code");
        btnQRCode.setContentAreaFilled(false);
        btnQRCode.setOpaque(true);
        btnQRCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQRCodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQRCodeMouseExited(evt);
            }
        });
        btnQRCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                            .addComponent(btnQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblQuenMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblErrorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblErrorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuenMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnClose">
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        XPanel.mainForm.setEnabled(true);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus Password">
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().trim().length()==0){
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }else{
            lblErrorPassword.setText(" ");
        }
    }//GEN-LAST:event_txtPasswordFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDangNhap">
    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        XHover.enterButton(btnDangNhap, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDangNhapMouseEntered

    private void btnDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseExited
        XHover.exitButton(btnDangNhap);
    }//GEN-LAST:event_btnDangNhapMouseExited

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        signIn();
    }//GEN-LAST:event_btnDangNhapActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event Focus txtUsername">
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if(txtUsername.getText().trim().length()==0){
            lblErrorUsername.setText("Chưa nhập tên tài khoản!");
        }else{
            lblErrorUsername.setText(" ");
        }
    }//GEN-LAST:event_txtUsernameFocusLost
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event giới hạn kí tự textfield">
    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        limitLength(txtUsername, 50, evt);
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        limitLength(txtPassword, 50, evt);
    }//GEN-LAST:event_txtPasswordKeyTyped
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event lblQuenMK">
    private void lblQuenMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseClicked
        new DialogForgotPassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblQuenMKMouseClicked

    private void lblQuenMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseEntered
        lblQuenMK.setBackground(XConstant.WHITE_255);
        lblQuenMK.setForeground(XConstant.BLACK_51);
    }//GEN-LAST:event_lblQuenMKMouseEntered

    private void lblQuenMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMKMouseExited
        lblQuenMK.setBackground(XConstant.BLACK_51);
        lblQuenMK.setForeground(XConstant.WHITE_255);
    }//GEN-LAST:event_lblQuenMKMouseExited
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event lbtnQRCode">
    private void btnQRCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRCodeActionPerformed
        GetQR qr = new GetQR(this,user,pass);
        qr.setVisible(true);
    }//GEN-LAST:event_btnQRCodeActionPerformed

    private void btnQRCodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQRCodeMouseEntered
        XHover.enterButton(btnQRCode, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnQRCodeMouseEntered

    private void btnQRCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQRCodeMouseExited
        XHover.exitButton(btnQRCode);
    }//GEN-LAST:event_btnQRCodeMouseExited
    // </editor-fold> 
    
// -------------------- End Event --------------------
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnQRCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconUsername;
    private javax.swing.JLabel lblQuenMK;
    private com.unknownshop.swing.RoundPanel roundPanel1;
    private com.unknownshop.swing.RoundPanel roundPanel2;
    private com.unknownshop.swing.textfield.PasswordField txtPassword;
    private com.unknownshop.swing.textfield.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        setBackground(new Color(0,0,0,0));
        clearError();
        
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lỗi"> 
    private void clearError() {
        lblErrorPassword.setText("  ");
        lblErrorUsername.setText("  ");
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng nhập">    
    private void signIn() {
        nonError();
        if(!(lblErrorUsername.getText().equals(" ") && 
                lblErrorPassword.getText().equals(" "))) return;
        String tk = txtUsername.getText();
        String matKhau = txtPassword.getText();
        Users user = new Users();
        // Tạo luồng và hiện dialog loading
        DialogLoading dlog = new DialogLoading();
        dlog.setVisible(true);
        new Thread(){
            @Override
            public void run(){
                setEnabled(false);
                // Tải thông tin tài khoản lên form
                int check = dao.signIn(tk, matKhau, user);
                if(check == -1){
                    setEnabled(true);
                    dlog.setVisible(false);
                    lblErrorUsername.setText("Tài khoản không tồn tại!");
                    txtUsername.requestFocus();
                }else if(check == 0){
                    setEnabled(true);
                    dlog.setVisible(false);
                    lblErrorPassword.setText("Sai mật khẩu!");
                    txtPassword.requestFocus();
                }else{
                    Auth.user = user;
                    XPanel.panelHeader.setSign();
                    XPanel.panelTaiKhoan.removeAll();
                    XPanel.panelTaiKhoan.add(new PanelAccount());
                    if(XPanel.nameCard.equals("GioHang")){
                        XPanel.panelCart.removeAll();
                        XPanel.panelCart.add(new PanelCart());
                        XPanel.panelCart.repaint();
                        XPanel.panelCart.revalidate();
                    }
                    clearError();
                    XPanel.mainForm.setEnabled(true);
                    dlog.setVisible(false);
                    dispose();
                }
            }
        }.start();
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức bắt lỗi chưa nhập"> 
    private void nonError(){
        if(lblErrorUsername.getText().equals("  ")){
            lblErrorUsername.setText("Chưa nhập tên tài khoản!");
        }  
        if(lblErrorPassword.getText().equals("  ")){
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức giới hạn kí tự nhập vào">
    private void limitLength(JTextComponent txt, int length, KeyEvent evt){
        boolean limited = txt.getText().length() == length;
        if (limited){
            evt.consume();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng nhập tự động sau khi quét QR code">
    public void setInfo(String user, String pass){
        txtUsername.setText(user);
        txtPassword.setText(pass);
        lblErrorUsername.setText(" ");
        lblErrorPassword.setText(" ");
        signIn();
    }
    // </editor-fold >
    
// ---------------------- End Method ----------------------
}
