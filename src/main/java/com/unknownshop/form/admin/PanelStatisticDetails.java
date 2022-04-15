package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.ThongKeDAO;
import com.unknownshop.util.Auth;
import com.unknownshop.util.XExcel;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XMoney;
import com.unknownshop.util.XTable;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelStatisticDetails extends javax.swing.JPanel {

    private DefaultTableModel modelSP;
    private DefaultTableModel modelKH;
    private DefaultTableModel modelDoanhThu;
    private ThongKeDAO dao = new ThongKeDAO();
    private List<Object[]> listSP = new ArrayList<>();
    private List<Object[]> listKH = new ArrayList<>();
    private List<Object[]> listDT = new ArrayList<>();
    private Object[] titleDT = {"Loại sản phẩm","Số lượng bán được","Số tiền bán được"};
    private Object[] titleKH = {"Họ và tên","Tài khoản","Số sản phẩm đã mua"};
    private Object[] titleSP = {"Tên sản phẩm","Tổng tiền","Số lượng"};
    private List<Object[]> listKhachHang;
    
    public PanelStatisticDetails() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTabButton = new javax.swing.JPanel();
        btnTKSanPham = new javax.swing.JButton();
        btnTKDoanhThu = new javax.swing.JButton();
        btnTKKhachHang = new javax.swing.JButton();
        pnlCard = new javax.swing.JPanel();
        pnlTKSanPham = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTKSanPham = new com.unknownshop.swing.table.Table();
        btnExcel1 = new javax.swing.JButton();
        btnPDF1 = new javax.swing.JButton();
        cboThang = new com.unknownshop.swing.combobox.ComboboxWhite();
        cboNam = new com.unknownshop.swing.combobox.ComboboxWhite();
        cboLoaiSP = new com.unknownshop.swing.combobox.ComboboxWhite();
        pnlTKKhachHang = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTKKhachHang = new com.unknownshop.swing.table.Table();
        btnExcel2 = new javax.swing.JButton();
        btnPDF2 = new javax.swing.JButton();
        cboXepHang = new com.unknownshop.swing.combobox.ComboboxWhite();
        pnlDoanhThu = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTKDoanhThu = new com.unknownshop.swing.table.Table();
        btnExcel3 = new javax.swing.JButton();
        btnPDF3 = new javax.swing.JButton();
        cboDoanhThuNam = new com.unknownshop.swing.combobox.ComboboxWhite();
        panelSecurity = new com.unknownshop.form.admin.PanelSecurityNormal();

        setBackground(new java.awt.Color(255, 204, 204));
        setOpaque(false);

        pnlTabButton.setBackground(new java.awt.Color(0, 102, 204));

        btnTKSanPham.setBackground(new java.awt.Color(51, 51, 51));
        btnTKSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTKSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnTKSanPham.setText("Thống Kê Sản Phẩm Bán Chạy");
        btnTKSanPham.setToolTipText("TKSanPham");
        btnTKSanPham.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));
        btnTKSanPham.setContentAreaFilled(false);
        btnTKSanPham.setOpaque(true);
        btnTKSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKSanPhamMouseExited(evt);
            }
        });
        btnTKSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKSanPhamActionPerformed(evt);
            }
        });

        btnTKDoanhThu.setBackground(new java.awt.Color(51, 51, 51));
        btnTKDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTKDoanhThu.setForeground(new java.awt.Color(51, 51, 51));
        btnTKDoanhThu.setText("Thống Kê Doanh Thu");
        btnTKDoanhThu.setToolTipText("DoanhThu");
        btnTKDoanhThu.setContentAreaFilled(false);
        btnTKDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKDoanhThuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKDoanhThuMouseExited(evt);
            }
        });
        btnTKDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKDoanhThuActionPerformed(evt);
            }
        });

        btnTKKhachHang.setBackground(new java.awt.Color(51, 51, 51));
        btnTKKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTKKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        btnTKKhachHang.setText("Thống Kê Khách Hàng Thân Thiết");
        btnTKKhachHang.setToolTipText("TKKhachHang");
        btnTKKhachHang.setContentAreaFilled(false);
        btnTKKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKKhachHangMouseExited(evt);
            }
        });
        btnTKKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTabButtonLayout = new javax.swing.GroupLayout(pnlTabButton);
        pnlTabButton.setLayout(pnlTabButtonLayout);
        pnlTabButtonLayout.setHorizontalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addComponent(btnTKSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTKKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTKDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTabButtonLayout.setVerticalGroup(
            pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabButtonLayout.createSequentialGroup()
                .addGroup(pnlTabButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTKSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnTKKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTKDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCard.setOpaque(false);
        pnlCard.setLayout(new java.awt.CardLayout());

        pnlTKSanPham.setOpaque(false);

        tblTKSanPham.setBackground(new java.awt.Color(255, 255, 255));
        tblTKSanPham.setForeground(new java.awt.Color(51, 51, 51));
        tblTKSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản Phẩm", "Tổng Tiền", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTKSanPham.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblTKSanPham.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblTKSanPham);
        if (tblTKSanPham.getColumnModel().getColumnCount() > 0) {
            tblTKSanPham.getColumnModel().getColumn(0).setResizable(false);
            tblTKSanPham.getColumnModel().getColumn(1).setResizable(false);
            tblTKSanPham.getColumnModel().getColumn(2).setResizable(false);
        }

        btnExcel1.setBackground(new java.awt.Color(51, 51, 51));
        btnExcel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcel1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel1.setText("Xuất File Excel");
        btnExcel1.setContentAreaFilled(false);
        btnExcel1.setOpaque(true);
        btnExcel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcel1MouseExited(evt);
            }
        });
        btnExcel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel1ActionPerformed(evt);
            }
        });

        btnPDF1.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF1.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF1.setText("Xuất File PDF");
        btnPDF1.setContentAreaFilled(false);
        btnPDF1.setOpaque(true);
        btnPDF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDF1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDF1MouseExited(evt);
            }
        });
        btnPDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF1ActionPerformed(evt);
            }
        });

        cboThang.setBackground(new java.awt.Color(250, 250, 250));
        cboThang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.setSelectedIndex(-1);
        cboThang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboThang.setLabeText("Tháng");
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        cboNam.setBackground(new java.awt.Color(250, 250, 250));
        cboNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021" }));
        cboNam.setSelectedIndex(-1);
        cboNam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboNam.setLabeText("Năm");
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        cboLoaiSP.setBackground(new java.awt.Color(250, 250, 250));
        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả các loại", "Áo", "Quần", "Phụ Kiện", "Giày" }));
        cboLoaiSP.setSelectedIndex(-1);
        cboLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboLoaiSP.setLabeText(" Loại sản phẩm");
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTKSanPhamLayout = new javax.swing.GroupLayout(pnlTKSanPham);
        pnlTKSanPham.setLayout(pnlTKSanPhamLayout);
        pnlTKSanPhamLayout.setHorizontalGroup(
            pnlTKSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTKSanPhamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTKSanPhamLayout.createSequentialGroup()
                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTKSanPhamLayout.setVerticalGroup(
            pnlTKSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTKSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(pnlTKSanPham, "TKSanPham");

        pnlTKKhachHang.setOpaque(false);

        tblTKKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        tblTKKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        tblTKKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Và Tên", "Tên Tài Khoản", "Số Sản Phẩm  Đã Mua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTKKhachHang.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblTKKhachHang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblTKKhachHang);
        if (tblTKKhachHang.getColumnModel().getColumnCount() > 0) {
            tblTKKhachHang.getColumnModel().getColumn(0).setResizable(false);
            tblTKKhachHang.getColumnModel().getColumn(1).setResizable(false);
            tblTKKhachHang.getColumnModel().getColumn(2).setResizable(false);
        }

        btnExcel2.setBackground(new java.awt.Color(51, 51, 51));
        btnExcel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcel2.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel2.setText("Xuất File Excel");
        btnExcel2.setContentAreaFilled(false);
        btnExcel2.setOpaque(true);
        btnExcel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcel2MouseExited(evt);
            }
        });
        btnExcel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel2ActionPerformed(evt);
            }
        });

        btnPDF2.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF2.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF2.setText("Xuất File PDF");
        btnPDF2.setContentAreaFilled(false);
        btnPDF2.setOpaque(true);
        btnPDF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDF2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDF2MouseExited(evt);
            }
        });
        btnPDF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF2ActionPerformed(evt);
            }
        });

        cboXepHang.setBackground(new java.awt.Color(250, 250, 250));
        cboXepHang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Top 1", "Top 5", "Top 10", "Top 20", "Top 30", "Top 50", "Top 100" }));
        cboXepHang.setSelectedIndex(-1);
        cboXepHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboXepHang.setLabeText("Xếp hạng");
        cboXepHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboXepHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTKKhachHangLayout = new javax.swing.GroupLayout(pnlTKKhachHang);
        pnlTKKhachHang.setLayout(pnlTKKhachHangLayout);
        pnlTKKhachHangLayout.setHorizontalGroup(
            pnlTKKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTKKhachHangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTKKhachHangLayout.createSequentialGroup()
                        .addComponent(cboXepHang, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTKKhachHangLayout.setVerticalGroup(
            pnlTKKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboXepHang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTKKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(pnlTKKhachHang, "TKKhachHang");

        pnlDoanhThu.setOpaque(false);

        tblTKDoanhThu.setBackground(new java.awt.Color(255, 255, 255));
        tblTKDoanhThu.setForeground(new java.awt.Color(51, 51, 51));
        tblTKDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại Sản Phẩm", "Số Lượng Bán Được", "Số Tiền Bán Được"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTKDoanhThu.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblTKDoanhThu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tblTKDoanhThu);
        if (tblTKDoanhThu.getColumnModel().getColumnCount() > 0) {
            tblTKDoanhThu.getColumnModel().getColumn(0).setResizable(false);
            tblTKDoanhThu.getColumnModel().getColumn(1).setResizable(false);
            tblTKDoanhThu.getColumnModel().getColumn(2).setResizable(false);
        }

        btnExcel3.setBackground(new java.awt.Color(51, 51, 51));
        btnExcel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcel3.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel3.setText("Xuất File Excel");
        btnExcel3.setContentAreaFilled(false);
        btnExcel3.setOpaque(true);
        btnExcel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcel3MouseExited(evt);
            }
        });
        btnExcel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcel3ActionPerformed(evt);
            }
        });

        btnPDF3.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPDF3.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF3.setText("Xuất File PDF");
        btnPDF3.setContentAreaFilled(false);
        btnPDF3.setOpaque(true);
        btnPDF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPDF3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPDF3MouseExited(evt);
            }
        });
        btnPDF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDF3ActionPerformed(evt);
            }
        });

        cboDoanhThuNam.setBackground(new java.awt.Color(250, 250, 250));
        cboDoanhThuNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021" }));
        cboDoanhThuNam.setSelectedIndex(-1);
        cboDoanhThuNam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboDoanhThuNam.setLabeText("Năm");
        cboDoanhThuNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDoanhThuNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoanhThuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                        .addComponent(cboDoanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboDoanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPDF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCard.add(pnlDoanhThu, "DoanhThu");
        pnlCard.add(panelSecurity, "Security");

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
    private void btnTKSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKSanPhamMouseEntered
        XHover.enterTabButton(btnTKSanPham, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTKSanPhamMouseEntered

    private void btnTKSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKSanPhamMouseExited
        XHover.exitTabButton(btnTKSanPham);
    }//GEN-LAST:event_btnTKSanPhamMouseExited

    private void btnTKSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKSanPhamActionPerformed
        pressTabButton(btnTKSanPham);
    }//GEN-LAST:event_btnTKSanPhamActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnHDChiTiet"> 
    private void btnTKDoanhThuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDoanhThuMouseEntered
        XHover.enterTabButton(btnTKDoanhThu, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTKDoanhThuMouseEntered

    private void btnTKDoanhThuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDoanhThuMouseExited
        XHover.exitTabButton(btnTKDoanhThu);
    }//GEN-LAST:event_btnTKDoanhThuMouseExited

    private void btnTKDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKDoanhThuActionPerformed
        pressTabButton(btnTKDoanhThu);
    }//GEN-LAST:event_btnTKDoanhThuActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnExcel1"> 
    private void btnExcel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel1MouseEntered
        XHover.enterButton(btnExcel1, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnExcel1MouseEntered

    private void btnExcel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel1MouseExited
        XHover.exitButton(btnExcel1);
    }//GEN-LAST:event_btnExcel1MouseExited

    private void btnExcel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel1ActionPerformed
        exportToExcel(listSP,"SanPhamBanChay");
    }//GEN-LAST:event_btnExcel1ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnPDF1"> 
    private void btnPDF1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF1MouseEntered
        XHover.enterButton(btnPDF1, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPDF1MouseEntered

    private void btnPDF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF1MouseExited
        XHover.exitButton(btnPDF1);
    }//GEN-LAST:event_btnPDF1MouseExited

    private void btnPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF1ActionPerformed
        exportToPDF(tblTKSanPham, "Bảng Sản Phẩm Bán Chạy");
    }//GEN-LAST:event_btnPDF1ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnDSHoaDOnXN"> 
    private void btnTKKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKKhachHangMouseEntered
        XHover.enterTabButton(btnTKKhachHang, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnTKKhachHangMouseEntered

    private void btnTKKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKKhachHangMouseExited
        XHover.exitTabButton(btnTKKhachHang);
    }//GEN-LAST:event_btnTKKhachHangMouseExited

    private void btnTKKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKKhachHangActionPerformed
        pressTabButton(btnTKKhachHang);
    }//GEN-LAST:event_btnTKKhachHangActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnExcel2"> 
    private void btnExcel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel2MouseEntered
        XHover.enterButton(btnExcel2, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnExcel2MouseEntered

    private void btnExcel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel2MouseExited
        XHover.exitButton(btnExcel2);
    }//GEN-LAST:event_btnExcel2MouseExited

    private void btnExcel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel2ActionPerformed
        exportToExcel(listKH,"KhachHangThanThiet");
    }//GEN-LAST:event_btnExcel2ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnPDF2"> 
    private void btnPDF2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF2MouseEntered
        XHover.enterButton(btnPDF2, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPDF2MouseEntered

    private void btnPDF2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF2MouseExited
        XHover.exitButton(btnPDF2);
    }//GEN-LAST:event_btnPDF2MouseExited

    private void btnPDF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF2ActionPerformed
        exportToPDF(tblTKKhachHang, "Bảng Khách Hàng Than Thiết");
    }//GEN-LAST:event_btnPDF2ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnExcel3"> 
    private void btnExcel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel3MouseEntered
        XHover.enterButton(btnExcel3, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnExcel3MouseEntered

    private void btnExcel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcel3MouseExited
        XHover.exitButton(btnExcel3);
    }//GEN-LAST:event_btnExcel3MouseExited

    private void btnExcel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcel3ActionPerformed
        exportToExcel(listDT, "DoanhThu");
    }//GEN-LAST:event_btnExcel3ActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnPDF3"> 
    private void btnPDF3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF3MouseEntered
        XHover.enterButton(btnPDF3, XConstant.LIGHT_BLUE, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPDF3MouseEntered

    private void btnPDF3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDF3MouseExited
        XHover.exitButton(btnPDF3);
    }//GEN-LAST:event_btnPDF3MouseExited

    private void btnPDF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDF3ActionPerformed
        exportToPDF(tblTKDoanhThu, "Bảng Doanh Thu");
    }//GEN-LAST:event_btnPDF3ActionPerformed

   // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboThang"> 
    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        sellingProducts(true);
    }//GEN-LAST:event_cboThangActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboNam"> 
    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        sellingProducts(true);
    }//GEN-LAST:event_cboNamActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboLoaiSP"> 
    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        sellingProducts(true);
    }//GEN-LAST:event_cboLoaiSPActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboXepHang"> 
    private void cboXepHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboXepHangActionPerformed
        loyalCustomers();
    }//GEN-LAST:event_cboXepHangActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event cboDoanhThuNam"> 
    private void cboDoanhThuNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDoanhThuNamActionPerformed
        revenueByYear();
    }//GEN-LAST:event_cboDoanhThuNamActionPerformed
    // </editor-fold> 
    
