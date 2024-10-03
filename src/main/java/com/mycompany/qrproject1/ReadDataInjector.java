/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.List;

/**
 *
 * @author Development team
 * this class is used to inject dependencies to lose coupling 
 */
public class ReadDataInjector {
    
    private final IReadData _IReadData;
    
    /**
     *
     * constructor to initialise the interface in the class instantiation
     *   
     * @param iReadData it passes the interface as parameter for the class initialisation
     */
    public ReadDataInjector(IReadData iReadData){
        
        _IReadData = iReadData;
        
    }
    
     /**
     * Function to use the class method through the interface
     * 
     * @param data it passes the data to be read from the DB
     * @return a list of the data entities read from the DB
     */
    public List dataRead(String data){
        
        return _IReadData.readData(data);
        
    }
       
}
