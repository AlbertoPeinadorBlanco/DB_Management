/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import javax.imageio.ImageIO;

/**
 *
 * @author Development team
 * Class to read QR codes
 * 
 */
public class ReadQR implements IReadQR{
    
    /**
     * This function reads QR codes from the selected location
     * @param path: the path of the QR image
     * @param charset: the QR data
     * @param hashMap: the arrangement of the QR
     * @return a string with the QR data
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NotFoundException 
     */      
    public String readQR(String path, String charset, Map hashMap) throws FileNotFoundException, IOException, NotFoundException
    {
        
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer
        (new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(path)))));

        Result result = new MultiFormatReader().decode(binaryBitmap);

        return result.getText();
        
    }
    
}
