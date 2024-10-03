/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Development team
 * 
 * Class to read users from the DB
 * child of ReadData class
 */
public class ReadData implements IReadData{
          
    IDBConnection idbConnection = new DBConnection();
    DBConnectionInjector connection = new DBConnectionInjector(idbConnection);
    Connection con = connection.connectDB();
   
    List list = new List(); 
    int positionCount = 0;

    /**
     * Function used to fetch data from the DB
     * @param data an empty string
     * @return returns a list of users
     */
    @Override
    public List readData(String data) {
        
        String sql = "SELECT * FROM tb_users";

        try{      
                                                  
            PreparedStatement pS = con.prepareStatement(sql);
                        
            ResultSet rS = pS.executeQuery();
                       
            while(rS.next()){
                
                int id = rS.getInt("id");
                String userName = rS.getString("name");
                String password = rS.getString("password");
                int role = rS.getInt("role_id");
                           
                list.add(id + "_" + userName + "_" + password + "_" + role, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }   
        
        return list;
        
    }
        
}
