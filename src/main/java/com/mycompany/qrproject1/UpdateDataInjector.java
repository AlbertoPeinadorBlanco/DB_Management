/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

/**
 *
 * @author Development team
 * this class is used to inject dependencies to lose coupling 
 */
public class UpdateDataInjector {
    
     private final IUpdateData _IUpdateData;
    
    /**
    *
    * constructor to initialise the interface in the class instantiation
    *   
    * @param iUpdateData it passes the interface as parameter for the class initialisation
    */
    public UpdateDataInjector(IUpdateData iUpdateData){
        
        _IUpdateData = iUpdateData;
        
    }
    
    /**
    * Function to use the class method through the interface
    * 
    * @param data it passes the user data to be updated into the DB
    */   
    public void dataUpdate(String data){
        
        _IUpdateData.updateData(data);
        
    }
    
}
