package com.unknownshop.swing.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableCellDelete extends DefaultCellEditor {

    private ColumnDelete action;
    
    public TableCellDelete(ColumnDelete action) {
        super(new JCheckBox());
        this.action = action;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        action.setBackground(new Color(51, 51, 51));
        return action;
    }

    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return action;
    }
}
