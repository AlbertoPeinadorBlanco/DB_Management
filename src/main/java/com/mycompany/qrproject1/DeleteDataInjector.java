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
public class DeleteDataInjector {
    
    private final IDeleteData _IDeleteData;
    
    /**
     *
     * constructor to initialise the interface in the class instantiation
     *   
     * @param iDeleteData it passes the interface as parameter for the class initialisation
     */
    public DeleteDataInjector(IDeleteData iDeleteData){
        
        _IDeleteData = iDeleteData;
        
    }
    
     /**
     * Function to use the class method through the interface
     * 
     * @param idData it passes the data id to be deleted from the DB
     */
    public void dataDelete(String idData){
        
        _IDeleteData.deleteData(idData);
        
    }
}
