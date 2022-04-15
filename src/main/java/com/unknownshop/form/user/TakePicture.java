package com.unknownshop.form.user;

import com.github.sarxos.webcam.Webcam;
import com.unknownshop.constant.XConstant;
import com.unknownshop.util.XHover;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TakePicture extends javax.swing.JFrame {
    Webcam webcam;
    Image image;
    byte[] byteImg;
    int index = 0;
    DialogSignUp dialog;
    JLabel label;

    public TakePicture(DialogSignUp dialog, JLabel lbl) {
        initComponents();
        this.dialog = dialog;
        this.label = lbl;
        init();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnCancelOrTakeAgain = new javax.swing.JButton();
        btnTakeOrMakePicture = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 230, 207));

        btnCancelOrTakeAgain.setBackground(new java.awt.Color(0, 102, 204));
        btnCancelOrTakeAgain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelOrTakeAgain.setText("Hủy bỏ");
        btnCancelOrTakeAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelOrTakeAgainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelOrTakeAgainMouseExited(evt);
            }
        });
        btnCancelOrTakeAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrTakeAgainActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelOrTakeAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 90, -1));

        btnTakeOrMakePicture.setBackground(new java.awt.Color(0, 102, 204));
        btnTakeOrMakePicture.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTakeOrMakePicture.setText("Chụp ảnh");
        btnTakeOrMakePicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTakeOrMakePictureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTakeOrMakePictureMouseExited(evt);
            }
        });
        btnTakeOrMakePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeOrMakePictureActionPerformed(evt);
            }
        });
        jPanel1.add(btnTakeOrMakePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Button take Picture và make picture">
    private void btnTakeOrMakePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeOrMakePictureActionPerformed
        takePicture();
    }//GEN-LAST:event_btnTakeOrMakePictureActionPerformed
    // </editor-fold > 
    // <editor-fold defaultstate="collapsed" desc="Button hủy và chụp lại ảnh">   
    private void btnCancelOrTakeAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrTakeAgainActionPerformed
        takeAgain();
    }//GEN-LAST:event_btnCancelOrTakeAgainActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnTakeOrMakePicture">
    private void btnTakeOrMakePictureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTakeOrMakePictureMouseEntered
        XHover.enterButton(btnTakeOrMakePicture, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTakeOrMakePictureMouseEntered

    private void btnTakeOrMakePictureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTakeOrMakePictureMouseExited
        XHover.exitButton(btnTakeOrMakePicture);
    }//GEN-LAST:event_btnTakeOrMakePictureMouseExited
    // </editor-fold >
    // <editor-fold defaultstate="collapsed" desc="Event btnCancelOrTakeAgain">
    private void btnCancelOrTakeAgainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelOrTakeAgainMouseEntered
        XHover.enterButton(btnCancelOrTakeAgain, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnCancelOrTakeAgainMouseEntered

    private void btnCancelOrTakeAgainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelOrTakeAgainMouseExited
        XHover.exitButton(btnCancelOrTakeAgain);
    }//GEN-LAST:event_btnCancelOrTakeAgainMouseExited
    // </editor-fold >
    
// ---------------------- End Event ----------------------
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakePicture(null,null).setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOrTakeAgain;
    private javax.swing.JButton btnTakeOrMakePicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ---------------------- 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo webcam">
    public void init() {
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(320, 240));
        webcam.open();
        lblImage.setSize(320, 240);
        camera().start();
    }
    // </editor-fold >
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chụp lại ảnh">
    public void takeAgain() {
        if (index == 0) {
            webcam.close();
            this.dispose();
        }else{
            index = 0;
            btnTakeOrMakePicture.setText("Chụp ảnh");
            btnCancelOrTakeAgain.setText("Hủy bỏ");
            camera().start();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chụp ảnh">
    public void takePicture() {
        if (index == 1) {
            dialog.setIcon(image,byteImg);
            webcam.close();
            this.dispose();
        } else{
            btnCancelOrTakeAgain.setText("Chụp lại");
            BufferedImage image = webcam.getImage(); 
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try {
                ImageIO.write(image, "jpg", bos );
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            byteImg = bos.toByteArray();           
            this.image = image;
            lblImage.setIcon(new ImageIcon(new ImageIcon(image).getImage().
                    getScaledInstance(320, 240, Image.SCALE_SMOOTH)));
            index = 1;
            btnTakeOrMakePicture.setText("Lấy ảnh");
        }
    }
    // </editor-fold >
    
    // <editor-fold defaultstate="collapsed" desc="Luồng chạy webcam">
    private Thread camera(){
        return new Thread(){
            @Override
            public void run() {
                while (index != 1) {
                    Image image = webcam.getImage();
                    if(image != null){
                        lblImage.setIcon(new ImageIcon(image)); 
                        label.setToolTipText("");
                    }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        return;
                    }
                }
            }
        };
    }
}
    // </editor-fold >

// ---------------------- End Method ----------------------