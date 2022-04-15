/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unknownshop.util;

import java.text.DecimalFormat;

/**
 *
 * @author Đăng Trường
 */
public class XMoney {
    
    // Phương thức định dạng kiểu chuỗi sang tiền VNĐ
    public static String convertMoney(float tien){
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(tien);
    }
    
}
