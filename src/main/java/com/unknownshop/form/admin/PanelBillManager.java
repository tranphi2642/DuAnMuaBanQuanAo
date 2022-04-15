package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.OrderDAO;
import com.unknownshop.dao.OrderDetailDAO;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.swing.table.RowTableBill;
import com.unknownshop.swing.table.RowTableBillDetails;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XMoney;
import com.unknownshop.util.XPanel;
import com.unknownshop.util.XTable;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;


public class PanelBillManager extends javax.swing.JPanel {

    DefaultTableModel modelCXN;
    DefaultTableModel modelDXN;
    DefaultTableModel modelProduct;
    List<Object[]> listCXN;
    List<Object[]> listDXN;
    List<Object[]> listProduct;
    OrderDAO dao = new OrderDAO();
    OrderDetailDAO daoDetail = new OrderDetailDAO();
    
    public PanelBillManager() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabButton = new javax.swing.JPanel();
        btnDanhSachHD = new javax.swing.JButton();
        btnDSHoaDonXN = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        DanhSachHD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachHD = new com.unknownshop.swing.table.Table();
        btnDuyet = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        DSHoaDonXN = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSHoaDonXN = new com.unknownshop.swing.table.Table();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnDanhSachHD.setBackground(new java.awt.Color(51, 51, 51));
        btnDanhSachHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDanhSachHD.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachHD.setText("Danh Sách Hóa Đơn Chưa Xác Nhận");
        btnDanhSachHD.setToolTipText("DanhSachHD");
        btnDanhSachHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnDanhSachHD.setContentAreaFilled(false);
        btnDanhSachHD.setOpaque(true);
        btnDanhSachHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDanhSachHDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDanhSachHDMouseExited(evt);
            }
        });
        btnDanhSachHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachHDActionPerformed(evt);
            }
        });

        btnDSHoaDonXN.setBackground(new java.awt.Color(51, 51, 51));
        btnDSHoaDonXN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDSHoaDonXN.setForeground(new java.awt.Color(51, 51, 51));
        btnDSHoaDonXN.setText("Danh Sách Hóa Đơn Đã Xác Nhận");
        btnDSHoaDonXN.setToolTipText("DSHoaDonXN");
        btnDSHoaDonXN.setContentAreaFilled(false);
        btnDSHoaDonXN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDSHoaDonXNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDSHoaDonXNMouseExited(evt);
            }
        });
        btnDSHoaDonXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSHoaDonXNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnDanhSachHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDSHoaDonXN, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDanhSachHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnDSHoaDonXN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        DanhSachHD.setOpaque(false);

        tblDanhSachHD.setBackground(new java.awt.Color(255, 255, 255));
        tblDanhSachHD.setForeground(new java.awt.Color(51, 51, 51));
        tblDanhSachHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Tài Khoản", "Số Điện Thoại", "Địa Chỉ", "Số Lượng Sản Phẩm", "Giá", "Tùy Chọn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachHD.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDanhSachHD.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblDanhSachHD);
        if (tblDanhSachHD.getColumnModel().getColumnCount() > 0) {
            tblDanhSachHD.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblDanhSachHD.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblDanhSachHD.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(2).setPreferredWidth(400);
            tblDanhSachHD.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblDanhSachHD.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblDanhSachHD.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachHD.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        btnDuyet.setBackground(new java.awt.Color(51, 51, 51));
        btnDuyet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDuyet.setForeground(new java.awt.Color(255, 255, 255));
        btnDuyet.setText("Duyệt tất cả");
        btnDuyet.setContentAreaFilled(false);
        btnDuyet.setOpaque(true);
        btnDuyet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDuyetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDuyetMouseExited(evt);
            }
        });
        btnDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuyetActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(51, 51, 51));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy tất cả");
        btnHuy.setContentAreaFilled(false);
        btnHuy.setOpaque(true);
        btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHuyMouseExited(evt);
            }
        });
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DanhSachHDLayout = new javax.swing.GroupLayout(DanhSachHD);
        DanhSachHD.setLayout(DanhSachHDLayout);
        DanhSachHDLayout.setHorizontalGroup(
            DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DanhSachHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DanhSachHDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DanhSachHDLayout.setVerticalGroup(
            DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DanhSachHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DanhSachHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(DanhSachHD, "DanhSachHD");

        DSHoaDonXN.setOpaque(false);

        tblDSHoaDonXN.setBackground(new java.awt.Color(255, 255, 255));
        tblDSHoaDonXN.setForeground(new java.awt.Color(51, 51, 51));
        tblDSHoaDonXN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Và Tên", "Số Điện Thoại", "Địa Chỉ", "Số Lượng Sản Phẩm", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSHoaDonXN.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblDSHoaDonXN.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblDSHoaDonXN);
        if (tblDSHoaDonXN.getColumnModel().getColumnCount() > 0) {
            tblDSHoaDonXN.getColumnModel().getColumn(0).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblDSHoaDonXN.getColumnModel().getColumn(1).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(1).setPreferredWidth(350);
            tblDSHoaDonXN.getColumnModel().getColumn(2).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblDSHoaDonXN.getColumnModel().getColumn(3).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblDSHoaDonXN.getColumnModel().getColumn(4).setResizable(false);
            tblDSHoaDonXN.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        javax.swing.GroupLayout DSHoaDonXNLayout = new javax.swing.GroupLayout(DSHoaDonXN);
        DSHoaDonXN.setLayout(DSHoaDonXNLayout);
        DSHoaDonXNLayout.setHorizontalGroup(
            DSHoaDonXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DSHoaDonXNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                .addContainerGap())
        );
        DSHoaDonXNLayout.setVerticalGroup(
            DSHoaDonXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DSHoaDonXNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCard.add(DSHoaDonXN, "DSHoaDonXN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlTabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnDanhSachHD"> 
    private void btnDanhSachHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachHDMouseEntered
        XHover.enterTabButton(btnDanhSachHD, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDanhSachHDMouseEntered

    private void btnDanhSachHDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachHDMouseExited
        XHover.exitTabButton(btnDanhSachHD);
    }//GEN-LAST:event_btnDanhSachHDMouseExited

    private void btnDanhSachHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachHDActionPerformed
        pressTabButton(btnDanhSachHD);
    }//GEN-LAST:event_btnDanhSachHDActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDuyet"> 
    private void btnDuyetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDuyetMouseEntered
        XHover.enterButton(btnDuyet, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDuyetMouseEntered

    private void btnDuyetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDuyetMouseExited
        XHover.exitButton(btnDuyet);
    }//GEN-LAST:event_btnDuyetMouseExited

    private void btnDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuyetActionPerformed
        confirmAll();
    }//GEN-LAST:event_btnDuyetActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnHuy"> 
    private void btnHuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseEntered
        XHover.enterButton(btnHuy, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnHuyMouseEntered

    private void btnHuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseExited
        XHover.exitButton(btnHuy);
    }//GEN-LAST:event_btnHuyMouseExited

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        cancelAll();
    }//GEN-LAST:event_btnHuyActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDSHoaDOnXN"> 
    private void btnDSHoaDonXNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSHoaDonXNMouseEntered
        XHover.enterTabButton(btnDSHoaDonXN, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnDSHoaDonXNMouseEntered

    private void btnDSHoaDonXNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSHoaDonXNMouseExited
        XHover.exitTabButton(btnDSHoaDonXN);
    }//GEN-LAST:event_btnDSHoaDonXNMouseExited

    private void btnDSHoaDonXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSHoaDonXNActionPerformed
        pressTabButton(btnDSHoaDonXN);
    }//GEN-LAST:event_btnDSHoaDonXNActionPerformed
    // </editor-fold> 
    
