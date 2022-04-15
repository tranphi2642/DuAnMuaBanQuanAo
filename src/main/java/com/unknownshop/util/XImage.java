/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Dell
 */
public class XImage {
    public static void save(String folder,File src,String fileName){
        File dst = new File("data/"+folder,fileName);
        // Tạo thư mục nếu chưa có
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        Path from = Paths.get(src.getAbsolutePath());
        Path to = Paths.get(dst.getAbsolutePath());
        try {
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ImageIcon read(String folder,String fileName, int width, int heigh){
        try {
            File path = new File("data/"+folder,fileName);
            BufferedImage img = ImageIO.read(path);
            return new ImageIcon(img.getScaledInstance(width, heigh, Image.SCALE_DEFAULT));
            
        } catch (Exception e) {
        }
        return null;
    }
    
    public static Image convertBytesToImage(byte[] bytes, int width, int heigh){
        if (bytes == null) return null;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return img.getScaledInstance(width, heigh, Image.SCALE_SMOOTH);
    }
    
    public static byte[] convertImageToBytes(File file){
        try {
            return Files.readAllBytes(file.toPath());
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static ImageIcon getIcon(String name){
        try {
            File path = new File("icons/icon"+name+".png");
            BufferedImage img = ImageIO.read(path);
            return new ImageIcon(img);
            
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ImageIcon getIconCard(String name){
        try {
            File path = new File("icons/"+name+".png");
            BufferedImage img = ImageIO.read(path);
            return new ImageIcon(img);
            
        } catch (Exception e) {
        }
        return null;
    }
    
    
}
