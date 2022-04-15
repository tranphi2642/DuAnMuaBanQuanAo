package com.unknownshop.swing.table;

import com.unknownshop.util.XMoney;
import com.unknownshop.util.XPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RowTableBill{
    
    private Object[] bill;
    
    public RowTableBill(Object[] bill) {
        this.bill = bill;
    }

    public Object[] toRowTable() {
        ColumnAccept accept = new ColumnAccept();
            accept.getBtnUpdate().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelBillManager.edit();
                }
            });
            accept.getBtnAccept().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelBillManager.confirm();
                }
            });
            accept.getBtnDelete().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelBillManager.removeRow();
                }
            });
        return new Object[]{
            bill[1], bill[2], bill[3], bill[4],
            XMoney.convertMoney(Float.valueOf(bill[5].toString()))+" VNĐ",
            accept
        };
    }
}
