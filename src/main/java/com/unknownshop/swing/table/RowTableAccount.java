package com.unknownshop.swing.table;

import com.unknownshop.entity.Users;
import com.unknownshop.util.XPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class RowTableAccount{
    
    private Users user;
    
    public RowTableAccount(Users user) {
        this.user = user;
    }

    public Object[] toRowTable(int check) {
        ColumnUpdate update = new ColumnUpdate();
        ColumnRestore restore = new ColumnRestore();
        if(check == 0){
            update.getBtnUpdate().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelAccManager.edit();
                }
            });
            update.getBtnDelete().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelAccManager.removeRow();
                }
            });
        }else {
            restore.getBtnRestore().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    XPanel.panelAccManager.restore();
                }
            });
        }
        return new Object[]{
                new Profile(new ImageIcon(user.getImgUrl())),
                user.getUsername(), user.getFullname(), 
                user.getEmail(), user.getRole(), 
                check == 0 ? update : restore
            };
    }
}
