package com.unknownshop.form.admin;

import com.unknownshop.constant.XConstant;
import com.unknownshop.dao.ProductDAO;
import com.unknownshop.entity.Products;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.form.admin.PanelProductManager;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XImage;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.text.JTextComponent;

public class DialogInfoProduct extends javax.swing.JFrame {

    private ProductDAO dao = new ProductDAO();
    private byte[] proImage;
    private PanelProductManager pnlManager;
    private int id;
    
    public DialogInfoProduct(PanelProductManager pnlManager) {
        initComponents();
        this.pnlManager = pnlManager;
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        roundPanel1 = new com.unknownshop.swing.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new com.unknownshop.swing.RoundLabel();
        btnGetImage = new javax.swing.JButton();
        txtTenSP = new com.unknownshop.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        lblIconUsername = new javax.swing.JLabel();
        lblErrorTenSP = new javax.swing.JLabel();
        lblIconPassword = new javax.swing.JLabel();
        lblErrorGiaSP = new javax.swing.JLabel();
        lblIconPassword1 = new javax.swing.JLabel();
        lblErrorLoaiSP = new javax.swing.JLabel();
        lblIconFullname = new javax.swing.JLabel();
        lblErrorSoLuong = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtGiaSP = new com.unknownshop.swing.textfield.TextField();
        txtSoLuong = new com.unknownshop.swing.textfield.TextField();
        cboLoaiSP = new combobox.ComboboxBlack();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setOpaque(false);

        lblImage.setBackground(new java.awt.Color(51, 51, 51));
        lblImage.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 204)));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noImage.jpg"))); // NOI18N
        lblImage.setToolTipText("none");
        lblImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblImage.setOpaque(true);

        btnGetImage.setBackground(new java.awt.Color(0, 102, 204));
        btnGetImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGetImage.setForeground(new java.awt.Color(51, 51, 51));
        btnGetImage.setText("Tải Ảnh Lên");
        btnGetImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGetImage, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGetImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTenSP.setBackground(new java.awt.Color(51, 51, 51));
        txtTenSP.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenSP.setLabelText("Tên Sản Phẩm");
        txtTenSP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenSPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenSPFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sản Phẩm Unknown Shop");

        lblIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product.png"))); // NOI18N

        lblErrorTenSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorTenSP.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorTenSP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorTenSP.setText("Error!");

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/price.png"))); // NOI18N

        lblErrorGiaSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorGiaSP.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorGiaSP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorGiaSP.setText("Error!");

        lblIconPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quantity.png"))); // NOI18N

        lblErrorLoaiSP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorLoaiSP.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorLoaiSP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorLoaiSP.setText("Error!");

        lblIconFullname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product.png"))); // NOI18N

        lblErrorSoLuong.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblErrorSoLuong.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblErrorSoLuong.setText("Error!");

        btnClose.setBackground(new java.awt.Color(255, 0, 51));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        btnMoi.setBackground(new java.awt.Color(0, 102, 204));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(51, 51, 51));
        btnMoi.setText("Mới");
        btnMoi.setContentAreaFilled(false);
        btnMoi.setOpaque(true);
        btnMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMoiMouseExited(evt);
            }
        });
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(0, 102, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(51, 51, 51));
        btnThem.setText("Thêm");
        btnThem.setContentAreaFilled(false);
        btnThem.setOpaque(true);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(0, 102, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(51, 51, 51));
        btnSua.setText("Sửa");
        btnSua.setContentAreaFilled(false);
        btnSua.setOpaque(true);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuaMouseExited(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 102, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(51, 51, 51));
        btnXoa.setText("Xóa");
        btnXoa.setContentAreaFilled(false);
        btnXoa.setOpaque(true);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXoaMouseExited(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(0, 102, 204));
        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(51, 51, 51));
        btnFirst.setText("|<");
        btnFirst.setContentAreaFilled(false);
        btnFirst.setOpaque(true);
        btnFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstMouseExited(evt);
            }
        });
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(0, 102, 204));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(51, 51, 51));
        btnPrev.setText("<<");
        btnPrev.setContentAreaFilled(false);
        btnPrev.setOpaque(true);
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevMouseExited(evt);
            }
        });
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 102, 204));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(51, 51, 51));
        btnNext.setText(">>");
        btnNext.setContentAreaFilled(false);
        btnNext.setOpaque(true);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(0, 102, 204));
        btnLast.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(51, 51, 51));
        btnLast.setText(">|");
        btnLast.setContentAreaFilled(false);
        btnLast.setOpaque(true);
        btnLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLastMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLastMouseExited(evt);
            }
        });
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtGiaSP.setBackground(new java.awt.Color(51, 51, 51));
        txtGiaSP.setForeground(new java.awt.Color(255, 255, 255));
        txtGiaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGiaSP.setLabelText("Giá Sản Phẩm");
        txtGiaSP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGiaSPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaSPFocusLost(evt);
            }
        });
        txtGiaSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGiaSPKeyReleased(evt);
            }
        });

        txtSoLuong.setBackground(new java.awt.Color(51, 51, 51));
        txtSoLuong.setForeground(new java.awt.Color(255, 255, 255));
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoLuong.setLabelText("Số Lượng Sản Phẩm");
        txtSoLuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSoLuongFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuongFocusLost(evt);
            }
        });
        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyReleased(evt);
            }
        });

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Áo", "Quần", "Phụ Kiện", "Giày" }));
        cboLoaiSP.setSelectedIndex(-1);
        cboLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboLoaiSP.setLabeText("Loại Sản Phẩm");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblErrorTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblErrorGiaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundPanel1Layout.createSequentialGroup()
                                    .addComponent(lblIconFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblErrorLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(roundPanel1Layout.createSequentialGroup()
                                    .addComponent(lblIconPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblErrorSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblIconUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblErrorTenSP))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblIconFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblErrorLoaiSP)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIconPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorGiaSP)
                            .addComponent(lblErrorSoLuong))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// -------------------- Start Event --------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnMoi">
    private void btnMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseEntered
        XHover.enterButton(btnMoi, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnMoiMouseEntered

    private void btnMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoiMouseExited
        XHover.exitButton(btnMoi);
    }//GEN-LAST:event_btnMoiMouseExited

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
        clearError();
    }//GEN-LAST:event_btnMoiActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnThem">
    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        XHover.enterButton(btnThem, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        XHover.exitButton(btnThem);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnSua">
    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        XHover.enterButton(btnSua, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        XHover.exitButton(btnSua);
    }//GEN-LAST:event_btnSuaMouseExited

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnXoa">
    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        XHover.enterButton(btnXoa, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseExited
        XHover.exitButton(btnXoa);
    }//GEN-LAST:event_btnXoaMouseExited

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnFirst">
    private void btnFirstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseEntered
        XHover.enterButton(btnFirst, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnFirstMouseEntered

    private void btnFirstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseExited
        XHover.exitButton(btnFirst);
    }//GEN-LAST:event_btnFirstMouseExited

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        pnlManager.first();
    }//GEN-LAST:event_btnFirstActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnPrev">
    private void btnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseEntered
        XHover.enterButton(btnPrev, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnPrevMouseEntered

    private void btnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseExited
        XHover.exitButton(btnPrev);
    }//GEN-LAST:event_btnPrevMouseExited

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        pnlManager.prev();
    }//GEN-LAST:event_btnPrevActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnNext">
    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        XHover.enterButton(btnNext, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        XHover.exitButton(btnNext);
    }//GEN-LAST:event_btnNextMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        pnlManager.next();
    }//GEN-LAST:event_btnNextActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnLast">
    private void btnLastMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseEntered
        XHover.enterButton(btnLast, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnLastMouseEntered

    private void btnLastMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseExited
        XHover.exitButton(btnLast);
    }//GEN-LAST:event_btnLastMouseExited

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        pnlManager.last();
    }//GEN-LAST:event_btnLastActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnClose">
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        XPanel.mainForm.setEnabled(true);
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event btnGetImage">
    private void btnGetImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetImageActionPerformed
        getImage();
    }//GEN-LAST:event_btnGetImageActionPerformed
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus txtGiaSP">
    private void txtGiaSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaSPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaSPFocusGained

    private void txtGiaSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaSPFocusLost
        if (txtGiaSP.getText().trim().length() == 0) {
            lblErrorGiaSP.setText("Chưa nhập giá sản phẩm!");
        } else {
            lblErrorGiaSP.setText(" ");
        }
    }//GEN-LAST:event_txtGiaSPFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus txtSoLuong">
    private void txtSoLuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongFocusGained

    private void txtSoLuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusLost
        if (txtSoLuong.getText().trim().length() == 0) {
            lblErrorSoLuong.setText("Chưa nhập số lượng sản phẩm!");
        } else {
            lblErrorSoLuong.setText(" ");
        }
    }//GEN-LAST:event_txtSoLuongFocusLost
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event Focus txtTenSP">
    private void txtTenSPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenSPFocusLost
        if(txtTenSP.getText().trim().length()==0){
            lblErrorTenSP.setText("Chưa nhập tên sản phẩm!");
        }else{
            lblErrorTenSP.setText(" ");
        }
    }//GEN-LAST:event_txtTenSPFocusLost

    private void txtTenSPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenSPFocusGained

    }//GEN-LAST:event_txtTenSPFocusGained
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Event định dạng kí tự nhập vào">
    private void txtGiaSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaSPKeyReleased
        checkChar(txtGiaSP, "[^0-9]");
    }//GEN-LAST:event_txtGiaSPKeyReleased

    private void txtSoLuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyReleased
        checkChar(txtSoLuong, "[^0-9]");
    }//GEN-LAST:event_txtSoLuongKeyReleased
    // </editor-fold> 
    
