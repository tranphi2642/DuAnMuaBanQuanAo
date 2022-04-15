package com.unknownshop.fragment.menu;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MenuUserLayout extends javax.swing.JPanel {

    private boolean show;
    private float alpha;

    public MenuUserLayout() {
        initComponents();
        setOpaque(false);
        setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu2 = new com.unknownshop.fragment.menu.MenuUser();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="Override paintComponent"> 
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setColor(new Color(150, 150, 150));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
        super.paintComponent(grphcs);
    }
    // </editor-fold> 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unknownshop.fragment.menu.MenuUser menu2;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra menu có hiển thị không">
    public boolean isShow() {
        return show;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xét ẩn/ hiện menu"> 
    public void setShow(boolean show) {
        this.show = show;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy alpha"> 
    public float getAlpha() {
        return alpha;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xét alpha"> 
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }
    // </editor-fold> 
    
// ---------------------- End Method ----------------------
}
