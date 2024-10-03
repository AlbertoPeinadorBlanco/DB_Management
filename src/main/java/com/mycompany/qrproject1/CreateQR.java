/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/**
 *
 * @author Development team
 * Class to create QR codes
 */
public class CreateQR implements ICreateQR {
    
     /**
     *
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
            throws WriterException, IOException{
        
         BitMatrix matrix = new MultiFormatWriter().encode(new String(product.getBytes(charSet), charSet), 
                 BarcodeFormat.QR_CODE, width, height);

        MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
        
    }
    
}
