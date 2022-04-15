package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.UserDAO;
import com.unknownshop.entity.Users;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.swing.table.RowTableAccount;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;
import com.unknownshop.util.XTable;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelAccountManager extends javax.swing.JPanel {

    private UserDAO dao = new UserDAO();
    private List<Users> listUser = new ArrayList<>();
    private List<Users> listUserDeleted = new ArrayList<>();
    public int row = -1;
    private DialogInfoAccount dialogInfo = new DialogInfoAccount(this);
    
    public PanelAccountManager() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlTabButton = new javax.swing.JPanel();
        btnDanhSachTK = new javax.swing.JButton();
        btnTKDaXoa = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlDanhSachTK = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachTK = new com.unknownshop.swing.table.Table();
        cboChucVu = new com.unknownshop.swing.combobox.ComboboxWhite();
        btnThemTK = new javax.swing.JButton();
        txtTimKiem = new com.unknownshop.swing.textfield.TextFieldWhite();
        pnlTKDaXoa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTKDaXoa = new com.unknownshop.swing.table.Table();
        txtTimKiem1 = new com.unknownshop.swing.textfield.TextFieldWhite();
        cboChucVu1 = new com.unknownshop.swing.combobox.ComboboxWhite();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnDanhSachTK.setBackground(new java.awt.Color(51, 51, 51));
        btnDanhSachTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDanhSachTK.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachTK.setText("Danh Sách Tài Khoản");
        btnDanhSachTK.setToolTipText("DanhSachTK");
        btnDanhSachTK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnDanhSachTK.setContentAreaFilled(false);
        btnDanhSachTK.setOpaque(true);
        btnDanhSachTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDanhSachTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDanhSachTKMouseExited(evt);
            }
        });
        btnDanhSachTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachTKActionPerformed(evt);
            }
        });

        btnTKDaXoa.setBackground(new java.awt.Color(51, 51, 51));
        btnTKDaXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTKDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnTKDaXoa.setText("Danh Sách Tài Khoản Đã Xóa");
        btnTKDaXoa.setToolTipText("TKDaXoa");
        btnTKDaXoa.setContentAreaFilled(false);
        btnTKDaXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKDaXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKDaXoaMouseExited(evt);
            }
        });
        btnTKDaXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKDaXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnDanhSachTK, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTKDaXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTKDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachTK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnlTabButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1270, 80));

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlDanhSachTK.setOpaque(false);

        tblDanhSachTK.setBackground(new java.awt.Color(255, 255, 255));
        tblDanhSachTK.setForeground(new java.awt.Color(51, 51, 51));
        tblDanhSachTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ảnh", "Tên Tài Khoản", "Họ Và Tên", "Email", "Vai Trò", "Chỉnh Sửa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachTK.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDanhSachTK.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblDanhSachTK);
        if (tblDanhSachTK.getColumnModel().getColumnCount() > 0) {
            tblDanhSachTK.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDanhSachTK.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblDanhSachTK.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblDanhSachTK.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(3).setPreferredWidth(350);
            tblDanhSachTK.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblDanhSachTK.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachTK.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        cboChucVu.setBackground(new java.awt.Color(250, 250, 250));
        cboChucVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboChucVu.setLabeText("Vai trò tài khoản");
        cboChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVuActionPerformed(evt);
            }
        });

        btnThemTK.setBackground(new java.awt.Color(51, 51, 51));
        btnThemTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemTK.setForeground(new java.awt.Color(255, 255, 255));
        btnThemTK.setText("Thêm Tài Khoản");
        btnThemTK.setContentAreaFilled(false);
        btnThemTK.setOpaque(true);
        btnThemTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemTKMouseExited(evt);
            }
        });
        btnThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTKActionPerformed(evt);
            }
        });

        txtTimKiem.setBackground(new java.awt.Color(250, 250, 250));
        txtTimKiem.setForeground(new java.awt.Color(51, 51, 51));
        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTimKiem.setLabelText("Tìm kiếm");
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDanhSachTKLayout = new javax.swing.GroupLayout(pnlDanhSachTK);
        pnlDanhSachTK.setLayout(pnlDanhSachTKLayout);
        pnlDanhSachTKLayout.setHorizontalGroup(
            pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
                    .addGroup(pnlDanhSachTKLayout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlDanhSachTKLayout.setVerticalGroup(
            pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhSachTKLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlDanhSachTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnThemTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCard.add(pnlDanhSachTK, "DanhSachTK");

        pnlTKDaXoa.setOpaque(false);

        tblTKDaXoa.setBackground(new java.awt.Color(255, 255, 255));
        tblTKDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        tblTKDaXoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ảnh", "Tên Tài Khoản", "Họ Và Tên", "Email", "Vai Trò", "Phục Hồi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTKDaXoa.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblTKDaXoa.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblTKDaXoa);
        if (tblTKDaXoa.getColumnModel().getColumnCount() > 0) {
            tblTKDaXoa.getColumnModel().getColumn(0).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblTKDaXoa.getColumnModel().getColumn(1).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblTKDaXoa.getColumnModel().getColumn(2).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblTKDaXoa.getColumnModel().getColumn(3).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(3).setPreferredWidth(350);
            tblTKDaXoa.getColumnModel().getColumn(4).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblTKDaXoa.getColumnModel().getColumn(5).setResizable(false);
            tblTKDaXoa.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        txtTimKiem1.setBackground(new java.awt.Color(250, 250, 250));
        txtTimKiem1.setForeground(new java.awt.Color(51, 51, 51));
        txtTimKiem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTimKiem1.setLabelText("Tìm kiếm");
        txtTimKiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem1KeyReleased(evt);
            }
        });

        cboChucVu1.setBackground(new java.awt.Color(250, 250, 250));
        cboChucVu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboChucVu1.setLabeText("Vai trò tài khoản");
        cboChucVu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTKDaXoaLayout = new javax.swing.GroupLayout(pnlTKDaXoa);
        pnlTKDaXoa.setLayout(pnlTKDaXoaLayout);
        pnlTKDaXoaLayout.setHorizontalGroup(
            pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKDaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlTKDaXoaLayout.createSequentialGroup()
                        .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 641, Short.MAX_VALUE))))
        );
        pnlTKDaXoaLayout.setVerticalGroup(
            pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTKDaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cboChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCard.add(pnlTKDaXoa, "TKDaXoa");

        add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, 520));
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDanhSachTK"> 
    private void btnDanhSachTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachTKActionPerformed
        pressTabButton(btnDanhSachTK);
    }//GEN-LAST:event_btnDanhSachTKActionPerformed

    private void btnDanhSachTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachTKMouseEntered
        XHover.enterTabButton(btnDanhSachTK, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDanhSachTKMouseEntered

    private void btnDanhSachTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachTKMouseExited
        XHover.exitTabButton(btnDanhSachTK);
    }//GEN-LAST:event_btnDanhSachTKMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnTKDaXoa"> 
    private void btnTKDaXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKDaXoaActionPerformed
        pressTabButton(btnTKDaXoa);
    }//GEN-LAST:event_btnTKDaXoaActionPerformed

    private void btnTKDaXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDaXoaMouseEntered
        XHover.enterTabButton(btnTKDaXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTKDaXoaMouseEntered

    private void btnTKDaXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDaXoaMouseExited
        XHover.exitTabButton(btnTKDaXoa);
    }//GEN-LAST:event_btnTKDaXoaMouseExited

   // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event cboChucVu">
    private void cboChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVuActionPerformed
        selectCombobox(tblDanhSachTK,cboChucVu,listUser);
    }//GEN-LAST:event_cboChucVuActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnThemTK">
    private void btnThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTKActionPerformed
        XPanel.mainForm.setEnabled(false);
        dialogInfo.setVisible(true);
        dialogInfo.clearForm();
    }//GEN-LAST:event_btnThemTKActionPerformed

    private void btnThemTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemTKMouseEntered
        XHover.enterButton(btnThemTK, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnThemTKMouseEntered

    private void btnThemTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemTKMouseExited
        XHover.exitButton(btnThemTK);
    }//GEN-LAST:event_btnThemTKMouseExited
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event cboChucVu1">
    private void cboChucVu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVu1ActionPerformed
        selectCombobox(tblTKDaXoa,cboChucVu1,listUserDeleted);
    }//GEN-LAST:event_cboChucVu1ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event txtTimKiem">
    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        search(tblDanhSachTK, txtTimKiem, listUser);
    }//GEN-LAST:event_txtTimKiemKeyReleased
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event txtTimKiem1">
    private void txtTimKiem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem1KeyReleased
        search(tblTKDaXoa, txtTimKiem1, listUserDeleted);
    }//GEN-LAST:event_txtTimKiem1KeyReleased
    // </editor-fold> 
    
    // -------------------- End Event --------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachTK;
    private javax.swing.JButton btnTKDaXoa;
    private javax.swing.JButton btnThemTK;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.unknownshop.swing.combobox.ComboboxWhite cboChucVu;
    private com.unknownshop.swing.combobox.ComboboxWhite cboChucVu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlDanhSachTK;
    private javax.swing.JPanel pnlTKDaXoa;
    private javax.swing.JPanel pnlTabButton;
    private com.unknownshop.swing.table.Table tblDanhSachTK;
    private com.unknownshop.swing.table.Table tblTKDaXoa;
    private com.unknownshop.swing.textfield.TextFieldWhite txtTimKiem;
    private com.unknownshop.swing.textfield.TextFieldWhite txtTimKiem1;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        XTable.setCellAlignmentCenter(tblDanhSachTK,0);
        XTable.setCellAlignmentCenter(tblTKDaXoa,0);
        fillCboChucVu(cboChucVu,cboChucVu1);
        fillTableUser(true);
        fillTableUserDeleted(true);
        // gán vào lớp tiện ích
        XPanel.panelAccManager = this;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển panel trên form">    
    private void showPanel(String name){
        CardLayout cardLayout = (CardLayout) pnlCard.getLayout();
        cardLayout.show(pnlCard, name);
        
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn nút trên thanh tab">    
    private void pressTabButton(JButton btn){
        JButton button[] = {btnDanhSachTK, btnTKDaXoa};
        for (int i = 0; i < button.length; i++) {
            button[i].setOpaque(false);
            button[i].setBorder(null);
            button[i].setForeground(XConstant.BLACK_51);
        }
        btn.setOpaque(true);
        btn.setForeground(XConstant.WHITE_255);
        btn.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, XConstant.WHITE_255));
        XHover.check = false;
        // Hiện panel tương ứng
        showPanel(btn.getToolTipText());
    } 
    // </editor-fold> 
    
