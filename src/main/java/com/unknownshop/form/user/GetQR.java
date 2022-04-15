package com.unknownshop.form.user;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.unknownshop.constant.XConstant;
import com.unknownshop.util.XHover;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class GetQR extends javax.swing.JFrame{

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private String user;
    private String pass;
    DialogSignIn dialog;
    boolean check = true;

    public GetQR(DialogSignIn dialog, String user, String pass) {
        this.dialog = dialog;
        this.pass = pass;
        this.user = user;
        initComponents();
        init();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(250, 250, 250));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 300));

        btnExit.setBackground(new java.awt.Color(0, 102, 204));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(51, 51, 51));
        btnExit.setText("EXIT");
        btnExit.setContentAreaFilled(false);
        btnExit.setOpaque(true);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quét QR Code Để Đăng Nhập");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnExit">
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        webcam.close();
        check = false;
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
       XHover.enterButton(btnExit, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
       XHover.exitButton(btnExit);
    }//GEN-LAST:event_btnExitMouseExited
   // </editor-fold> 
    
// -------------------- End Event --------------------
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GetQR(null, null, null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

// -------------------- Start Method --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức hiển thị camera"> 
    private void init() {
        try {
            Dimension size = WebcamResolution.QVGA.getSize();
            webcam = Webcam.getWebcams().get(0); //0 is default webcam
            webcam.setViewSize(size);
            panel = new WebcamPanel(webcam);
            panel.setPreferredSize(size);
            panel.setFPSDisplayed(true);
            Panel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));
            webcam = Webcam.getDefault();
            webcam.setViewSize(new Dimension(320, 240));
            webcam.open();
            camera().start();
        } catch (Exception e) {
            webcam.close();
        }
   
        

    }
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Luồng chạy webcam">
    private Thread camera() {
        return new Thread() {
            @Override
            public void run() {
                while (check) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    BufferedImage image = webcam.getImage();
                    if (image != null) {
                        Result result = null;
                        if (webcam.isOpen()) {
                            if ((image = webcam.getImage()) == null) {
                                continue;
                            }
                        }
                        //chuyển đổi hình ảnh sang nguồn bitmap nhị phân
                        try {
                            LuminanceSource source = new BufferedImageLuminanceSource(image);
                            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                            result = new MultiFormatReader().decode(bitmap);
                        } catch (Exception e) {
                        }
                        if (result != null) {
                            int index = result.getText().indexOf("+");
                            pass = result.getText().substring(index + 1);
                            user = result.getText().substring(0, index);
                            dialog.setInfo(user, pass);
                            webcam.close();
                            dispose();
                            check = false;
                        }                
                    }
                }
            }
        };
    }
    // </editor-fold>
    
// -------------------- End Method --------------------
}
