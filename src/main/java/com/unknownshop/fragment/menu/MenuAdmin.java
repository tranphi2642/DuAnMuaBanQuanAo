package com.unknownshop.fragment.menu;

import com.unknownshop.constant.XConstant;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
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

public class MenuAdmin extends javax.swing.JPanel {

    public MenuAdmin() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameShop = new javax.swing.JLabel();
        pnlTKChiTiet = new javax.swing.JPanel();
        btnTKChiTiet = new javax.swing.JButton();
        lblTKChiTiet = new javax.swing.JLabel();
        pnlQLHoaDon = new javax.swing.JPanel();
        btnQLHoaDon = new javax.swing.JButton();
        lblQLHoaDon = new javax.swing.JLabel();
        pnlQLSanPham = new javax.swing.JPanel();
        btnQLSanPham = new javax.swing.JButton();
        lblQLSanPham = new javax.swing.JLabel();
        pnlQLTaiKhoan = new javax.swing.JPanel();
        btnQLTaiKhoan = new javax.swing.JButton();
        lblQLTaiKhoan = new javax.swing.JLabel();
        pnlTKChung = new javax.swing.JPanel();
        btnTKChung = new javax.swing.JButton();
        lblTKChung = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(215, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameShop.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNameShop.setForeground(new java.awt.Color(255, 255, 255));
        lblNameShop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameShop.setText("Unknown Shop");
        add(lblNameShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 70));

