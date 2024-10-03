package com.mycompany.qrproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Development team
 * Class to connect to the DB
 * created from IDBconnection interface
 */
public class DBConnection implements IDBConnection{
    
    /**
     * 
     * @return returns the DB connection
     */
   
    //Stablishes the connection to DB
    @Override
    public Connection dbConnect(){
        
        return Connect();
    }
    
    //Stablishes the driver to connect to a DB
    public static Connection Connect() {
        
        try{
            //Class.forName("org.sqlite.JDBC");
           
            Connection conn = DriverManager.getConnection("jdbc:sqlite:CollaborativeDev.DB.db");
            return conn;
            
        }
        catch(SQLException e){
           
            JOptionPane.showMessageDialog(null, "Error " + e);

            return null;
            
        }
    }
    
}
