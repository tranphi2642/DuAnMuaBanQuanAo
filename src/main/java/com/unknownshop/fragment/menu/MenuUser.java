package com.unknownshop.fragment.menu;

import com.unknownshop.constant.XConstant;
import com.unknownshop.form.user.PanelCart;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XLabel;
import com.unknownshop.util.XPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuUser extends javax.swing.JPanel {

    public MenuUser() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlMenuGiay = new javax.swing.JPanel();
        btnMenuGiay = new javax.swing.JButton();
        lblMenuGiay = new javax.swing.JLabel();
        pnlMenuPhuKien = new javax.swing.JPanel();
        btnMenuPhuKien = new javax.swing.JButton();
        lblMenuPhuKien = new javax.swing.JLabel();
        pnlMenuQuan = new javax.swing.JPanel();
        btnMenuQuan = new javax.swing.JButton();
        lblMenuQuan = new javax.swing.JLabel();
        pnlMenuAo = new javax.swing.JPanel();
        btnMenuAo = new javax.swing.JButton();
        lblMenuAo = new javax.swing.JLabel();
        pnlMenuDanhSach = new javax.swing.JPanel();
        lblMenuDanhSach = new javax.swing.JLabel();
        pnlMenuHome = new javax.swing.JPanel();
        btnMenuHome = new javax.swing.JButton();
        lblMenuHome = new javax.swing.JLabel();
        pnlCart = new javax.swing.JPanel();
        pnlGioHangTomTat = new javax.swing.JPanel();
        btnGioHang = new javax.swing.JButton();
        lblGioHang = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblGiaGioHang = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(215, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unknown Shop");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 70));

        pnlMenuGiay.setBackground(new java.awt.Color(240, 240, 240));
        pnlMenuGiay.setOpaque(false);
        pnlMenuGiay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuGiay.setContentAreaFilled(false);
        btnMenuGiay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuGiayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuGiayMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuGiayMousePressed(evt);
            }
        });
        pnlMenuGiay.add(btnMenuGiay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblMenuGiay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuGiay.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteGiay.png"))); // NOI18N
        lblMenuGiay.setText("Giày");
        lblMenuGiay.setToolTipText("Giay");
        lblMenuGiay.setIconTextGap(10);
        pnlMenuGiay.add(lblMenuGiay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 205, 33));

        add(pnlMenuGiay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 280, 50));

        pnlMenuPhuKien.setBackground(new java.awt.Color(240, 240, 240));
        pnlMenuPhuKien.setOpaque(false);
        pnlMenuPhuKien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuPhuKien.setContentAreaFilled(false);
        btnMenuPhuKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPhuKienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPhuKienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuPhuKienMousePressed(evt);
            }
        });
        pnlMenuPhuKien.add(btnMenuPhuKien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblMenuPhuKien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuPhuKien.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuPhuKien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhitePhuKien.png"))); // NOI18N
        lblMenuPhuKien.setText("Phụ kiện");
        lblMenuPhuKien.setToolTipText("PhuKien");
        lblMenuPhuKien.setIconTextGap(10);
        pnlMenuPhuKien.add(lblMenuPhuKien, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 205, 33));

        add(pnlMenuPhuKien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 280, 50));

        pnlMenuQuan.setBackground(new java.awt.Color(240, 240, 240));
        pnlMenuQuan.setOpaque(false);
        pnlMenuQuan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuQuan.setContentAreaFilled(false);
        btnMenuQuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuQuanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuQuanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuQuanMousePressed(evt);
            }
        });
        pnlMenuQuan.add(btnMenuQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblMenuQuan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuQuan.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuQuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteQuan.png"))); // NOI18N
        lblMenuQuan.setText("Quần");
        lblMenuQuan.setToolTipText("Quan");
        lblMenuQuan.setIconTextGap(10);
        pnlMenuQuan.add(lblMenuQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 205, 33));

        add(pnlMenuQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 50));

        pnlMenuAo.setBackground(new java.awt.Color(240, 240, 240));
        pnlMenuAo.setOpaque(false);
        pnlMenuAo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuAo.setContentAreaFilled(false);
        btnMenuAo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuAoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuAoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuAoMousePressed(evt);
            }
        });
        pnlMenuAo.add(btnMenuAo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblMenuAo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuAo.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuAo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteAo.png"))); // NOI18N
        lblMenuAo.setText("Áo");
        lblMenuAo.setToolTipText("Ao");
        lblMenuAo.setIconTextGap(10);
        pnlMenuAo.add(lblMenuAo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 205, 33));

        add(pnlMenuAo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, 50));

        pnlMenuDanhSach.setBackground(new java.awt.Color(255, 102, 102));
        pnlMenuDanhSach.setOpaque(false);
        pnlMenuDanhSach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuDanhSach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuDanhSach.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuDanhSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteDanhSach.png"))); // NOI18N
        lblMenuDanhSach.setText("Danh sách sản phẩm");
        lblMenuDanhSach.setToolTipText("DanhSach");
        lblMenuDanhSach.setIconTextGap(10);
        pnlMenuDanhSach.add(lblMenuDanhSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 228, 33));

        add(pnlMenuDanhSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 50));

        pnlMenuHome.setBackground(new java.awt.Color(240, 240, 240));
        pnlMenuHome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(51, 51, 51)));
        pnlMenuHome.setEnabled(false);
        pnlMenuHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuHome.setContentAreaFilled(false);
        btnMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuHomeMousePressed(evt);
            }
        });
        pnlMenuHome.add(btnMenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblMenuHome.setBackground(new java.awt.Color(255, 102, 102));
        lblMenuHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenuHome.setForeground(new java.awt.Color(51, 51, 51));
        lblMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconBlackHome.png"))); // NOI18N
        lblMenuHome.setText("Trang chủ");
        lblMenuHome.setToolTipText("Home");
        lblMenuHome.setIconTextGap(10);
        pnlMenuHome.add(lblMenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 223, 33));

        add(pnlMenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 50));

        pnlCart.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart.setOpaque(false);
        pnlCart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGioHangTomTat.setBackground(new java.awt.Color(255, 255, 255));
        pnlGioHangTomTat.setToolTipText("GioHang");
        pnlGioHangTomTat.setOpaque(false);
        pnlGioHangTomTat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGioHang.setToolTipText("GioHang");
        btnGioHang.setContentAreaFilled(false);
        btnGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGioHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGioHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGioHangMousePressed(evt);
            }
        });
        pnlGioHangTomTat.add(btnGioHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 90));

        lblGioHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblGioHang.setForeground(new java.awt.Color(255, 255, 255));
        lblGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteGioHang.png"))); // NOI18N
        lblGioHang.setText("Giỏ hàng");
        lblGioHang.setToolTipText("GioHang");
        pnlGioHangTomTat.add(lblGioHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 9, 156, 33));

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoLuong.setForeground(new java.awt.Color(255, 255, 255));
        lblSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoLuong.setText("0");
        lblSoLuong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlGioHangTomTat.add(lblSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 15, 34, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        pnlGioHangTomTat.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 48, 240, -1));

        lblGiaGioHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGiaGioHang.setForeground(new java.awt.Color(255, 255, 255));
        lblGiaGioHang.setText("Giá:");
        lblGiaGioHang.setToolTipText("Gia");
        pnlGioHangTomTat.add(lblGiaGioHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 57, 50, -1));

        lblGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGia.setText("0 đ");
        pnlGioHangTomTat.add(lblGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 57, 151, -1));

        pnlCart.add(pnlGioHangTomTat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        add(pnlCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 240, 90));
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------

    // <editor-fold defaultstate="collapsed" desc="Event btnMenuGiay"> 
    private void btnMenuGiayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuGiayMouseEntered
        XHover.enterMenuButton(pnlMenuGiay, lblMenuGiay);
    }//GEN-LAST:event_btnMenuGiayMouseEntered

    private void btnMenuGiayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuGiayMouseExited
        XHover.exitMenuButton(pnlMenuGiay, lblMenuGiay);
    }//GEN-LAST:event_btnMenuGiayMouseExited

    private void btnMenuGiayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuGiayMousePressed
        pressButtonMenu(pnlMenuGiay, lblMenuGiay);
    }//GEN-LAST:event_btnMenuGiayMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuPhuKien"> 
    private void btnMenuPhuKienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPhuKienMouseEntered
        XHover.enterMenuButton(pnlMenuPhuKien, lblMenuPhuKien);
    }//GEN-LAST:event_btnMenuPhuKienMouseEntered

    private void btnMenuPhuKienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPhuKienMouseExited
        XHover.exitMenuButton(pnlMenuPhuKien, lblMenuPhuKien);
    }//GEN-LAST:event_btnMenuPhuKienMouseExited

    private void btnMenuPhuKienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPhuKienMousePressed
        pressButtonMenu(pnlMenuPhuKien, lblMenuPhuKien);
    }//GEN-LAST:event_btnMenuPhuKienMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuQuan"> 
    private void btnMenuQuanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuQuanMouseEntered
        XHover.enterMenuButton(pnlMenuQuan, lblMenuQuan);
    }//GEN-LAST:event_btnMenuQuanMouseEntered

    private void btnMenuQuanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuQuanMouseExited
        XHover.exitMenuButton(pnlMenuQuan, lblMenuQuan);
    }//GEN-LAST:event_btnMenuQuanMouseExited

    private void btnMenuQuanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuQuanMousePressed
        pressButtonMenu(pnlMenuQuan, lblMenuQuan);
    }//GEN-LAST:event_btnMenuQuanMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuAo"> 
    private void btnMenuAoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuAoMouseEntered
        XHover.enterMenuButton(pnlMenuAo, lblMenuAo);
    }//GEN-LAST:event_btnMenuAoMouseEntered

    private void btnMenuAoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuAoMouseExited
        XHover.exitMenuButton(pnlMenuAo, lblMenuAo);
    }//GEN-LAST:event_btnMenuAoMouseExited

    private void btnMenuAoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuAoMousePressed
        pressButtonMenu(pnlMenuAo, lblMenuAo);
    }//GEN-LAST:event_btnMenuAoMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuHome"> 
    private void btnMenuHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuHomeMouseEntered
        XHover.enterMenuButton(pnlMenuHome, lblMenuHome);
    }//GEN-LAST:event_btnMenuHomeMouseEntered

    private void btnMenuHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuHomeMouseExited
        XHover.exitMenuButton(pnlMenuHome, lblMenuHome);
    }//GEN-LAST:event_btnMenuHomeMouseExited

    private void btnMenuHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuHomeMousePressed
        pressButtonMenu(pnlMenuHome, lblMenuHome);
    }//GEN-LAST:event_btnMenuHomeMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnGioHang"> 
    private void btnGioHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGioHangMouseEntered
        XHover.enterMenuButton(pnlGioHangTomTat, lblGioHang, lblSoLuong, lblGiaGioHang, lblGia);
    }//GEN-LAST:event_btnGioHangMouseEntered

    private void btnGioHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGioHangMouseExited
        XHover.exitMenuButton(pnlGioHangTomTat, lblGioHang, lblSoLuong, lblGiaGioHang, lblGia);
    }//GEN-LAST:event_btnGioHangMouseExited

    private void btnGioHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGioHangMousePressed
        this.pressButtonMenu(new JPanel(), lblGioHang);
        this.pressCart();

    }//GEN-LAST:event_btnGioHangMousePressed
    // </editor-fold>      
    
