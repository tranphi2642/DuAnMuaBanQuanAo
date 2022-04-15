package com.unknownshop.form.user;

import com.unknownshop.entity.Products;
import com.unknownshop.fragment.product.ProductCard;
import com.unknownshop.swing.WrapLayout;
import java.util.List;

public class PanelPageProduct extends javax.swing.JPanel {

    List<Products> list;
    
    public PanelPageProduct(List<Products> list) {
        initComponents();
        this.list = list;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức khai báo giá trị trên form"> 
    private void init(){
        setLayout(new WrapLayout(WrapLayout.CENTER, 20, 20));
        int size = list.size();
        
        for (int i = 0; i < size; i++) {
            this.add(new ProductCard(list.get(i)));
        }
    }
    // </editor-fold> 
    
// ----------------------  End Method  ----------------------
}
