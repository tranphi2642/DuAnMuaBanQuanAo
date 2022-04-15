package com.unknownshop.swing.table;

import javax.swing.ImageIcon;

public class RowTableBillDetails{
    
    private Object[] obj;
    
    public RowTableBillDetails(Object[] obj) {
        this.obj = obj;
    }

    public Object[] toRowTable() {
        return new Object[]{
            new Profile(new ImageIcon((byte[]) obj[0])),
            obj[1], obj[2], 
            (double)obj[3] / (int) obj[2], obj[3]
        };
    }
}
