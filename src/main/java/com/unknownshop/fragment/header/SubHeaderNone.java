package com.unknownshop.fragment.header;

import com.unknownshop.constant.XConstant;
import com.unknownshop.form.user.DialogSignIn;
import com.unknownshop.form.user.DialogSignUp;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XPanel;

public class SubHeaderNone extends javax.swing.JPanel {
    
    public SubHeaderNone() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 240, 240));

        btnDangNhap.setBackground(new java.awt.Color(240, 240, 240));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(51, 51, 51));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setToolTipText("DangNhap");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(51, 51, 51)));
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

        btnDangKy.setBackground(new java.awt.Color(240, 240, 240));
        btnDangKy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(51, 51, 51));
        btnDangKy.setText("Đăng ký");
        btnDangKy.setToolTipText("DangKy");
        btnDangKy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(51, 51, 51)));
        btnDangKy.setContentAreaFilled(false);
        btnDangKy.setOpaque(true);
        btnDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangKyMouseExited(evt);
            }
        });
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(654, Short.MAX_VALUE)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(btnDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDangNhap">
    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        XHover.enterButton(btnDangNhap, XConstant.BLACK_102, XConstant.WHITE_240);
    }//GEN-LAST:event_btnDangNhapMouseEntered

    private void btnDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseExited
        XHover.exitButton(btnDangNhap);
    }//GEN-LAST:event_btnDangNhapMouseExited

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        showPanel(btnDangNhap.getToolTipText());
    }//GEN-LAST:event_btnDangNhapActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnDangKi">
    private void btnDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMouseEntered
        XHover.enterButton(btnDangKy, XConstant.BLACK_102, XConstant.WHITE_240);
    }//GEN-LAST:event_btnDangKyMouseEntered

    private void btnDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMouseExited
        XHover.exitButton(btnDangKy);
    }//GEN-LAST:event_btnDangKyMouseExited

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        showPanel(btnDangKy.getToolTipText());
    }//GEN-LAST:event_btnDangKyActionPerformed
    // </editor-fold>
    
// ---------------------- End Event ----------------------
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel trên form">    
    private void showPanel(String name){
        if(name.equals("DangNhap")){
            XPanel.mainForm.setEnabled(false);
            new DialogSignIn().setVisible(true);
        }else{
            XPanel.mainForm.setEnabled(false);
            new DialogSignUp().setVisible(true);
        }
    } 
    // </editor-fold> 
    
// ----------------------  End Method  ----------------------
}
