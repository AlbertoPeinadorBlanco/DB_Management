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
public class CreateDataInjector {
        
    private final ICreateData _ICreateData;
    
    /**
     *
     * constructor to initialise the interface in the class instantiation
     *   
     * @param iCreateData it passes the interface as parameter for the class initialisation
     */
    public CreateDataInjector(ICreateData iCreateData){
                     
        _ICreateData = iCreateData;
        
    }
    
    /**
     * Function to use the class method through the interface
     * 
     * @param dataUser it passes the user data to be input into the DB
     */
    public void dataCreate(String dataUser){
                
        _ICreateData.createData(dataUser);
        
    }
    
}
