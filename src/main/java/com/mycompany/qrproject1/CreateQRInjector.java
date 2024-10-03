/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import com.google.zxing.WriterException;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author Development team
 * this class is used to inject dependencies to lose coupling 
 */
public class CreateQRInjector {
    
    private final ICreateQR _ICreateQR;
    
    /**
     *
     * constructor to initialise the interface in the class instantiation
     *   
     * @param iCreateQR it passes the interface as parameter for the class initialisation
     */
    public CreateQRInjector(ICreateQR iCreateQR){
        
        _ICreateQR = iCreateQR;
        
    }
    
     /**
     * Function to use the class method through the interface
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
    public void qrCreate(String product, String path, String charSet, Map map, int height, int width) throws WriterException, IOException{
        
        _ICreateQR.writeQR(product, path, charSet, map, height, width);
        
    }
    
}
