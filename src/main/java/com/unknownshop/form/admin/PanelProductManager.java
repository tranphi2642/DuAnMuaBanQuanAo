package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.ProductDAO;
import com.unknownshop.dao.ProductTypeDAO;
import com.unknownshop.entity.ProductTypes;
import com.unknownshop.entity.Products;
import com.unknownshop.entity.Users;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.swing.table.RowTableProduct;
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

public class PanelProductManager extends javax.swing.JPanel {

    private ProductDAO proDao = new ProductDAO();
    private List<Products> list = new ArrayList<>();
    private List<Products> listDeleted = new ArrayList<>();
    private ProductTypeDAO proTypeDao = new ProductTypeDAO();
    private int row = -1;
    private DialogInfoProduct dialogInfo = new DialogInfoProduct(this);
    
    public PanelProductManager() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabButton = new javax.swing.JPanel();
        btnDanhSachSP = new javax.swing.JButton();
        btnSPDaXoa = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlDanhSachSP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachSP = new com.unknownshop.swing.table.Table();
        cboLoai = new com.unknownshop.swing.combobox.ComboboxWhite();
        btnThemSP = new javax.swing.JButton();
        txtTimKiem = new com.unknownshop.swing.textfield.TextFieldWhite();
        pnlSPDaXoa = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSPDaXoa = new com.unknownshop.swing.table.Table();
        cboLoai1 = new com.unknownshop.swing.combobox.ComboboxWhite();
        txtTimKiem1 = new com.unknownshop.swing.textfield.TextFieldWhite();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnDanhSachSP.setBackground(new java.awt.Color(51, 51, 51));
        btnDanhSachSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDanhSachSP.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachSP.setText("Danh Sách Sản Phẩm");
        btnDanhSachSP.setToolTipText("DanhSachSP");
        btnDanhSachSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnDanhSachSP.setContentAreaFilled(false);
        btnDanhSachSP.setOpaque(true);
        btnDanhSachSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDanhSachSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDanhSachSPMouseExited(evt);
            }
        });
        btnDanhSachSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachSPActionPerformed(evt);
            }
        });

        btnSPDaXoa.setBackground(new java.awt.Color(51, 51, 51));
        btnSPDaXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSPDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnSPDaXoa.setText("Danh Sách Sản Phẩm Đã Xóa");
        btnSPDaXoa.setToolTipText("SPDaXoa");
        btnSPDaXoa.setContentAreaFilled(false);
        btnSPDaXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSPDaXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSPDaXoaMouseExited(evt);
            }
        });
        btnSPDaXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPDaXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnDanhSachSP, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSPDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSPDaXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachSP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnlTabButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1270, 80));

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlDanhSachSP.setOpaque(false);

        tblDanhSachSP.setBackground(new java.awt.Color(255, 255, 255));
        tblDanhSachSP.setForeground(new java.awt.Color(51, 51, 51));
        tblDanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ảnh", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Giá", "Chỉnh Sửa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachSP.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(tblDanhSachSP);
        if (tblDanhSachSP.getColumnModel().getColumnCount() > 0) {
            tblDanhSachSP.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDanhSachSP.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblDanhSachSP.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(2).setPreferredWidth(450);
            tblDanhSachSP.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblDanhSachSP.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblDanhSachSP.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachSP.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        cboLoai.setBackground(new java.awt.Color(250, 250, 250));
        cboLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboLoai.setLabeText("Loại Sản Phẩm");
        cboLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiActionPerformed(evt);
            }
        });

        btnThemSP.setBackground(new java.awt.Color(51, 51, 51));
        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSP.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSP.setText("Thêm Sản Phẩm");
        btnThemSP.setContentAreaFilled(false);
        btnThemSP.setOpaque(true);
        btnThemSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemSPMouseExited(evt);
            }
        });
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
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

        javax.swing.GroupLayout pnlDanhSachSPLayout = new javax.swing.GroupLayout(pnlDanhSachSP);
        pnlDanhSachSP.setLayout(pnlDanhSachSPLayout);
        pnlDanhSachSPLayout.setHorizontalGroup(
            pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPLayout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlDanhSachSPLayout.setVerticalGroup(
            pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhSachSPLayout.createSequentialGroup()
                        .addComponent(btnThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(pnlDanhSachSPLayout.createSequentialGroup()
                        .addGroup(pnlDanhSachSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCard.add(pnlDanhSachSP, "DanhSachSP");

        pnlSPDaXoa.setOpaque(false);

        tblSPDaXoa.setBackground(new java.awt.Color(255, 255, 255));
        tblSPDaXoa.setForeground(new java.awt.Color(51, 51, 51));
        tblSPDaXoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ảnh", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Giá", "Chỉnh Sửa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSPDaXoa.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(tblSPDaXoa);
        if (tblSPDaXoa.getColumnModel().getColumnCount() > 0) {
            tblSPDaXoa.getColumnModel().getColumn(0).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblSPDaXoa.getColumnModel().getColumn(1).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblSPDaXoa.getColumnModel().getColumn(2).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(2).setPreferredWidth(450);
            tblSPDaXoa.getColumnModel().getColumn(3).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblSPDaXoa.getColumnModel().getColumn(4).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblSPDaXoa.getColumnModel().getColumn(5).setResizable(false);
            tblSPDaXoa.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        cboLoai1.setBackground(new java.awt.Color(250, 250, 250));
        cboLoai1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboLoai1.setLabeText("Loại Sản Phẩm");
        cboLoai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoai1ActionPerformed(evt);
            }
        });

        txtTimKiem1.setBackground(new java.awt.Color(250, 250, 250));
        txtTimKiem1.setForeground(new java.awt.Color(51, 51, 51));
        txtTimKiem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTimKiem1.setLabelText("Tìm kiếm");
        txtTimKiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSPDaXoaLayout = new javax.swing.GroupLayout(pnlSPDaXoa);
        pnlSPDaXoa.setLayout(pnlSPDaXoaLayout);
        pnlSPDaXoaLayout.setHorizontalGroup(
            pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSPDaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(pnlSPDaXoaLayout.createSequentialGroup()
                        .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 641, Short.MAX_VALUE))))
        );
        pnlSPDaXoaLayout.setVerticalGroup(
            pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSPDaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSPDaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCard.add(pnlSPDaXoa, "SPDaXoa");

        add(pnlCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1260, 520));
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDanhSachTK"> 
    private void btnDanhSachSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachSPActionPerformed
        pressTabButton(btnDanhSachSP);
    }//GEN-LAST:event_btnDanhSachSPActionPerformed

    private void btnDanhSachSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachSPMouseEntered
        XHover.enterTabButton(btnDanhSachSP, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDanhSachSPMouseEntered

    private void btnDanhSachSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachSPMouseExited
        XHover.exitTabButton(btnDanhSachSP);
    }//GEN-LAST:event_btnDanhSachSPMouseExited
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnTKDaXoa"> 
    private void btnSPDaXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPDaXoaActionPerformed
        pressTabButton(btnSPDaXoa);
    }//GEN-LAST:event_btnSPDaXoaActionPerformed

    private void btnSPDaXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPDaXoaMouseEntered
        XHover.enterTabButton(btnSPDaXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnSPDaXoaMouseEntered

    private void btnSPDaXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPDaXoaMouseExited
        XHover.exitTabButton(btnSPDaXoa);
    }//GEN-LAST:event_btnSPDaXoaMouseExited

   // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event cboLoai">
    private void cboLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiActionPerformed
        selectCombobox(tblDanhSachSP,cboLoai,list);
    }//GEN-LAST:event_cboLoaiActionPerformed

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Event btnThemTK">
    private void btnThemSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSPMouseEntered
        XHover.enterButton(btnThemSP, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnThemSPMouseEntered

    private void btnThemSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSPMouseExited
        XHover.exitButton(btnThemSP);
    }//GEN-LAST:event_btnThemSPMouseExited

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        XPanel.mainForm.setEnabled(false);
        dialogInfo.setVisible(true);
        dialogInfo.clearForm();
    }//GEN-LAST:event_btnThemSPActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboLoai1">
    private void cboLoai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoai1ActionPerformed
        selectCombobox(tblSPDaXoa,cboLoai1,listDeleted);
    }//GEN-LAST:event_cboLoai1ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event txtTimKiem">
    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        search(tblDanhSachSP, txtTimKiem, list);
    }//GEN-LAST:event_txtTimKiemKeyReleased
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event txtTimKiem1">
    private void txtTimKiem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem1KeyReleased
        search(tblSPDaXoa, txtTimKiem1, listDeleted);
    }//GEN-LAST:event_txtTimKiem1KeyReleased
    // </editor-fold> 
    
    // -------------------- End Event --------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachSP;
    private javax.swing.JButton btnSPDaXoa;
    private javax.swing.JButton btnThemSP;
    private com.unknownshop.swing.combobox.ComboboxWhite cboLoai;
    private com.unknownshop.swing.combobox.ComboboxWhite cboLoai1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlDanhSachSP;
    private javax.swing.JPanel pnlSPDaXoa;
    private javax.swing.JPanel pnlTabButton;
    private com.unknownshop.swing.table.Table tblDanhSachSP;
    private com.unknownshop.swing.table.Table tblSPDaXoa;
    private com.unknownshop.swing.textfield.TextFieldWhite txtTimKiem;
    private com.unknownshop.swing.textfield.TextFieldWhite txtTimKiem1;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        XTable.setCellAlignmentCenter(tblDanhSachSP,0);
        XTable.setCellAlignmentCenter(tblSPDaXoa,0);
        fillCboLoai(cboLoai,cboLoai1);
        fillTableProduct(true);
        fillTableProductDeleted(true);
        // gán vào lớp tiện ích
        XPanel.panelProManager = this;
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
        JButton button[] = {btnDanhSachSP, btnSPDaXoa};
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
    
