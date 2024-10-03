/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.qrproject1;
import java.sql.*;

/**
 *
 * @author Development team
 */
public interface IDBConnection {
    
    /**
     * 
     * @return it returns the DB connection
     */    
    public Connection dbConnect();
    
}
