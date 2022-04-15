package com.unknownshop.fragment.product;

import com.unknownshop.constant.XConstant;
import com.unknownshop.entity.Products;
import com.unknownshop.util.XCart;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XMoney;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import javax.swing.JButton;

public class ProductCardDescription extends javax.swing.JPanel {

    Products product;
    int quantity;
    
    public ProductCardDescription(Products pro) {
        initComponents();
        this.product = pro;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        btnMua = new javax.swing.JButton();

        setOpaque(false);

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Title");
        lblName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Số lượng: ");

        lblSL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSL.setForeground(new java.awt.Color(255, 255, 255));
        lblSL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSL.setText("15");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Giá:");

        lblGia.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGia.setText("15.000.000 VNĐ");

        btnMua.setBackground(new java.awt.Color(0, 102, 204));
        btnMua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMua.setForeground(new java.awt.Color(255, 255, 255));
        btnMua.setText("Thêm vào giỏ hàng");
        btnMua.setContentAreaFilled(false);
        btnMua.setOpaque(true);
        btnMua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMuaMouseExited(evt);
            }
        });
        btnMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnMua, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnMua">
    private void btnMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuaActionPerformed
        buyProduct();
    }//GEN-LAST:event_btnMuaActionPerformed

    private void btnMuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuaMouseEntered
        XHover.enterButton(btnMua, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnMuaMouseEntered

    private void btnMuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuaMouseExited
        XHover.exitButton(btnMua);
    }//GEN-LAST:event_btnMuaMouseExited
    // </editor-fold>
    
// ---------------------- End Event ----------------------
     
    // <editor-fold defaultstate="collapsed" desc="Override paintChilren"> 
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(51, 51, 51, 220));
        Path2D.Float f = new Path2D.Float();
        f.moveTo(0, 30);
        f.curveTo(50, 0, 100, 40, 250, 20);
        f.lineTo(250, getHeight());
        f.lineTo(0, getHeight());
        g2.fill(f);
        super.paintComponent(grphcs);
    }
    // </editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSL;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo form">
    private void init() {
        lblName.setText(product.getName());
        lblSL.setText(product.getQuantity()+"");
        lblGia.setText(XMoney.convertMoney(product.getPrice())+" VNĐ");
        quantity = product.getQuantity();
        if(quantity == 0){
            XHover.disableButton(btnMua);
            btnMua.setText("Hết hàng");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy btnMua">
    public JButton getBtn(){
        return btnMua;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức mua sản phẩm">
    private void buyProduct() {
        XCart.addProduct(product.getId(), product);
        lblSL.setText(--quantity + "");
        XMess.alert(null, "Thêm vào giỏ hàng thành công!");
        if(quantity == 0){
            XHover.disableButton(btnMua);
            btnMua.setText("Hết hàng");
        }
        
    }
    // </editor-fold>

// ---------------------- End Method ----------------------
}
