package com.unknownshop.form.user;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XMail;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class DialogSignUp extends javax.swing.JFrame {
    
    private byte[] userImg;
    private UserDAO dao = new UserDAO();
    
    public DialogSignUp() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        roundPanel2 = new com.unknownshop.swing.RoundPanel();
        roundPanel1 = new com.unknownshop.swing.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new com.unknownshop.swing.RoundLabel();
        btnGetImage = new javax.swing.JButton();
        txtUsername = new com.unknownshop.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        lblIconUsername = new javax.swing.JLabel();
        lblErrorUsername = new javax.swing.JLabel();
        txtPassword = new com.unknownshop.swing.textfield.PasswordField();
        lblIconPassword = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        txtRePassword = new com.unknownshop.swing.textfield.PasswordField();
        lblIconPassword1 = new javax.swing.JLabel();
        txtFullname = new com.unknownshop.swing.textfield.TextField();
        lblErrorFullname = new javax.swing.JLabel();
        lblIconFullname = new javax.swing.JLabel();
        txtEmail = new com.unknownshop.swing.textfield.TextField();
        lblIconFullname1 = new javax.swing.JLabel();
        lblErrorRePassword = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnChange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel2.setBackground(new java.awt.Color(0, 102, 204));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setOpaque(false);

        lblImage.setBackground(new java.awt.Color(51, 51, 51));
        lblImage.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 204)));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noImage.jpg"))); // NOI18N
        lblImage.setToolTipText("none");
        lblImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblImage.setOpaque(true);

        btnGetImage.setBackground(new java.awt.Color(0, 102, 204));
        btnGetImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGetImage.setForeground(new java.awt.Color(51, 51, 51));
        btnGetImage.setText("Tải Ảnh Lên");
        btnGetImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGetImage, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGetImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tài Khoản Người Dùng");

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUsername.png"))); // NOI18N

        lblErrorUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorUsername.setText("Error!");

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

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorPassword.setText("Error!");

        txtRePassword.setBackground(new java.awt.Color(51, 51, 51));
        txtRePassword.setForeground(new java.awt.Color(255, 255, 255));
        txtRePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRePassword.setLabelText("Nhập Lại Mật Khẩu");
        txtRePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusLost(evt);
            }
        });

        lblIconPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPassword.png"))); // NOI18N

        txtFullname.setBackground(new java.awt.Color(51, 51, 51));
        txtFullname.setForeground(new java.awt.Color(255, 255, 255));
        txtFullname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFullname.setLabelText("Họ Và Tên");
        txtFullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullnameFocusLost(evt);
            }
        });

        lblErrorFullname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorFullname.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorFullname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorFullname.setText("Error!");

        lblIconFullname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconName.png"))); // NOI18N

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setLabelText("Email");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblIconFullname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconName.png"))); // NOI18N

        lblErrorRePassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorRePassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorRePassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorRePassword.setText("Error!");

        lblErrorEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorEmail.setText("Error!");

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

        jPanel2.setOpaque(false);

        btnChange.setBackground(new java.awt.Color(0, 102, 204));
        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChange.setForeground(new java.awt.Color(51, 51, 51));
        btnChange.setText("Đăng Kí");
        btnChange.setContentAreaFilled(false);
        btnChange.setOpaque(true);
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangeMouseExited(evt);
            }
        });
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblErrorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(lblIconFullname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel1Layout.createSequentialGroup()
                                    .addComponent(lblIconFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblErrorFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(roundPanel1Layout.createSequentialGroup()
                                    .addComponent(lblIconPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblErrorRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblErrorUsername))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblIconFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblErrorFullname)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIconPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorPassword)
                            .addComponent(lblErrorRePassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconFullname1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorEmail))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnClose">
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        XPanel.mainForm.setEnabled(true);
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnGetImage">
    private void btnGetImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetImageActionPerformed
        getImage();
    }//GEN-LAST:event_btnGetImageActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Username">
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if(txtUsername.getText().trim().length()==0){
            lblErrorUsername.setText("Chưa nhập tên tài khoản!");
        }else{
            lblErrorUsername.setText(" ");
        }
    }//GEN-LAST:event_txtUsernameFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Fullname">
    private void txtFullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameFocusGained

    private void txtFullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullnameFocusLost
        String pattern = "^([^[!@#$%&*()_+=|<>?{}\\[\\]~-]|^\\d|^\\s]*\\s?)*$";
        if(txtFullname.getText().trim().length()==0){
            lblErrorFullname.setText("Chưa nhập họ tên!");
        }else{
            if(txtFullname.getText().matches(pattern)==false){
                lblErrorFullname.setText("Tên không được chứa số hoặc ký tự đặc biệt!");
            }else{
                lblErrorFullname.setText(" ");
            }
        }
    }//GEN-LAST:event_txtFullnameFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Password">
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().trim().length()==0){
            lblErrorPassword.setText("Chưa nhập mật khẩu!");
        }else{
            lblErrorPassword.setText(" ");
            if(txtRePassword.getText().trim().length() != 0){
                txtRePasswordFocusLost(evt);
            }
        }
    }//GEN-LAST:event_txtPasswordFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi RePassword">
    private void txtRePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordFocusGained

    private void txtRePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusLost
        if(txtRePassword.getText().trim().length()==0){
            lblErrorRePassword.setText("Chưa nhập lại mật khẩu!");
        }else if(!txtRePassword.getText().equals(txtPassword.getText())){
            lblErrorRePassword.setText("Mật khẩu nhập lại không trùng khớp!");
        }else{
             lblErrorRePassword.setText(" ");
        }
    }//GEN-LAST:event_txtRePasswordFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus bắt lỗi Email">
    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String pattern = "\\w+\\@\\w+(\\.\\w+)+";
        if(txtEmail.getText().trim().length()==0){
            lblErrorEmail.setText("Chưa nhập Email!");
        }else{
           if(txtEmail.getText().matches(pattern) == false){
                lblErrorEmail.setText("Email không đúng định dạng");
            }else{
                lblErrorEmail.setText(" ");
            }
        }
    }//GEN-LAST:event_txtEmailFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDangKi">
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        signUp();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseEntered
        XHover.enterButton(btnChange, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnChangeMouseEntered

    private void btnChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseExited
        XHover.exitButton(btnChange);
    }//GEN-LAST:event_btnChangeMouseExited

   // </editor-fold> 
    
