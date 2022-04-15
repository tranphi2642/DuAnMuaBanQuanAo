package com.unknownshop.form.user;

import com.unknownshop.constant.XConstant;
import com.unknownshop.util.XMail;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMess;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.text.JTextComponent;

public class DialogForgotPassword extends javax.swing.JFrame {

    private int OTP;
    UserDAO dao = new UserDAO();
    Users user = new Users();
    
    public DialogForgotPassword() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardlayout = new javax.swing.JPanel();
        panelQuenMatKhau = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        btnCheckUser = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        panelResetPass = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtOTP = new javax.swing.JTextField();
        btnCheckOTP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        cardlayout.setLayout(new java.awt.CardLayout());

        panelQuenMatKhau.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("UNKNOW STORE");

        txtTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCheckUser.setBackground(new java.awt.Color(0, 102, 204));
        btnCheckUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckUser.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckUser.setText("Kiểm Tra");
        btnCheckUser.setContentAreaFilled(false);
        btnCheckUser.setOpaque(true);
        btnCheckUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckUserMouseExited(evt);
            }
        });
        btnCheckUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckUserActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tài Khoản:");

        javax.swing.GroupLayout panelQuenMatKhauLayout = new javax.swing.GroupLayout(panelQuenMatKhau);
        panelQuenMatKhau.setLayout(panelQuenMatKhauLayout);
        panelQuenMatKhauLayout.setHorizontalGroup(
            panelQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuenMatKhauLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuenMatKhauLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCheckUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(panelQuenMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQuenMatKhauLayout.setVerticalGroup(
            panelQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuenMatKhauLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCheckUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        cardlayout.add(panelQuenMatKhau, "panelQuenMK");

        panelResetPass.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("UNKNOW STORE");

        txtOTP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOTPKeyReleased(evt);
            }
        });

        btnCheckOTP.setBackground(new java.awt.Color(0, 102, 204));
        btnCheckOTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckOTP.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOTP.setText("Xác Nhận");
        btnCheckOTP.setContentAreaFilled(false);
        btnCheckOTP.setOpaque(true);
        btnCheckOTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckOTPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckOTPMouseExited(evt);
            }
        });
        btnCheckOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOTPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Xác thực OTP");

        javax.swing.GroupLayout panelResetPassLayout = new javax.swing.GroupLayout(panelResetPass);
        panelResetPass.setLayout(panelResetPassLayout);
        panelResetPassLayout.setHorizontalGroup(
            panelResetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPassLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(panelResetPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCheckOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        panelResetPassLayout.setVerticalGroup(
            panelResetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPassLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelResetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCheckOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        cardlayout.add(panelResetPass, "panelResetPass");

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardlayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardlayout, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event xóa kí tự không hợp lệ txtOTP"> 
    private void txtOTPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOTPKeyReleased
        checkChar(txtOTP, "[^0-9]");
    }//GEN-LAST:event_txtOTPKeyReleased
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnClose">
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        new DialogSignIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event DialogForgotPassword">
    private void btnCheckOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOTPActionPerformed
        checkOTP();
    }//GEN-LAST:event_btnCheckOTPActionPerformed

    private void btnCheckOTPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckOTPMouseEntered
        XHover.enterButton(btnCheckOTP, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnCheckOTPMouseEntered

    private void btnCheckOTPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckOTPMouseExited
        XHover.exitButton(btnCheckOTP);
    }//GEN-LAST:event_btnCheckOTPMouseExited
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnCheckUser">
    private void btnCheckUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckUserActionPerformed
        sentOTP();
    }//GEN-LAST:event_btnCheckUserActionPerformed

    private void btnCheckUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckUserMouseEntered
        XHover.enterButton(btnCheckUser, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnCheckUserMouseEntered

    private void btnCheckUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckUserMouseExited
        XHover.exitButton(btnCheckUser);
    }//GEN-LAST:event_btnCheckUserMouseExited
    // </editor-fold>
    
// ---------------------- End Event ----------------------
    
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
            java.util.logging.Logger.getLogger(DialogForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckOTP;
    private javax.swing.JButton btnCheckUser;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel cardlayout;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelQuenMatKhau;
    private javax.swing.JPanel panelResetPass;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form"> 
    private void init(){
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        getContentPane().setBackground(new Color(51,51,51));
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức gửi OTP"> 
    private void sentOTP(){
        if(txtTaiKhoan.getText().trim().length()==0) return;
        if(dao.selectByUserName(txtTaiKhoan.getText(),user) == 0){
             XMess.alert(this, "Tài khoản không tồn tại!");
        }else{
            OTP = (int) Math.round((Math.random()*9999)+1000);
            XMess.alert(this,"Vui lòng kiểm tra email để lấy mã xác thực");
            new Thread() {
                @Override
                public void run() {
                    XMail.sendOTP(user.getEmail(), OTP);
                }
            }.start();
            CardLayout card = (CardLayout) cardlayout.getLayout();
            card.show(cardlayout, "panelResetPass");
        }
    }   
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra mã OTP"> 
    private void checkOTP(){
        if(Integer.parseInt(txtOTP.getText())== OTP){
            XMess.alert(this, "Xác minh thành công! Mật khẩu của bạn sẽ đổi về mật định 123");
            user.setPassword("123");
            dao.update(user);
            new DialogSignIn().setVisible(true);
            this.dispose();
        }else{
            XMess.alert(this, "Sai OTP");
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa kí tự không hợp lệ khi nhập">
    private void checkChar(JTextComponent txt, String pattern){
        txt.setText(txt.getText().replaceAll(pattern, ""));
    }
    // </editor-fold>
 
// ----------------------  End Method  ----------------------
}
