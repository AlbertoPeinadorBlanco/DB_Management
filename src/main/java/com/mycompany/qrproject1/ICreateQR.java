/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.qrproject1;

import com.google.zxing.WriterException;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author Development team
 */
public interface ICreateQR {
    
     /**
     * @param product: the product to be represented as QR
     * @param path: the path to save the file
     * @param charSet: contains attributes to draw QR 
     * @param map:pattern to draw the QR
     * @param height: the height of the image
     * @param width: the width of the image
     * @throws com.google.zxing.WriterException
     * @throws java.io.IOException
     */
    
    public void writeQR(String product, String path, String charSet, Map map, int height, int width) 
            throws WriterException, IOException;
    
}
