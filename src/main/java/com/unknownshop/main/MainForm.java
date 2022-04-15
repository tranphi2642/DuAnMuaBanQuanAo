package com.unknownshop.main;

import com.unknownshop.form.admin.HomeAdmin;
import com.unknownshop.fragment.menu.MenuUserLayout;
import com.unknownshop.form.user.HomeUser;
import com.unknownshop.fragment.menu.MenuAdminLayout;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MainForm extends javax.swing.JFrame {

    private MigLayout layout;
    private HomeUser mainUser;
    private HomeAdmin mainAdmin;
    private MenuUserLayout menuUser;
    private MenuAdminLayout menuAdmin;
    private Animator animator;

    public MainForm() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(250, 250, 250));
        mainPanel.setOpaque(true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane mainPanel;
    // End of variables declaration//GEN-END:variables
    
// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo các giá trị trên form"> 
    public void init(){
        XPanel.mainForm = this;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon.jpg")));
        fillHomeUser();
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                if(XMess.confirm(null, "Bạn muốn đóng ứng dụng này?")){
                    System.exit(0);
                }
            }
        });
        
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đổ giao diện khách hàng lên form"> 
    public void fillHomeUser(){
        mainPanel.removeAll();
        layout = new MigLayout("fill", "0[fill]0", "0[fill]0");
        mainUser = new HomeUser();
        menuUser = new MenuUserLayout();
        mainPanel.setLayer(menuUser, JLayeredPane.POPUP_LAYER);
        mainPanel.setLayout(layout);
        mainPanel.add(mainUser);
        mainPanel.add(menuUser, "pos -215 0 100% 100%", 0);
        mainPanel.repaint();
        mainPanel.revalidate();
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float x = (fraction * 215);
                float alpha;
                if (menuUser.isShow()) {
                    x = -x;
                    alpha = 0.5f - (fraction / 2);
                } else {
                    x -= 215;
                    alpha = fraction / 2;
                }
                layout.setComponentConstraints(menuUser, "pos " + (int) x + " 0 100% 100%");
                if (alpha < 0) {
                    alpha = 0;
                }
                menuUser.setAlpha(alpha);
                mainPanel.revalidate();
            }

            @Override
            public void end() {
                menuUser.setShow(!menuUser.isShow());
                if (!menuUser.isShow()) {
                    menuUser.setVisible(false);
                }
            }

        };
        animator = new Animator(200, target);
        menuUser.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (!animator.isRunning()) {
                        if (menuUser.isShow()) {
                            animator.start();
                        }
                    }
                }
            }
        });
        mainUser.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    if (!menuUser.isShow()) {
                        menuUser.setVisible(true);
                        animator.start();
                    }
                }
            }
        });
        
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đổ giao diện quản lý lên form"> 
    public void fillHomeAdmin(){
        mainPanel.removeAll();
        layout = new MigLayout("fill", "0[fill]0", "0[fill]0");
        mainAdmin = new HomeAdmin();
        menuAdmin = new MenuAdminLayout();
        mainPanel.setLayer(menuAdmin, JLayeredPane.POPUP_LAYER);
        mainPanel.setLayout(layout);
        mainPanel.add(mainAdmin);
        mainPanel.add(menuAdmin, "pos -215 0 100% 100%", 0);
        mainPanel.repaint();
        mainPanel.revalidate();
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float x = (fraction * 215);
                float alpha;
                if (menuAdmin.isShow()) {
                    x = -x;
                    alpha = 0.5f - (fraction / 2);
                } else {
                    x -= 215;
                    alpha = fraction / 2;
                }
                layout.setComponentConstraints(menuAdmin, "pos " + (int) x + " 0 100% 100%");
                if (alpha < 0) {
                    alpha = 0;
                }
                menuAdmin.setAlpha(alpha);
                mainPanel.revalidate();
            }

            @Override
            public void end() {
                menuAdmin.setShow(!menuAdmin.isShow());
                if (!menuAdmin.isShow()) {
                    menuAdmin.setVisible(false);
                }
            }

        };
        animator = new Animator(200, target);
        menuAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (!animator.isRunning()) {
                        if (menuAdmin.isShow()) {
                            animator.start();
                        }
                    }
                }
            }
        });
        mainAdmin.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    if (!menuAdmin.isShow()) {
                        menuAdmin.setVisible(true);
                        animator.start();
                    }
                }
            }
        });
        
    }
    // </editor-fold> 
    
// ---------------------- Start Method ----------------------
}
