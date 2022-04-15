package com.unknownshop.fragment.product;

import com.unknownshop.entity.Products;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class ProductCard extends javax.swing.JPanel {

    private Products product;
    private Timer timer;
    private Timer timerStop;
    private ProductCardDescription cardDescription;
    private int y = 190;
    private int speed = 7;
    private boolean showing = false;
    private boolean check = true;

    public ProductCard(Products pro) {
        this.product = pro;
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    

    // <editor-fold defaultstate="collapsed" desc="Override paintComponent">
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        Rectangle size = getAutoSize(new ImageIcon(product.getImgUrl()));
        g2.drawImage(toImage(new ImageIcon(product.getImgUrl())), size.x, size.y, size.width, size.height, null);
        super.paintComponent(grphcs);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Override paint">
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, getHeight(), new Color(0, 0, 0, 0), 0, getHeight() - 50, new Color(0, 0, 0, 0));
        g2.setPaint(g);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init(){
        setOpaque(false);
        cardDescription = new ProductCardDescription(product);
        cardDescription.setLocation(0, y);
        setPreferredSize(new Dimension(250, 250));
        cardDescription.setSize(new Dimension(250, 250));
        add(cardDescription);
        // Tạo luồng hiệu ứng lên xuống thanh thông tin
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (showing) {
                    y -= speed;
                    if (y <= 65) {
                        y = 65;
                        cardDescription.setLocation(0, y);
                        timer.stop();
                    } else {
                        cardDescription.setLocation(0, y);
                    }
                } else {
                    y += speed;
                    if (y >= 190) {
                        y = 190;
                        cardDescription.setLocation(0, y);
                        timer.stop();
                    } else {
                        cardDescription.setLocation(0, y);
                    }
                }
            }
        });
        // Tạo luồng dừng việc hiển thị thông tin sản phẩm
        timerStop = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(check == false){
                    timer.stop();
                    timerStop.stop();
                }else{
                    showing = false;
                    timerStop.stop();
                    timer.start();
                }
            }
        });
        // Thêm sự kiện mouseEnter và mouseExit cho btnMua của Panel ProductCarđescription
        cardDescription.getBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                check = false;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                check = true;
            }
        });
        // Thêm sự kiện mouseEnter và mouseExit cho panel ProductCard
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                showing = true;
                timerStop.stop();
                timer.start();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                 timerStop.start();
            }
        });
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức thay đổi kích thước ảnh">  
    private Rectangle getAutoSize(Icon image) {
        int w = 250;
        int h = 250;
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển icon thành image">  
    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }
    // </editor-fold>

// ---------------------- End Method ----------------------
}
