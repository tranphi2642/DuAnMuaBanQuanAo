package com.unknownshop.form.user;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.ProductDAO;
import com.unknownshop.util.XList;
import com.unknownshop.util.XPanel;
import java.awt.Component;
import java.awt.event.ActionListener;

public class HomeUser extends javax.swing.JPanel {

    private ProductDAO productDAO = new ProductDAO();
    
    public HomeUser() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCard = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        lblQC2 = new javax.swing.JLabel();
        lblQC3 = new javax.swing.JLabel();
        lblQC1 = new javax.swing.JLabel();
        lblQU4 = new javax.swing.JLabel();
        pnlTaiKhoan = new javax.swing.JPanel();
        pnlDangKy = new javax.swing.JPanel();
        pnlDangNhap = new javax.swing.JPanel();
        pnlAo = new javax.swing.JPanel();
        pnlQuan = new javax.swing.JPanel();
        pnlPhuKien = new javax.swing.JPanel();
        pnlGiay = new javax.swing.JPanel();
        pnlGioHang = new javax.swing.JPanel();
        pnlFooter = new com.unknownshop.fragment.footer.Footer();
        pnlHeader = new com.unknownshop.fragment.header.Header();

        setBackground(new java.awt.Color(250, 250, 250));

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(204, 0, 0));
        pnlHome.setOpaque(false);

        lblQC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QC2.jpg"))); // NOI18N
        lblQC2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));

        lblQC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QC3.jpg"))); // NOI18N
        lblQC3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));

        lblQC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QC1.jpg"))); // NOI18N
        lblQC1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));

        lblQU4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QC4.jpg"))); // NOI18N
        lblQU4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(lblQC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQU4))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(lblQC3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQC2)))
                .addGap(14, 14, 14))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQC2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQC3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQU4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQC1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlCard.add(pnlHome, "Home");

        pnlTaiKhoan.setOpaque(false);
        pnlTaiKhoan.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlTaiKhoan, "TaiKhoan");

        pnlDangKy.setOpaque(false);
        pnlDangKy.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlDangKy, "DangKy");

        pnlDangNhap.setBackground(new java.awt.Color(51, 51, 51));
        pnlDangNhap.setOpaque(false);
        pnlDangNhap.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlDangNhap, "DangNhap");

        pnlAo.setBackground(new java.awt.Color(0, 204, 204));
        pnlAo.setOpaque(false);
        pnlAo.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlAo, "Ao");

        pnlQuan.setOpaque(false);
        pnlQuan.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlQuan, "Quan");

        pnlPhuKien.setOpaque(false);
        pnlPhuKien.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlPhuKien, "PhuKien");

        pnlGiay.setOpaque(false);
        pnlGiay.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlGiay, "Giay");

        pnlGioHang.setOpaque(false);
        pnlGioHang.setLayout(new java.awt.GridLayout(1, 0));
        pnlCard.add(pnlGioHang, "GioHang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblQC1;
    private javax.swing.JLabel lblQC2;
    private javax.swing.JLabel lblQC3;
    private javax.swing.JLabel lblQU4;
    private javax.swing.JPanel pnlAo;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlDangKy;
    private javax.swing.JPanel pnlDangNhap;
    private com.unknownshop.fragment.footer.Footer pnlFooter;
    private javax.swing.JPanel pnlGiay;
    private javax.swing.JPanel pnlGioHang;
    private com.unknownshop.fragment.header.Header pnlHeader;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlPhuKien;
    private javax.swing.JPanel pnlQuan;
    private javax.swing.JPanel pnlTaiKhoan;
    // End of variables declaration//GEN-END:variables
// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init(){
        // Gán panel vào lớp tiện ích
        XPanel.panelCardUser = pnlCard;
        XPanel.panelTaiKhoan = pnlTaiKhoan;
        XPanel.panelDangNhap = pnlDangNhap;
        XPanel.panelDangKy = pnlDangKy;
        XPanel.panelCart = pnlGioHang;
        XPanel.panelHeader = pnlHeader;
        XPanel.panelHeader.setSign();
        XPanel.nameCard = "Home";
        
        // Tải các danh sách sản phẩm theo loại
        XList.listAo = productDAO.selectByIdPro(XConstant.ID_AO);
        XList.listQuan = productDAO.selectByIdPro(XConstant.ID_QUAN);
        XList.listPhuKien = productDAO.selectByIdPro(XConstant.ID_PHUKIEN);
        XList.listGiay = productDAO.selectByIdPro(XConstant.ID_GIAY);
        
        // Thêm các panel vào form
        addPanelIntoFrame();
        if(XPanel.dlgWelcome != null){
            XPanel.dlgWelcome.setVisible(false);
        }
    } 
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phương thức thêm panel vào form">    
    private void addPanelIntoFrame(){
        // Thêm vào panel danh sách áo
        pnlAo.add(new PanelListPageProduct(XConstant.ID_AO));
        pnlQuan.add(new PanelListPageProduct(XConstant.ID_QUAN));
        pnlPhuKien.add(new PanelListPageProduct(XConstant.ID_PHUKIEN));
        pnlGiay.add(new PanelListPageProduct(XConstant.ID_GIAY));
    } 
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phương thức thêm sự kiện menu"> 
    public void addEventMenu(ActionListener event) {
        pnlHeader.addEventMenu(event);
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa và thêm panel mới"> 
    public void show(Component com) {
        pnlCard.removeAll();
        pnlCard.add(com);
        pnlCard.repaint();
        pnlCard.revalidate();
    }
    // </editor-fold> 

// ----------------------  End Method  ----------------------
}
