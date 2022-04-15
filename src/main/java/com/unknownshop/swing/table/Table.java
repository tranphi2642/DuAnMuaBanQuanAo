package com.unknownshop.swing.table;

import com.unknownshop.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        setFont(new Font("Segoe UI",0,14));
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                header.setHorizontalAlignment(JLabel.CENTER);
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1) {
                
                if (o instanceof Profile) {
                    Profile cell = (Profile) o;
                    if (selected) {
                        cell.setBackground(new Color(51, 51, 51));
                    } else {
                        cell.setBackground(new Color(255, 255, 255));
                    }
                    return cell;
                } else if (o instanceof ColumnDelete) {
                    ColumnDelete cell = (ColumnDelete) o;
                    if (selected) {
                        cell.setBackground(new Color(51, 51, 51));
                    } else {
                        cell.setBackground(new Color(255, 255, 255));
                    }
                    return cell;
                } else if (o instanceof ColumnUpdate) {
                    ColumnUpdate cell = (ColumnUpdate) o;
                    if (selected) {
                        cell.setBackground(new Color(51, 51, 51));
                    } else {
                        cell.setBackground(new Color(255, 255, 255));
                    }
                    return cell;
                }else if (o instanceof ColumnRestore) {
                    ColumnRestore cell = (ColumnRestore) o;
                    if (selected) {
                        cell.setBackground(new Color(51, 51, 51));
                    } else {
                        cell.setBackground(new Color(255, 255, 255));
                    }
                    return cell;
                }else if (o instanceof ColumnAccept) {
                    ColumnAccept cell = (ColumnAccept) o;
                    if (selected) {
                        cell.setBackground(new Color(51, 51, 51));
                    } else {
                        cell.setBackground(new Color(255, 255, 255));
                    }
                    return cell;
                }else {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);
                    setBorder(noFocusBorder);
                    com.setForeground(new Color(102, 102, 102));
//                    if (selected) {
//                        com.setBackground(new Color(239, 244, 255));
//                    } else {
//                        com.setBackground(Color.WHITE);
//                    }
                    return com;
                }
            }
        });
        
    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        Object obj = model.getValueAt(row, col);
        if (obj instanceof ColumnDelete) {
            return new TableCellDelete((ColumnDelete) obj);
        } else if (obj instanceof ColumnUpdate) {
            return new TableCellUpdate((ColumnUpdate) obj);
        } else if (obj instanceof ColumnRestore) {
            return new TableCellRestore((ColumnRestore) obj);
        }else if (obj instanceof ColumnAccept) {
            return new TableCellAccept((ColumnAccept) obj);
        } else {
            return super.getCellEditor(row, col);
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column) {
        
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
}