// _____________________ DS Sản Phẩm _____________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào combobox loại"> 
    private void fillCboLoai(JComboBox... combo){
        for (JComboBox cbo : combo) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
            model.removeAllElements();
            model.addElement("Tất cả các loại");
            List<ProductTypes> list = proTypeDao.getList();
            for (ProductTypes proType : list) {
                model.addElement(proType);
            }
            cbo.setSelectedIndex(-1);
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng sản phẩm">
    public void fillTableProduct(boolean check) {
        if(cboLoai.getSelectedIndex() >= 0) cboLoai.setSelectedIndex(0);
        else cboLoai.setSelectedIndex(-1);
        DefaultTableModel model = (DefaultTableModel) tblDanhSachSP.getModel();
        model.setRowCount(0);
        if(check) {
            list = proDao.selectByIdPro(0);
        }
        for (Products pro : list) {
            model.addRow(new RowTableProduct(pro).toRowTable(0));
        }
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chọn combobox Loai">
    private void selectCombobox(JTable table, JComboBox cbo, List<Products> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        if(cbo.getSelectedIndex() == 0){
            if(cbo.equals(cboLoai)) fillTableProduct(false);
            else fillTableProductDeleted(false);
        }else if (cbo.getSelectedIndex() > 0){
            ProductTypes proType = (ProductTypes) cbo.getSelectedItem();
            for (Products pro : list) {
                if(pro.getTypeId() == proType.getId()){
                    model.addRow(new RowTableProduct(pro).toRowTable(0));
                }
            }
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức đưa thông tin tài khoản lên form">
    public void edit(){
        row = tblDanhSachSP.getSelectedRow();
        int id = Integer.valueOf(tblDanhSachSP.getValueAt(row, 1).toString());
        Products product = new Products();
        for (Products pro : list) {
            if(pro.getId() == id) product = pro; 
        }
        if(dialogInfo.isVisible()){
            dialogInfo.setForm(product);
        }else{
            XPanel.mainForm.setEnabled(false);
            dialogInfo.setVisible(true);
            dialogInfo.setForm(product);
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa hàng được chọn">
    public void removeRow(){
        row = tblDanhSachSP.getSelectedRow();
        int id = Integer.valueOf(tblDanhSachSP.getValueAt(row, 1).toString());
        if(XMess.confirm(null, "Bạn có chắc muốn xóa sản phẩm này")){
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    XPanel.mainForm.setEnabled(false);
                    if(proDao.delete(id) == 0){
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null, "Xóa sản phẩm thất bại!");
                    }else{
                        fillTableProduct(true);
                        fillTableProductDeleted(true);
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null, "Xóa sản phẩm thành công");
                    }
                }
            }.start();
        }
    }
    // </editor-fold>
    
// _______________________ SP Đã xóa ______________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền vào bảng sản phẩm đã xóa">
    public void fillTableProductDeleted(boolean check) {
        if(cboLoai1.getSelectedIndex() >= 0) cboLoai1.setSelectedIndex(0);
        else cboLoai1.setSelectedIndex(-1);
        DefaultTableModel model = (DefaultTableModel) tblSPDaXoa.getModel();
        model.setRowCount(0);
        if(check) {
            listDeleted = proDao.getListDelete(0);
        }
        for (Products pro : listDeleted) {
            model.addRow(new RowTableProduct(pro).toRowTable(1));
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức phục hồi sản phẩm">  
    public void restore(){
        int row1 = tblSPDaXoa.getSelectedRow();
        int id = Integer.valueOf(tblSPDaXoa.getValueAt(row1, 1).toString());
        if(XMess.confirm(this, "Bạn muốn phục hồi sản phẩm này?")){
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    XPanel.mainForm.setEnabled(false);
                    if(proDao.restore(id) == 0){
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null,"Phục hồi sản phẩm thất bại!");
                    }else{
                        fillTableProductDeleted(true);
                        fillTableProduct(true);
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null,"Phục hồi sản phẩm thành công!");
                    }
                }
            }.start();
        }
    }
    // </editor-fold>
    
