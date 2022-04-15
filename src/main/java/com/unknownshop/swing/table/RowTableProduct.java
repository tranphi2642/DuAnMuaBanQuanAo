package com.unknownshop.swing.table;

import com.unknownshop.entity.Products;
import com.unknownshop.util.XMoney;
import com.unknownshop.util.XPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class RowTableProduct{
    
    private Products product;
    
    public RowTableProduct(Products product) {
        this.product = product;
    }

    public Object[] toRowTable(int check) {
        ColumnUpdate update = new ColumnUpdate();
        ColumnRestore restore = new ColumnRestore();
        if(check == 0){
            update.getBtnUpdate().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelProManager.edit();
                }
            });
            update.getBtnDelete().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelProManager.removeRow();
                }
            });
        }else {
            restore.getBtnRestore().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelProManager.restore();
                }
            });
        }
        return new Object[]{
                new Profile(new ImageIcon(product.getImgUrl())),
                product.getId(), product.getName(), 
                product.getQuantity(), XMoney.convertMoney(product.getPrice())+" VNĐ", 
                check == 0 ? update : restore
            };
    }
}