// ---------------------- End Event ----------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DSHoaDonXN;
    private javax.swing.JPanel DanhSachHD;
    private javax.swing.JButton btnDSHoaDonXN;
    private javax.swing.JButton btnDanhSachHD;
    private javax.swing.JButton btnDuyet;
    private javax.swing.JButton btnHuy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlTabButton;
    private com.unknownshop.swing.table.Table tblDSHoaDonXN;
    private com.unknownshop.swing.table.Table tblDanhSachHD;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        modelCXN = (DefaultTableModel) tblDanhSachHD.getModel();
        modelDXN = (DefaultTableModel) tblDSHoaDonXN.getModel();
        XTable.setCellAlignmentCenter(tblDanhSachHD, 1);
        XTable.setCellAlignmentCenter(tblDSHoaDonXN, 2);
        fillTabelDS(true);
        fillTabelDSDXN(true);
        XPanel.panelBillManager = this;
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
        JButton button[] = {btnDanhSachHD, btnDSHoaDonXN};
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
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên bảng ds hóa đơn chưa xn">    
    private void fillTabelDS(boolean check){
        modelCXN.setRowCount(0);
        if(check) {
            listCXN = dao.getListUnconfirmOrders();
        }
        for (Object[] obj : listCXN) {
            modelCXN.addRow(new RowTableBill(obj).toRowTable());
        }
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên bảng ds hóa đơn đã xác nhận">    
    private void fillTabelDSDXN(boolean check){
        modelDXN.setRowCount(0);
        if(check) {
            listDXN = dao.getListConfirmOrders();
        }
        for (Object[] obj : listDXN) {
            modelDXN.addRow(new Object[]{
                obj[1], obj[2], obj[3], obj[4],
                XMoney.convertMoney(Float.valueOf(obj[5].toString()))+" VNĐ"
            });
        }
    } 
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức chuyển thông tin sang hóa đơn chi tiết">
    public void edit() {
        // Tạo luồng và hiện dialog loading
        DialogLoading dlog = new DialogLoading();
        dlog.setVisible(true);
        new Thread(){
            @Override
            public void run(){
                XPanel.mainForm.setEnabled(false);
                int row = tblDanhSachHD.getSelectedRow();
                Object[] obj = listCXN.get(row);
                listProduct = daoDetail.getListProduct((int) obj[0]);
                new DialogInfoBill(listProduct).setVisible(true);
                dlog.setVisible(false);
            }
        }.start();
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa hóa đơn">
    public void removeRow() {
        int row = tblDanhSachHD.getSelectedRow();
        Object[] obj = listCXN.get(row);
        if(XMess.confirm(null, "Bạn muốn xóa hóa đơn này?")){
            if (dao.delete(Integer.parseInt(obj[0].toString())) == 0) {
                XMess.alert(this, "Xóa hóa đơn thất bại!");
            } else {
                XMess.alert(null, "Xóa hóa đơn thành công");
                listCXN.remove(row);
                fillTabelDS(false);
            }
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Phương thức xác nhận hóa đơn">
    public void confirm() {
        int row = tblDanhSachHD.getSelectedRow();
        Object[] obj = listCXN.get(row);
        if(XMess.confirm(null, "Bạn muốn xác nhận hóa đơn này?")){
            new Thread(){
                @Override
                public void run(){DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    XPanel.mainForm.setEnabled(false);
                    // Tải thông tin tài khoản lên form
                    List<Object[]> list = dao.confirmOrders(Integer.parseInt(obj[0].toString()));
                    String content = "";
                    if (list.size() != 0) {
                        for (Object[] object : list) {
                            content += "Sản phẩm "+ object[1]+" không đủ số lượng("
                                        +object[2]+" > "+object[3]+")\n";
                        }
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null, content);
                    }else {
                        fillTabelDS(true);
                        fillTabelDSDXN(true);
                        XPanel.mainForm.setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null, "Xác nhận đơn thành công");
                    }
                }
            }.start();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa tất cả hóa đơn">
    private void cancelAll() {
        new Thread(){
            @Override
            public void run(){DialogLoading dlog = new DialogLoading();
                dlog.setVisible(true);
                XPanel.mainForm.setEnabled(false);
                if (dao.deleteAll() == 0) {
                    XPanel.mainForm.setEnabled(true);
                    dlog.setVisible(false);
                    XMess.alert(null, "Xóa hóa đơn thất bại!");
                } else {
                    fillTabelDS(true);
                    XPanel.mainForm.setEnabled(true);
                    dlog.setVisible(false);
                    XMess.alert(null, "Xóa hóa đơn thành công");
                }
            }
        }.start();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Phương thức xác nhận tất cả hóa đơn">
    private void confirmAll() {
        new Thread(){
            @Override
            public void run(){DialogLoading dlog = new DialogLoading();
                dlog.setVisible(true);
                XPanel.mainForm.setEnabled(false);
                dao.confirmAllOrders();
                fillTabelDS(true);
                fillTabelDSDXN(true);
                XPanel.mainForm.setEnabled(true);
                dlog.setVisible(false);
                XMess.alert(null, "Xác nhận đơn thành công");
            }
        }.start();
    }
    // </editor-fold>
    
// ----------------------  End Method  ----------------------
}