// _____________ Điều khiển _____________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức các nút điều khiển"> 
    public void first(){
        tblDanhSachSP.setRowSelectionInterval(0, 0);
        edit();
        dialogInfo.first();
    }
    
    public void prev(){
        if(row > 0){
            tblDanhSachSP.setRowSelectionInterval(--row, row);
            edit();
        }
        if(row == 0){
            dialogInfo.prev(true);
        }else if(row == list.size()-2){
            dialogInfo.prev(false);
        }
    }
    
    public void next(){
        if(row < list.size()-1){
            tblDanhSachSP.setRowSelectionInterval(++row, row);
            edit();
        }
        if(row == list.size()-1){
            dialogInfo.next(true);
        }else if(row == 1){
            dialogInfo.prev(false);
        }
    }
    
    public void last(){
        int index = tblDanhSachSP.getRowCount() - 1;
        tblDanhSachSP.setRowSelectionInterval(index, index);
        edit();
        dialogInfo.last();
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức tìm kiếm sản phẩm">    
    private void search(JTable table, JTextField txt, List<Products> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String text = txt.getText().toLowerCase();
        // Đưa danh sách thông tin lên bảng
        model.setRowCount(0);
        for (Products pr : list) {
            String id = String.valueOf(pr.getId());
            String name = pr.getName().toString().toLowerCase();
            String Quantity = String.valueOf(pr.getQuantity());
            String price = String.valueOf(pr.getPrice());
            boolean check = id.contains(text)
                    || name.contains(text)
                    || Quantity.contains(text) || price.contains(text);
            if (check) {
                if(table.equals(tblDanhSachSP))
                    model.addRow(new RowTableProduct(pr).toRowTable(0));
                else model.addRow(new RowTableProduct(pr).toRowTable(1));
            }
        }
    }
    //</editor-fold>
    
// ---------------------- End Method ----------------------
    
}