// _____________________ DS Tài Khoản _____________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào combobox chức vụ"> 
    private void fillCboChucVu(JComboBox... combo){
        for (JComboBox cbo : combo) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
            model.removeAllElements();
            model.addElement("Tất cả vai trò");
            List<Object[]> list = dao.selectRoles();
            for (Object[] us : list) {
                model.addElement(us[0]);
            }
            cbo.setSelectedIndex(-1);
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng tài khoản">
    public void fillTableUser(boolean check) {
        if(cboChucVu.getSelectedIndex() >= 0) cboChucVu.setSelectedIndex(0);
        else cboChucVu.setSelectedIndex(-1);
        DefaultTableModel model = (DefaultTableModel) tblDanhSachTK.getModel();
        model.setRowCount(0);
        if(check) {
            listUser = dao.selectUsers(null);
        }
        for (Users us : listUser) {
            model.addRow(new RowTableAccount(us).toRowTable(0));
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn combobox ChucVu">
    private void selectCombobox(JTable table, JComboBox cbo, List<Users> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        String role;
        if(cbo.getSelectedIndex() == 0){
            if(cbo.equals(cboChucVu)) fillTableUser(false);
            else fillTableUserDeleted(false);
        }else{
            role = (String) cbo.getSelectedItem();
            for (Users us : list) {
                if(us.getRole().equals(role)){
                    model.addRow(new RowTableAccount(us).toRowTable(0));
                }
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đưa thông tin tài khoản lên form">
    public void edit(){
        row = tblDanhSachTK.getSelectedRow();
        String username = tblDanhSachTK.getValueAt(row, 1).toString();
        Users user = new Users();
        for (Users us : listUser) {
            if(us.getUsername().equals(username)) user = us; 
        }
        if(dialogInfo.isVisible()){
            dialogInfo.setForm(user);
        }else{
            XPanel.mainForm.setEnabled(false);
            dialogInfo.setVisible(true);
            dialogInfo.setForm(user);
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa hàng được chọn">
    public void removeRow(){
        row = tblDanhSachTK.getSelectedRow();
        String username = tblDanhSachTK.getValueAt(row, 1).toString();
        if(Auth.user.getUsername().equals(username)){
            XMess.alert(null, "Bạn không thể xóa bản thân!");
        }else if(XMess.confirm(null, "Bạn có chắc muốn xóa nhan viên này")){
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    XPanel.mainForm.setEnabled(false);
                    if(dao.delete(username) == 0){
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null, "Xóa tài khoản thất bại!");
                    }else{
                        fillTableUser(true);
                        fillTableUserDeleted(true);
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null, "Xóa tài khoản thành công");
                    }
                }
            }.start();
        }
    }
    // </editor-fold>
    
// _______________________ TK Đã xóa ______________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng tài khoản đã xóa">
    public void fillTableUserDeleted(boolean check) {
        if(cboChucVu1.getSelectedIndex() >= 0) cboChucVu1.setSelectedIndex(0);
        else cboChucVu1.setSelectedIndex(-1);
        DefaultTableModel model = (DefaultTableModel) tblTKDaXoa.getModel();
        model.setRowCount(0);
        if(check) {
            listUserDeleted = dao.selectUsersDeleted(null);
        }
        for (Users us : listUserDeleted) {
            model.addRow(new RowTableAccount(us).toRowTable(1));
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức phục hồi tài khoản">  
    public void restore(){
        int row1 = tblTKDaXoa.getSelectedRow();
        String username = tblTKDaXoa.getValueAt(row1, 1).toString();
        if(XMess.confirm(this, "Bạn muốn phục hồi nhân viên này?")){
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    XPanel.mainForm.setEnabled(false);
                    if(dao.restoreUser(username) == 0){
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null,"Phục hồi tài khoản thất bại!");
                    }else{
                        fillTableUserDeleted(true);
                        fillTableUser(true);
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null,"Phục hồi tài khoản thành công!");
                    }
                }
            }.start();
        }
    }
    // </editor-fold>
    
// _____________ Điều khiển _____________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức các nút điều khiển"> 
    public void first(){
        tblDanhSachTK.setRowSelectionInterval(0, 0);
        edit();
        dialogInfo.first();
    }
    
    public void prev(){
        if(row > 0){
            tblDanhSachTK.setRowSelectionInterval(--row, row);
            edit();
        }
        if(row == 0){
            dialogInfo.prev(true);
        }else if(row == listUser.size()-2){
            dialogInfo.prev(false);
        }
    }
    
    public void next(){
        if(row < listUser.size()-1){
            tblDanhSachTK.setRowSelectionInterval(++row, row);
            edit();
        }
        if(row == listUser.size()-1){
            dialogInfo.next(true);
        }else if(row == 1){
            dialogInfo.prev(false);
        }
    }
    
    public void last(){
        int index = tblDanhSachTK.getRowCount() - 1;
        tblDanhSachTK.setRowSelectionInterval(index, index);
        edit();
        dialogInfo.last();
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức tìm kiếm tài khoản">    
    private void search(JTable table, JTextField txt, List<Users> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String text = txt.getText().toLowerCase();
        // Đưa danh sách thông tin lên bảng
        model.setRowCount(0);
        for (Users us : list) {
            String username = us.getUsername().toString().toLowerCase();
            String fullname = us.getFullname().toString().toLowerCase();
            String email = us.getEmail().toLowerCase();
            String role = us.getRole().toString().toLowerCase();
            boolean check = username.contains(text)
                    || fullname.contains(text)
                    || email.contains(text) || email.contains(text)
                    || role.contains(text);
            if (check) {
                if(table.equals(tblDanhSachTK)) model.addRow(new RowTableAccount(us).toRowTable(0));
                else model.addRow(new RowTableAccount(us).toRowTable(1));
            }
        }
    }
    //</editor-fold>
    
// ---------------------- End Method ----------------------
    
}
