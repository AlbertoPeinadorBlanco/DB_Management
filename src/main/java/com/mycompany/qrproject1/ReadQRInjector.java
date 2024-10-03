/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import com.google.zxing.NotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author Development team
 */
public class ReadQRInjector {
    
    private final IReadQR _IReadQR;
    
     /**
     *
     * constructor to initialise the interface in the class instantiation
     *   
     * @param iReadQR it passes the interface as parameter for the class initialisation
     */
    public ReadQRInjector(IReadQR iReadQR){
        
        _IReadQR = iReadQR;
        
    }
    
    /**
     * 
     ** This function reads QR codes from the selected location
     * @param path: the path of the QR image
     * @param charset: the QR data
     * @param hashMap: the arrangement of the QR
     * @return a string with the QR data
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NotFoundException 
     */
    public String qrRead(String path, String charset, Map hashMap) throws FileNotFoundException, IOException, NotFoundException{
        
        return _IReadQR.readQR(path, charset, hashMap);
        
    }
       
}
