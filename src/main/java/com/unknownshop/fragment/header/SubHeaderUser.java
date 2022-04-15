package com.unknownshop.fragment.header;

import com.unknownshop.constant.XConstant;
import com.unknownshop.form.user.PanelCart;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XPanel;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class SubHeaderUser extends javax.swing.JPanel {
    
    public SubHeaderUser() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTaiKhoan = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        lblChao = new javax.swing.JLabel();
        lblAvatar = new com.unknownshop.swing.ImageAvatar();

        setBackground(new java.awt.Color(240, 240, 240));

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
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(lblChao, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblChao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
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
    
// ---------------------- End Event ----------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnTaiKhoan;
    private com.unknownshop.swing.ImageAvatar lblAvatar;
    private javax.swing.JLabel lblChao;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo form">
    private void init(){
        lblChao.setText("Xin chào "+Auth.getName());
        lblAvatar.setIcon(new ImageIcon(XImage.convertBytesToImage(Auth.user.getImgUrl(),40,30)));
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel tài khoản">
    private void account(){
        CardLayout card = (CardLayout)XPanel.panelCardUser.getLayout();
        card.show(XPanel.panelCardUser, "TaiKhoan");
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đăng xuất">
    private void signOut(){
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
    // </editor-fold>
    
// ----------------------  End Method  ----------------------
}
