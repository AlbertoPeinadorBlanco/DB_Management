/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;
import java.sql.*;
/**
 *
 * @author Development team
 * this class is used to inject dependencies to lose coupling 
 */
public class DBConnectionInjector {
    
    private final IDBConnection _IDBConnection;
    
    /**
     *
     * constructor to initialise the interface in the class instantiation
     *   
     * @param iDBConnection it passes the interface as parameter for the class initialisation
     */
    public DBConnectionInjector(IDBConnection iDBConnection){
        
        _IDBConnection = iDBConnection;
        
    }
    
     /**
     * Function to use the class method through the interface
     * @return returns the DB connection
     */
    public Connection connectDB(){
        
        return _IDBConnection.dbConnect();
        
    }
    
}
