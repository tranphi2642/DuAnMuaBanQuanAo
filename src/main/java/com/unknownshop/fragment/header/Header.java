package com.unknownshop.fragment.header;

import com.unknownshop.constant.XConstant;
import com.unknownshop.swing.shadow.ShadowRenderer;
import com.unknownshop.util.Auth;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Header extends javax.swing.JPanel {

    private int x;
    private int y;
    
    public Header() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenu = new com.unknownshop.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        pnlSignIn = new javax.swing.JPanel();
        headerNone1 = new com.unknownshop.fragment.header.SubHeaderNone();

        setBackground(new java.awt.Color(240, 240, 240));

        cmdMenu.setBackground(new java.awt.Color(240, 240, 240));
        cmdMenu.setForeground(new java.awt.Color(51, 51, 51));
        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("   UNKNOWN SHOP");

        pnlSignIn.setOpaque(false);
        pnlSignIn.setLayout(new java.awt.GridLayout(1, 0));
        pnlSignIn.add(headerNone1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSignIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="Override paintComponent">
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        int width = getWidth();
        int height = getHeight() - 6;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
        grphcs.drawImage(new ShadowRenderer(3, 0.3f, Color.GRAY).createShadow(img), -3, 0, null);
        grphcs.drawImage(img, 0, 0, null);
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unknownshop.swing.Button cmdMenu;
    private com.unknownshop.fragment.header.SubHeaderNone headerNone1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlSignIn;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức thêm sự kiện vào header">
    public void addEventMenu(ActionListener event) {
        cmdMenu.addActionListener(event);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel trên form">    
    public void setSign(){
        pnlSignIn.removeAll();
        if(Auth.user == null){
            pnlSignIn.add(new SubHeaderNone());
        }else if(Auth.user.getRole().equals(XConstant.CUSTOMER)){
            pnlSignIn.add(new SubHeaderUser());
        }else pnlSignIn.add(new SubHeaderAdmin());
        pnlSignIn.repaint();
        pnlSignIn.revalidate();
    } 
    // </editor-fold> 
    
// ----------------------  End Method  ----------------------
}