// ---------------------- End Event ----------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel1;
    private javax.swing.JButton btnExcel2;
    private javax.swing.JButton btnExcel3;
    private javax.swing.JButton btnPDF1;
    private javax.swing.JButton btnPDF2;
    private javax.swing.JButton btnPDF3;
    private javax.swing.JButton btnTKDoanhThu;
    private javax.swing.JButton btnTKKhachHang;
    private javax.swing.JButton btnTKSanPham;
    private com.unknownshop.swing.combobox.ComboboxWhite cboDoanhThuNam;
    private com.unknownshop.swing.combobox.ComboboxWhite cboLoaiSP;
    private com.unknownshop.swing.combobox.ComboboxWhite cboNam;
    private com.unknownshop.swing.combobox.ComboboxWhite cboThang;
    private com.unknownshop.swing.combobox.ComboboxWhite cboXepHang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.unknownshop.form.admin.PanelSecurityNormal panelSecurity;
    private javax.swing.JPanel pnlCard;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlTKKhachHang;
    private javax.swing.JPanel pnlTKSanPham;
    private javax.swing.JPanel pnlTabButton;
    private com.unknownshop.swing.table.Table tblTKDoanhThu;
    private com.unknownshop.swing.table.Table tblTKKhachHang;
    private com.unknownshop.swing.table.Table tblTKSanPham;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form">    
    private void init() {
        modelSP = (DefaultTableModel) tblTKSanPham.getModel();
        modelKH = (DefaultTableModel) tblTKKhachHang.getModel();
        modelDoanhThu = (DefaultTableModel) tblTKDoanhThu.getModel();
        XTable.setCellAlignmentCenter(tblTKSanPham, 2);
        XTable.setCellAlignmentCenter(tblTKKhachHang, 2);
        XTable.setCellAlignmentCenter(tblTKDoanhThu, 2);
        cboNam.setSelectedIndex(-1);
        sellingProducts(false);
        listKhachHang = dao.getLoyalCustomers();
        loyalCustomers();
        if(Auth.user.getRole().equals(XConstant.STAFF)){
            btnTKDoanhThu.setToolTipText("Security");
        }else{
            revenueByYear();
        }
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
        JButton button[] = {btnTKSanPham, btnTKKhachHang, btnTKDoanhThu};
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
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức hiển thị sản phẩm bán chạy">    
    private void sellingProducts(boolean check){
        modelSP.setRowCount(0);
        int month = 0, year = 0, type = 0;
        if(check){
            if(cboThang.getSelectedIndex() == -1) month = 0;
            else if(cboNam.getSelectedIndex() == -1){
                month = Integer.valueOf(cboThang.getSelectedItem().toString());
                XMess.alert(null, "Hãy chọn năm của tháng "+month+" để hiện thống kê");
                return;
            }else month = Integer.valueOf(cboThang.getSelectedItem().toString());
            if(cboNam.getSelectedIndex() == -1) year = 0;
            else year = Integer.valueOf(cboNam.getSelectedItem().toString());
            if(cboLoaiSP.getSelectedIndex()== -1) type = 0;
            else type = cboLoaiSP.getSelectedIndex();
        }
        List<Object[]> list = dao.getProductRevenue(year, month, type);
        listSP.clear();
        listSP.add(titleSP);
        for (Object[] row : list) {
            modelSP.addRow(new Object[]{
                row[0], XMoney.convertMoney(Float.valueOf(row[1].toString()))+" VNĐ",
                row[2]
            });
            listSP.add(row);
        }
    }
     // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phương thức hiển thị khách hàng thân thiết">      
    private void loyalCustomers(){
        modelKH.setRowCount(0);
        if(cboXepHang.getSelectedIndex() == -1){
            for (Object[] obj : listKhachHang) {
                modelKH.addRow(obj);
                listKH.add(obj);
            }
        }else{
            String getTop = (String) cboXepHang.getSelectedItem();
            int index = getTop.indexOf(" ");
            getTop = getTop.substring(index+1);
            int top = Integer.parseInt(getTop);
            listKH.clear();
            listKH.add(titleKH);
            if(top+1 > listKhachHang.size() ){
                for (Object[] obj : listKhachHang) {
                    modelKH.addRow(obj);
                    listKH.add(obj);
                }
            }else{
                 for (int i = 0; i < top; i++) {
                    modelKH.addRow(listKhachHang.get(i));
                    listKH.add(listKhachHang.get(i));
                }
            }
        }
            
    }
        // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phương thức hiển thị doanh thu sản phẩm theo năm">      
    private void revenueByYear(){
        modelDoanhThu.setRowCount(0);
        int year;
        if(cboDoanhThuNam.getSelectedIndex() == -1){
            year = 0;
        }else year = Integer.valueOf(cboDoanhThuNam.getSelectedItem().toString());
        List<Object[]> list = dao.getRevenueByYear(year);
        listDT.clear();
        listDT.add(titleDT);
        for (Object[] row : list) {
            modelDoanhThu.addRow(new Object[]{
                row[0], row[1], 
                XMoney.convertMoney(Float.valueOf(row[2].toString())) + " VNĐ"
            });
            listDT.add(row);
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lưu dữ liệu trên bảng thành file excel"> 
    private void exportToExcel(List<Object[]> list, String name){
        try {
            if(list.isEmpty()){
                XMess.alert(this, "Bảng hiện đang trống!");
                return;
            }
            XExcel.writeExcel(list, name);
            Desktop.getDesktop().browse(new File(""+name+".xlsx").toURI());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xuất file pdf"> 
    public void exportToPDF(JTable tbl, String name){
        MessageFormat header = new MessageFormat(name); 
        MessageFormat footer = new MessageFormat("page{0,number,integer}");
        try{
            tbl.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // </editor-fold>
    
// ----------------------  End Method  ----------------------
}
