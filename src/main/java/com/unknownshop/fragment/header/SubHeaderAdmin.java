package com.unknownshop.fragment.header;

import com.unknownshop.constant.XConstant;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.form.user.PanelCart;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class SubHeaderAdmin extends javax.swing.JPanel {
    
    public SubHeaderAdmin() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangXuat = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        btnQuanLy = new javax.swing.JButton();
        lblChao = new javax.swing.JLabel();
        lblAvatar = new com.unknownshop.swing.ImageAvatar();

        setBackground(new java.awt.Color(240, 240, 240));

        btnDangXuat.setBackground(new java.awt.Color(240, 240, 240));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(51, 51, 51));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(51, 51, 51)));
        btnDangXuat.setContentAreaFilled(false);
        btnDangXuat.setOpaque(true);
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseExited(evt);
            }
        });
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnTaiKhoan.setBackground(new java.awt.Color(240, 240, 240));
        btnTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiKhoan.setForeground(new java.awt.Color(51, 51, 51));
        btnTaiKhoan.setText("Tài Khoản");
        btnTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(51, 51, 51)));
        btnTaiKhoan.setContentAreaFilled(false);
        btnTaiKhoan.setOpaque(true);
        btnTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTaiKhoanMouseExited(evt);
            }
        });
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        btnQuanLy.setBackground(new java.awt.Color(240, 240, 240));
        btnQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLy.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLy.setText("Quản lý");
        btnQuanLy.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(51, 51, 51)));
        btnQuanLy.setContentAreaFilled(false);
        btnQuanLy.setOpaque(true);
        btnQuanLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyMouseExited(evt);
            }
        });
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });

        lblChao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblChao.setForeground(new java.awt.Color(51, 51, 51));
        lblChao.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblChao.setText("Xin chào, Thăng");

        lblAvatar.setBorderSize(2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(lblChao, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblChao, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(btnQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(lblAvatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDangXuat">
    private void btnDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseEntered
        XHover.enterButton(btnDangXuat, XConstant.BLACK_102, XConstant.WHITE_240);
    }//GEN-LAST:event_btnDangXuatMouseEntered

    private void btnDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseExited
        XHover.exitButton(btnDangXuat);
    }//GEN-LAST:event_btnDangXuatMouseExited

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        signOut();
    }//GEN-LAST:event_btnDangXuatActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnTaiKhoan">
    private void btnTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiKhoanMouseEntered
        XHover.enterButton(btnTaiKhoan, XConstant.BLACK_102, XConstant.WHITE_240);
    }//GEN-LAST:event_btnTaiKhoanMouseEntered

    private void btnTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaiKhoanMouseExited
        XHover.exitButton(btnTaiKhoan);
    }//GEN-LAST:event_btnTaiKhoanMouseExited

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        account();
    }//GEN-LAST:event_btnTaiKhoanActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnQuanLy">
    private void btnQuanLyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyMouseEntered
        XHover.enterButton(btnQuanLy, XConstant.BLACK_102, XConstant.WHITE_240);
    }//GEN-LAST:event_btnQuanLyMouseEntered

    private void btnQuanLyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyMouseExited
        XHover.exitButton(btnQuanLy);
    }//GEN-LAST:event_btnQuanLyMouseExited

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        changeForm();
    }//GEN-LAST:event_btnQuanLyActionPerformed
    // </editor-fold>
    
// ---------------------- End Event ----------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnQuanLy;
    private javax.swing.JButton btnTaiKhoan;
    private com.unknownshop.swing.ImageAvatar lblAvatar;
    private javax.swing.JLabel lblChao;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo form">
    private void init(){
        lblChao.setText("Xin chào "+Auth.getName());
        lblAvatar.setIcon(new ImageIcon(XImage.convertBytesToImage(Auth.user.getImgUrl(),40,30)));
        if(!Auth.check) btnQuanLy.setText("Quản lý");
        else btnQuanLy.setText("Cửa hàng");
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển form">
    private void changeForm(){
        if(XMess.confirm(null, "Bạn có muốn chuyển sang form "
                        + (!Auth.check ? "quản lý?" : "cửa hàng?"))){
            if(!Auth.check){
                new Thread(){
                    @Override
                    public void run(){
                        DialogLoading dlog = new DialogLoading();
                        dlog.setVisible(true);
                        Auth.check = true;
                        XPanel.mainForm.setEnabled(false);
                        XPanel.mainForm.fillHomeAdmin();
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                    }
                }.start();
            }else{
                new Thread(){
                    @Override
                    public void run(){
                        DialogLoading dlog = new DialogLoading();
                        dlog.setVisible(true);
                        Auth.check = false;
                        XPanel.mainForm.setEnabled(false);
                        XPanel.mainForm.fillHomeUser();
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                    }
                }.start();
            }
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel tài khoản">
    private void account(){
        if(Auth.check == true){
            CardLayout card = (CardLayout)XPanel.panelCardAdmin.getLayout();
            card.show(XPanel.panelCardAdmin, "TaiKhoan");
        }else{
            CardLayout card = (CardLayout)XPanel.panelCardUser.getLayout();
            card.show(XPanel.panelCardUser, "TaiKhoan");
        }
        XPanel.nameCard = "TaiKhoan";
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng xuất">
    private void signOut(){
        if(XMess.confirm(null, "Bạn có muốn đăng xuất không?")){
            if(Auth.check){
                new Thread(){
                    @Override
                    public void run(){
                        DialogLoading dlog = new DialogLoading();
                        dlog.setVisible(true);
                        Auth.check = false;
                        XPanel.mainForm.setEnabled(false);
                        XPanel.mainForm.fillHomeUser();
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                    }
                }.start();
            }
            XPanel.panelTaiKhoan.removeAll();
            Auth.clear();
            XPanel.panelHeader.setSign();
            if(XPanel.nameCard.equals("TaiKhoan")){
                XPanel.nameCard = "Home";
            }else if(XPanel.nameCard.equals("GioHang")){
                XPanel.panelCart.removeAll();
                XPanel.panelCart.add(new PanelCart());
            }
            CardLayout card = (CardLayout)XPanel.panelCardUser.getLayout();
            card.show(XPanel.panelCardUser, XPanel.nameCard);
        }
    }
    // </editor-fold>
    
// ----------------------  End Method  ----------------------
}
