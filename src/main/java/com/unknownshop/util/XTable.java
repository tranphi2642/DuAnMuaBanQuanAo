/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.util;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author Dell
 */
public class XTable{
    
    public static void setCellAlignmentCenter(JTable tbl, int type){
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        
        TableModel tblModel = tbl.getModel();
        int start = 0, end = tblModel.getColumnCount();
        if(type == 0) {
            start = 1;
            end -= 1;
        }else if(type == 1) end -= 1;
        else if(type == 3) start = 1;
        for (int i = start; i <  end; i++) {
            tbl.getColumnModel().getColumn(i).setCellRenderer(render);
        }
    }
    
}