        pnlTKChiTiet.setBackground(new java.awt.Color(240, 240, 240));
        pnlTKChiTiet.setOpaque(false);
        pnlTKChiTiet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTKChiTiet.setContentAreaFilled(false);
        btnTKChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKChiTietMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKChiTietMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTKChiTietMousePressed(evt);
            }
        });
        pnlTKChiTiet.add(btnTKChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblTKChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTKChiTiet.setForeground(new java.awt.Color(255, 255, 255));
        lblTKChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteTKChiTiet.png"))); // NOI18N
        lblTKChiTiet.setText("Thống kê chi tiết");
        lblTKChiTiet.setToolTipText("TKChiTiet");
        lblTKChiTiet.setIconTextGap(10);
        pnlTKChiTiet.add(lblTKChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 205, 33));

        add(pnlTKChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 280, 50));

        pnlQLHoaDon.setBackground(new java.awt.Color(240, 240, 240));
        pnlQLHoaDon.setOpaque(false);
        pnlQLHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLHoaDon.setContentAreaFilled(false);
        btnQLHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQLHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQLHoaDonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnQLHoaDonMousePressed(evt);
            }
        });
        pnlQLHoaDon.add(btnQLHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblQLHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQLHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblQLHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteQLHoaDon.png"))); // NOI18N
        lblQLHoaDon.setText("Quản lý hóa đơn");
        lblQLHoaDon.setToolTipText("QLHoaDon");
        lblQLHoaDon.setIconTextGap(10);
        pnlQLHoaDon.add(lblQLHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 205, 33));

        add(pnlQLHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, 50));

        pnlQLSanPham.setBackground(new java.awt.Color(240, 240, 240));
        pnlQLSanPham.setOpaque(false);
        pnlQLSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLSanPham.setContentAreaFilled(false);
        btnQLSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQLSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQLSanPhamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnQLSanPhamMousePressed(evt);
            }
        });
        pnlQLSanPham.add(btnQLSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblQLSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQLSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblQLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteQLSanPham.png"))); // NOI18N
        lblQLSanPham.setText("Quản lý sản phẩm");
        lblQLSanPham.setToolTipText("QLSanPham");
        lblQLSanPham.setIconTextGap(10);
        pnlQLSanPham.add(lblQLSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 205, 33));

        add(pnlQLSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 50));

        pnlQLTaiKhoan.setBackground(new java.awt.Color(240, 240, 240));
        pnlQLTaiKhoan.setOpaque(false);
        pnlQLTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLTaiKhoan.setContentAreaFilled(false);
        btnQLTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQLTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQLTaiKhoanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnQLTaiKhoanMousePressed(evt);
            }
        });
        pnlQLTaiKhoan.add(btnQLTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblQLTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQLTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconWhiteQLTaiKhoan.png"))); // NOI18N
        lblQLTaiKhoan.setText("Quản lý tài khoản");
        lblQLTaiKhoan.setToolTipText("QLTaiKhoan");
        lblQLTaiKhoan.setIconTextGap(10);
        pnlQLTaiKhoan.add(lblQLTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 205, 33));

        add(pnlQLTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 50));

        pnlTKChung.setBackground(new java.awt.Color(240, 240, 240));
        pnlTKChung.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(51, 51, 51)));
        pnlTKChung.setEnabled(false);
        pnlTKChung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTKChung.setToolTipText("ThongKeChung");
        btnTKChung.setContentAreaFilled(false);
        btnTKChung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKChungMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKChungMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTKChungMousePressed(evt);
            }
        });
        pnlTKChung.add(btnTKChung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblTKChung.setBackground(new java.awt.Color(255, 102, 102));
        lblTKChung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTKChung.setForeground(new java.awt.Color(51, 51, 51));
        lblTKChung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconBlackTKChung.png"))); // NOI18N
        lblTKChung.setText("Thống kê chung");
        lblTKChung.setToolTipText("TKChung");
        lblTKChung.setIconTextGap(10);
        pnlTKChung.add(lblTKChung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 223, 33));

        add(pnlTKChung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, 50));
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------

    // <editor-fold defaultstate="collapsed" desc="Event btnMenuGiay"> 
    private void btnTKChiTietMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKChiTietMouseEntered
        XHover.enterMenuButton(pnlTKChiTiet, lblTKChiTiet);
    }//GEN-LAST:event_btnTKChiTietMouseEntered

    private void btnTKChiTietMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKChiTietMouseExited
        XHover.exitMenuButton(pnlTKChiTiet, lblTKChiTiet);
    }//GEN-LAST:event_btnTKChiTietMouseExited

    private void btnTKChiTietMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKChiTietMousePressed
        pressButtonMenu(pnlTKChiTiet, lblTKChiTiet);
    }//GEN-LAST:event_btnTKChiTietMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuPhuKien"> 
    private void btnQLHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLHoaDonMouseEntered
        XHover.enterMenuButton(pnlQLHoaDon, lblQLHoaDon);
    }//GEN-LAST:event_btnQLHoaDonMouseEntered

    private void btnQLHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLHoaDonMouseExited
        XHover.exitMenuButton(pnlQLHoaDon, lblQLHoaDon);
    }//GEN-LAST:event_btnQLHoaDonMouseExited

    private void btnQLHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLHoaDonMousePressed
        pressButtonMenu(pnlQLHoaDon, lblQLHoaDon);
    }//GEN-LAST:event_btnQLHoaDonMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuQuan"> 
    private void btnQLSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSanPhamMouseEntered
        XHover.enterMenuButton(pnlQLSanPham, lblQLSanPham);
    }//GEN-LAST:event_btnQLSanPhamMouseEntered

    private void btnQLSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSanPhamMouseExited
        XHover.exitMenuButton(pnlQLSanPham, lblQLSanPham);
    }//GEN-LAST:event_btnQLSanPhamMouseExited

    private void btnQLSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSanPhamMousePressed
        pressButtonMenu(pnlQLSanPham, lblQLSanPham);
    }//GEN-LAST:event_btnQLSanPhamMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuAo"> 
    private void btnQLTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanMouseEntered
        XHover.enterMenuButton(pnlQLTaiKhoan, lblQLTaiKhoan);
    }//GEN-LAST:event_btnQLTaiKhoanMouseEntered

    private void btnQLTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanMouseExited
        XHover.exitMenuButton(pnlQLTaiKhoan, lblQLTaiKhoan);
    }//GEN-LAST:event_btnQLTaiKhoanMouseExited

    private void btnQLTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanMousePressed
        pressButtonMenu(pnlQLTaiKhoan, lblQLTaiKhoan);
    }//GEN-LAST:event_btnQLTaiKhoanMousePressed
    // </editor-fold>      
    // <editor-fold defaultstate="collapsed" desc="Event btnMenuHome"> 
    private void btnTKChungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKChungMouseEntered
        XHover.enterMenuButton(pnlTKChung, lblTKChung);
    }//GEN-LAST:event_btnTKChungMouseEntered

    private void btnTKChungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKChungMouseExited
        XHover.exitMenuButton(pnlTKChung, lblTKChung);
    }//GEN-LAST:event_btnTKChungMouseExited

    private void btnTKChungMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKChungMousePressed
        pressButtonMenu(pnlTKChung, lblTKChung);
    }//GEN-LAST:event_btnTKChungMousePressed
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
    private javax.swing.JButton btnQLHoaDon;
    private javax.swing.JButton btnQLSanPham;
    private javax.swing.JButton btnQLTaiKhoan;
    private javax.swing.JButton btnTKChiTiet;
    private javax.swing.JButton btnTKChung;
    private javax.swing.JLabel lblNameShop;
    private javax.swing.JLabel lblQLHoaDon;
    private javax.swing.JLabel lblQLSanPham;
    private javax.swing.JLabel lblQLTaiKhoan;
    private javax.swing.JLabel lblTKChiTiet;
    private javax.swing.JLabel lblTKChung;
    private javax.swing.JPanel pnlQLHoaDon;
    private javax.swing.JPanel pnlQLSanPham;
    private javax.swing.JPanel pnlQLTaiKhoan;
    private javax.swing.JPanel pnlTKChiTiet;
    private javax.swing.JPanel pnlTKChung;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init(){
        
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel trên form">    
    private void showPanel(String name){
        CardLayout cardLayout = (CardLayout) XPanel.panelCardAdmin.getLayout();
        cardLayout.show(XPanel.panelCardAdmin, name);
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn menu">    
    public void pressButtonMenu(JPanel pnl, JLabel lbl){
        JPanel panel[] = {pnlTKChung, pnlQLTaiKhoan, pnlTKChiTiet, pnlQLHoaDon, pnlQLSanPham};
        JLabel label[] = {lblTKChung, lblQLTaiKhoan, lblTKChiTiet, lblQLHoaDon, lblQLSanPham};
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
        if(lbl.getToolTipText().equals("TKChung")) {
//            // Tạo luồng và hiện dialog loading
//            DialogLoading dlog = new DialogLoading();
//            dlog.setVisible(true);
//            new Thread(){
//                @Override
//                public void run(){
//                    XPanel.mainForm.setEnabled(false);
//                    XPanel.panelStatistic.setChart();
//                    XPanel.panelStatistic.setInfo();
//                    XPanel.mainForm.setEnabled(true);
//                    dlog.setVisible(false);
//                }
//            }.start();
        }
        showPanel(lbl.getToolTipText());
        XPanel.nameCard = lbl.getToolTipText();
    } 
    // </editor-fold> 
    
// ---------------------- End Method ----------------------
}