// ---------------------- End Event ----------------------
     
    // <editor-fold defaultstate="collapsed" desc="Override paintChilren"> 
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#3399FF"), 0, getHeight(), Color.decode("#000000"));
        int height = 140;
        Path2D.Float f = new Path2D.Float();
        f.moveTo(0, 0);
        f.curveTo(0, 0, 0, 70, 100, 70);
        f.curveTo(100, 70, getWidth(), 70, getWidth(), height);
        f.lineTo(getWidth(), getHeight());
        f.lineTo(0, getHeight());
        g2.setColor(new Color(60, 60, 60));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setPaint(g);
        g2.fill(f);
        super.paintChildren(grphcs);
    }    
    // </editor-fold>      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGioHang;
    private javax.swing.JButton btnMenuAo;
    private javax.swing.JButton btnMenuGiay;
    private javax.swing.JButton btnMenuHome;
    private javax.swing.JButton btnMenuPhuKien;
    private javax.swing.JButton btnMenuQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGiaGioHang;
    private javax.swing.JLabel lblGioHang;
    private javax.swing.JLabel lblMenuAo;
    private javax.swing.JLabel lblMenuDanhSach;
    private javax.swing.JLabel lblMenuGiay;
    private javax.swing.JLabel lblMenuHome;
    private javax.swing.JLabel lblMenuPhuKien;
    private javax.swing.JLabel lblMenuQuan;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JPanel pnlCart;
    private javax.swing.JPanel pnlGioHangTomTat;
    private javax.swing.JPanel pnlMenuAo;
    private javax.swing.JPanel pnlMenuDanhSach;
    private javax.swing.JPanel pnlMenuGiay;
    private javax.swing.JPanel pnlMenuHome;
    private javax.swing.JPanel pnlMenuPhuKien;
    private javax.swing.JPanel pnlMenuQuan;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init(){
        // Gán label vào lớp tiện ích
        XLabel.lblHomeTotalPrice = lblGia;
        XLabel.lblHomeTotalQuantity = lblSoLuong;
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel trên form">    
    private void showPanel(String name){
        CardLayout cardLayout = (CardLayout) XPanel.panelCardUser.getLayout();
        cardLayout.show(XPanel.panelCardUser, name);
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn menu">    
    public void pressButtonMenu(JPanel pnl, JLabel lbl){
        JPanel panel[] = {pnlMenuHome, pnlMenuAo, pnlMenuGiay, pnlMenuPhuKien, pnlMenuQuan};
        JLabel label[] = {lblMenuHome, lblMenuAo, lblMenuGiay, lblMenuPhuKien, lblMenuQuan};
        for (int i = 0; i < panel.length; i++) {
            panel[i].setBorder(null);
            panel[i].setOpaque(false);
            panel[i].setEnabled(true);
            label[i].setForeground(XConstant.WHITE_255);
            label[i].setIcon(XImage.getIcon(XConstant.ICON_EXIT + label[i].getToolTipText()));
        }
        pnl.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 0, XConstant.BLACK_51));
        pnl.setOpaque(true);
        lbl.setForeground(XConstant.BLACK_51);
        pnl.setEnabled(false);
        lbl.setIcon(XImage.getIcon(XConstant.ICON_ENTER + lbl.getToolTipText()));
        // Hiện panel tương ứng
        showPanel(lbl.getToolTipText());
        XPanel.nameCard = lbl.getToolTipText();
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn giỏ hàng"> 
    public void pressCart(){
        XPanel.panelCart.removeAll();
        XPanel.panelCart.add(new PanelCart());
    }
    // </editor-fold> 
    
// ---------------------- End Method ----------------------
}