// -------------------- End Event --------------------
    
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
            java.util.logging.Logger.getLogger(DialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGetImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFullname;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorRePassword;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblIconFullname;
    private javax.swing.JLabel lblIconFullname1;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconPassword1;
    private javax.swing.JLabel lblIconUsername;
    private com.unknownshop.swing.RoundLabel lblImage;
    private com.unknownshop.swing.RoundPanel roundPanel1;
    private com.unknownshop.swing.RoundPanel roundPanel2;
    private com.unknownshop.swing.textfield.TextField txtEmail;
    private com.unknownshop.swing.textfield.TextField txtFullname;
    private com.unknownshop.swing.textfield.PasswordField txtPassword;
    private com.unknownshop.swing.textfield.PasswordField txtRePassword;
    private com.unknownshop.swing.textfield.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------

    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        this.clearError();
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng ký tài khoản">    
    private void signUp() {
        nonError();
        if(checkError()) return;
        Users u = getForm();
        // Tạo luồng và hiện dialog loading
        DialogLoading dlog = new DialogLoading();
        dlog.setVisible(true);
        new Thread(){
            @Override
            public void run(){
                setEnabled(false);
                int result = dao.insert(u);
                if( result == 0){
                    setEnabled(true);
                    dlog.setVisible(false);
                    lblErrorUsername.setText("Tài khoản này đã có trong hệ thống!");
                    txtUsername.requestFocus();
                }else if(result == -1){
                    setEnabled(true);
                    dlog.setVisible(false);
                    lblErrorEmail.setText("Email đã được sử dụng!");
                    txtEmail.requestFocus();
                }else{
                       try {
                        String data = txtUsername.getText() + "+" + txtPassword.getText();
                        QRCodeWriter qrCodeWriter = new QRCodeWriter();
                        BitMatrix matrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 200, 200);
                        String outputFile = "./qr_code.png";
                        Path path = (Path) FileSystems.getDefault().getPath(outputFile);
                        MatrixToImageWriter.writeToPath(matrix, "PNG", (java.nio.file.Path) path);
                    } catch (WriterException ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    XMail.sendQRCode(txtEmail.getText());
                    clearForm();
                    XPanel.mainForm.setEnabled(true);
                    dlog.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Đăng kí tài khoản thành công!");
                    dispose();
                }
            }
        }.start();
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra lỗi"> 
    private boolean checkError(){
        if(!(lblErrorEmail.getText().equals(" ") &&
                lblErrorFullname.getText().equals(" ") &&  
                lblErrorPassword.getText().equals(" ") &&
                lblErrorRePassword.getText().equals(" ") &&
                lblErrorUsername.getText().equals(" "))) return true;
        else if(lblImage.getToolTipText().equals("none")){
            XMess.alert(this, "Bạn chưa chọn ảnh đại diện!");
            return true;
        }
        return false;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy thông tin trên form"> 
    private Users getForm(){
        Users user = new Users();
        user.setUsername(txtUsername.getText());
        user.setPassword(txtPassword.getText());
        user.setFullname(txtFullname.getText());
        user.setEmail(txtEmail.getText());
        user.setImgUrl(userImg);
        user.setRole(XConstant.CUSTOMER);
        return user;
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lable lỗi"> 
    private void clearError() {
        lblErrorPassword.setText("  ");
        lblErrorUsername.setText("  ");
        lblErrorEmail.setText("  ");
        lblErrorFullname.setText("  ");
        lblErrorRePassword.setText("  ");
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa textfield"> 
    private void clearForm() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        txtFullname.setText("");
        txtEmail.setText("");
        lblImage.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/noImage.jpg"))
                            .getImage().getScaledInstance(180, 240, Image.SCALE_SMOOTH)));
        lblImage.setToolTipText("none");
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
        if(lblErrorRePassword.getText().equals("  ")){
            lblErrorRePassword.setText("Chưa nhập lại mật khẩu!");
        }
        if(lblErrorEmail.getText().equals("  ")){
            lblErrorEmail.setText("Chưa nhập email!");
        }
        if(lblErrorFullname.getText().equals("  ")){
            lblErrorFullname.setText("Chưa nhập tên ngươi dùng!");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy ảnh"> 
    private void getImage() {
        boolean check = XMess.confirm(this, "Lấy ảnh qua webcame?");
        if (check == false) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = fileChooser.getSelectedFile();
                    userImg = XImage.convertImageToBytes(file);
                    ImageIcon icon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().
                            getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
                    lblImage.setIcon(icon);
                    lblImage.setToolTipText("");
                } catch (Exception ex) {
                }
            }
        } else {
            new TakePicture(this, lblImage).setVisible(true);
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
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy ảnh"> 
    public void setIcon(Image image, byte[] byteImg) {
        ImageIcon icon = new ImageIcon(new ImageIcon(image).getImage().
                getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
        lblImage.setIcon(icon);
        lblImage.setText(""); 
        userImg = byteImg;
    }
    // </editor-fold>    
    
// ---------------------- End Method ----------------------

}
