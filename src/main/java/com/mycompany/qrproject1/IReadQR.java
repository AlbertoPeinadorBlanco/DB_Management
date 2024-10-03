/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface IReadQR {
    
     /**
      * 
      * @param path: the path to read data from
      * @param charset: values to be read
      * @param hashMap: arrangement of QR code
      * @return a string with all the data
      * @throws FileNotFoundException
      * @throws IOException
      * @throws NotFoundException 
      */
    public String readQR(String path, String charset, Map hashMap) throws FileNotFoundException, IOException, NotFoundException;
    
}
