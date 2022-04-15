/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.util;

import com.unknownshop.constant.XConstant;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class XHover {
    static Color background = null;
    static Color foreground = null;
    public static boolean check = false;
    
    // Phương thức đổi màu panel Menu khi đưa chuột vào
    public static void enterMenuButton(JPanel pnl, JLabel... lbl){
        if(pnl.isEnabled()){
            pnl.setOpaque(true);
            pnl.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 0, XConstant.BLACK_51));
            for (JLabel label : lbl) {
                label.setForeground(XConstant.BLACK_51);
                label.setIcon(XImage.getIcon(XConstant.ICON_ENTER + label.getToolTipText()));
            }
        }
    }
    
    // Phương thức đổi màu panel Menu khi đưa chuột ra
    public static void exitMenuButton(JPanel pnl, JLabel... lbl){
        if(pnl.isEnabled()){
            pnl.setOpaque(false);
            pnl.setBorder(null);
            for (JLabel label : lbl) {
                label.setForeground(XConstant.WHITE_255);
                label.setIcon(XImage.getIcon(XConstant.ICON_EXIT + label.getToolTipText()));
            }
        }
    }
    
    // Phương thức đổi màu nút khi đưa chuột vào
    public static void enterButton(JButton btn, Color bgd, Color fgd){
        if(btn.isEnabled()){
            background = btn.getBackground();
            foreground = btn.getForeground();
            btn.setBackground(bgd);
            btn.setForeground(fgd);
        }
    }
    
    // Phương thức đổi màu nút khi đưa chuột ra
    public static void exitButton(JButton btn){
        if(btn.isEnabled()){
            btn.setBackground(background);
            btn.setForeground(foreground);
        }
    }
    
    // Phương thức đổi màu card khi đưa chuột vào
    public static void enterCard(JPanel pnl, JLabel... lbl){
        pnl.setBackground(XConstant.GREEN_BLUE);
        for (JLabel label : lbl) {
            label.setForeground(XConstant.BLACK_51);
        }
    }
    
    // Phương thức đổi màu card khi đưa chuột ra
    public static void exitCard(JPanel pnl, JLabel... lbl){
        pnl.setBackground(XConstant.BLACK_51);
        for (JLabel label : lbl) {
            label.setForeground(XConstant.WHITE_255);
        }
    }
    
    // Phương thức đổi màu nút tab khi đưa chuột vào
    public static void enterTabButton(JButton btn, Color fgd, Color clrBorder){
        if(!btn.isOpaque()){
            foreground = btn.getForeground();
            btn.setOpaque(true);
            btn.setForeground(fgd);
            btn.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, clrBorder));
            check = true;
        }
        
    }
    
    // Phương thức đổi màu nút tab khi đưa chuột ra
    public static void exitTabButton(JButton btn){
        if(check){
            btn.setOpaque(false);
            btn.setForeground(foreground);
            btn.setBorder(null);
            check = false;
        }
    }
    // Enable button
    public static void enableButton(JButton... button){
        for (JButton btn : button) {
            btn.setEnabled(true);
            btn.setBackground(XConstant.LIGHT_BLUE);
            btn.setForeground(XConstant.BLACK_51);
        }
        
    }
    // Disable button
    public static void disableButton(JButton... button){
        for (JButton btn : button) {
            btn.setEnabled(false);
            btn.setBackground(new Color(153,153,153));
            btn.setForeground(new Color(100,100,100));
        }
    }
    
}
