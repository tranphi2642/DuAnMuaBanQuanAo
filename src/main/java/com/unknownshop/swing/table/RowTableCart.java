package com.unknownshop.swing.table;

import com.unknownshop.entity.Products;
import com.unknownshop.util.XMoney;
import com.unknownshop.util.XPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class RowTableCart{
    
    private Products product;
    
    public RowTableCart(Products product) {
        this.product = product;
    }

    public Object[] toRowTable() {
        ColumnDelete delete = new ColumnDelete();
        delete.getButtonDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                XPanel.pnlCart.removeRow();
            }
        });
        return new Object[]{
            new Profile(new ImageIcon(product.getImgUrl())),
            product.getName(), product.getQuantity(),
            XMoney.convertMoney(product.getPrice()) + " VNĐ", delete
        };
    }
}
