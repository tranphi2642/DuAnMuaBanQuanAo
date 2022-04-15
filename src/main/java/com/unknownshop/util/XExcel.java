/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.util;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Dell
 */
public class XExcel {
    
    public static void writeExcel(List<Object[]> list, String name) throws FileNotFoundException, IOException{
            int objLength = list.get(0).length;
            FileOutputStream file = new FileOutputStream(""+name+".xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sheet1");
            XSSFRow row;
            XSSFCell[] cell = new XSSFCell[objLength+1];
            for (int i = 0; i < list.size(); i++) {
                row = sheet.createRow(i);
                Object[] obj = list.get(i);
                for (int j = 0; j <= objLength; j++) {
                    cell[j] = row.createCell(j);
                    if(j == 0){
                        if(i == 0){
                            cell[j].setCellValue("STT");
                        }else cell[j].setCellValue(i);
                    }else{
                        cell[j].setCellValue(obj[j-1].toString());
                    }
                    
                }
            }
            sheet.setDefaultColumnWidth(20);
            workbook.write(file);
            workbook.close();
            file.close();
    }
    
}