// -------------------- End Event --------------------
    
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
            java.util.logging.Logger.getLogger(DialogInfoProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInfoProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInfoProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInfoProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogInfoProduct(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnGetImage;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private combobox.ComboboxBlack cboLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErrorGiaSP;
    private javax.swing.JLabel lblErrorLoaiSP;
    private javax.swing.JLabel lblErrorSoLuong;
    private javax.swing.JLabel lblErrorTenSP;
    private javax.swing.JLabel lblIconFullname;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconPassword1;
    private javax.swing.JLabel lblIconUsername;
    private com.unknownshop.swing.RoundLabel lblImage;
    private com.unknownshop.swing.RoundPanel roundPanel1;
    private com.unknownshop.swing.textfield.TextField txtGiaSP;
    private com.unknownshop.swing.textfield.TextField txtSoLuong;
    private com.unknownshop.swing.textfield.TextField txtTenSP;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------

    // <editor-fold defaultstate="collapsed" desc="Phương thức điền thông tin lên form">
    public void setForm(Products product){
        // Chuyển lỗi về dạng 1 dấu cách
        lblErrorTenSP.setText(" ");
        lblErrorLoaiSP.setText(" ");
        lblErrorSoLuong.setText(" ");
        lblErrorGiaSP.setText(" ");
        // Lấy thông tin từ sản phẩm điền lên form
        id = product.getId();
        // Gán combobox
        cboLoaiSP.setSelectedIndex(product.getTypeId()-1);
        txtTenSP.setText(product.getName());
        txtGiaSP.setText(String.valueOf(product.getPrice()));
        txtSoLuong.setText(String.valueOf(product.getQuantity()));
        proImage = product.getImgUrl();
        proImage = product.getImgUrl();
        lblImage.setIcon(new ImageIcon(XImage.convertBytesToImage(proImage, 180, 240)));
        lblImage.setToolTipText("");
        // Định dạng các nút
        XHover.enableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
        XHover.disableButton(btnThem);
    }
    // </editor-fold> 
    
// _____________________ Form Tài Khoản ___________________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa lable lỗi"> 
    private void clearError() {
        lblErrorGiaSP.setText("  ");
        lblErrorTenSP.setText("  ");
        lblErrorLoaiSP.setText("  ");
        lblErrorSoLuong.setText("  ");
    }
    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức bắt lỗi chưa nhập"> 
    private void nonError(){
        if (lblErrorTenSP.getText().equals("  ")) {
            lblErrorTenSP.setText("Chưa nhập tên sản phẩm!");
        }
        if (lblErrorGiaSP.getText().equals("  ")) {
            lblErrorGiaSP.setText("Chưa nhập giá sản phẩm!");
        }
        if (lblErrorSoLuong.getText().equals("  ")) {
            lblErrorSoLuong.setText("Chưa nhập số lượng sản phẩm!");
        }
        if (lblErrorLoaiSP.getText().equals("  ")) {
            lblErrorLoaiSP.setText("Chưa chọn loại sản phẩm!");
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy thông tin trên form">  
    private Products getForm(){
        Products product = new Products();
        product.setId(id);
        product.setName(txtTenSP.getText());
        product.setPrice(Float.parseFloat(txtGiaSP.getText()));
        product.setQuantity(Integer.valueOf(txtSoLuong.getText()));
        product.setImgUrl(proImage);
        Integer typeId = (Integer) cboLoaiSP.getSelectedIndex();
        typeId++;
        product.setTypeId(typeId);
        return product;
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa trắng form"> 
    public void clearForm() {
        clearError();
        txtGiaSP.setText("");
        txtSoLuong.setText("");
        txtTenSP.setText("");
        cboLoaiSP.setSelectedIndex(-1);
        lblImage.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/noImage.jpg"))
                            .getImage().getScaledInstance(180, 240, Image.SCALE_SMOOTH)));
        lblImage.setToolTipText("none");
        // Điều chỉnh nút
        XHover.enableButton(btnThem);
        XHover.disableButton(btnSua, btnXoa, btnFirst, btnLast, btnNext, btnPrev);
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra lỗi"> 
    private boolean checkError(){
        if(!(lblErrorLoaiSP.getText().equals(" ") &&
                    lblErrorGiaSP.getText().equals(" ") &&
                    lblErrorSoLuong.getText().equals(" ") &&
                    lblErrorTenSP.getText().equals(" "))) return true;
        else if(lblImage.getToolTipText().equals("none")){
            XMess.alert(this, "Bạn chưa chọn ảnh đại diện!");
            return true;
        }
        return false;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức thêm sản phẩm">  
    private void insert(){
        nonError();
        if(checkError()) return;
        Products product = getForm();
        if(!XMess.confirm(this, "Bạn muốn thêm sản phẩm này?")){
            return;
        }else {
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    setEnabled(false);
                    int result = dao.insert(product);
                    if(result == 0){
                        XMess.alert(null,"Thêm sản phẩm thành công!");
                    }else{
                        pnlManager.fillTableProduct(true);
                        XPanel.mainForm.setEnabled(true);
                        setVisible(false);
                        setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null,"Thêm sản phẩm thành công!");
                        return;
                    }
                    setEnabled(true);
                    dlog.setVisible(false);
                }
            }.start();
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức cập nhập sản phẩm">  
    private void update(){
        nonError();
        if(checkError()) return;
        Products product = getForm();
        if(XMess.confirm(this, "Bạn muốn cập nhật sản phẩm này?")){
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    setEnabled(false);
                    if(dao.update(product) == 0){
                        XMess.alert(null,"Cập nhập sản phẩm thất bại!");
                    }else{
                        pnlManager.fillTableProduct(true);
                        XPanel.mainForm.setEnabled(true);
                        setVisible(false);
                        setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null,"Cập nhập sản phẩm thành công!");
                        return;
                    }
                    setEnabled(true);
                    dlog.setVisible(false);
                }
            }.start();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa sản phẩm">  
    private void delete(){
        if(XMess.confirm(this, "Bạn muốn xóa sản phẩm này?")){
            // Tạo luồng và hiện dialog loading
            new Thread(){
                @Override
                public void run(){
                    DialogLoading dlog = new DialogLoading();
                    dlog.setVisible(true);
                    setEnabled(false);
                    if (dao.delete(id) == 0) {
                        XMess.alert(null, "Xóa sản phẩm thất bại!");
                    } else {
                        pnlManager.fillTableProduct(true);
                        pnlManager.fillTableProductDeleted(true);
                        XPanel.mainForm.setEnabled(true);
                        setVisible(false);
                        setEnabled(true);
                        dlog.setVisible(false);
                        XMess.alert(null ,"Xóa sản phẩm thành công!");
                        return;
                    }
                    setEnabled(true);
                    dlog.setVisible(false);
                }
            }.start();
        }
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức lấy ảnh"> 
    private void getImage(){
        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                File file = fileChooser.getSelectedFile();
                proImage = XImage.convertImageToBytes(file);
                ImageIcon icon = new ImageIcon(new ImageIcon(file.getAbsolutePath()).getImage().
                        getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
                lblImage.setIcon(icon);
                lblImage.setToolTipText("");
            } catch (Exception ex) {
                
            } 
        }
    }
    // </editor-fold>  
    
// _____________ Điều khiển _____________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức các nút điều khiển"> 
    public void first(){
        XHover.disableButton(btnPrev, btnFirst);
    }
    
    public void prev(boolean check){
        if(check){
            XHover.disableButton(btnPrev, btnFirst);
        }else{
            XHover.enableButton(btnNext, btnLast);
        }
    }
    
    public void next(boolean check){
        if(check){
            XHover.disableButton(btnNext, btnLast);
        }else{
            XHover.enableButton(btnPrev, btnFirst);
        }
    }
    
    public void last(){
        XHover.disableButton(btnNext, btnLast);
    }
    // </editor-fold> 
    
// _____________ Kiểm tra text _____________
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức giới hạn kí tự nhập vào">
    private void limitLength(JTextComponent txt, int length, KeyEvent evt){
        boolean limited = txt.getText().length() == length;
        if (limited){
            evt.consume();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức xóa kí tự không hợp lệ khi nhập">
    private void checkChar(JTextComponent txt, String pattern){
        txt.setText(txt.getText().replaceAll(pattern, ""));
    }
    // </editor-fold>
    
// ---------------------- End Method ----------------------

}
