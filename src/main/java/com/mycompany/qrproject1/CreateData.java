/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Development team
 * 
 * class to input data into the DB
 * parent of all classes used for inputting data
 * created from the ICreateData interface
 */
public class CreateData implements ICreateData{
    
    IDBConnection idbConnection = new DBConnection();
    DBConnectionInjector connection = new DBConnectionInjector(idbConnection);
    Connection con = connection.connectDB();
        
    /**
     * Function used to input data into the DB
     * @param userData passes the necessary user values to insert into the DB
     */
    @Override
    public void createData(String userData) {
        
        String[] objAtributes = userData.split("_");
        String userName = objAtributes[0];
        String password = objAtributes[1];
        String role = objAtributes[2];
        
        int roleID = Integer.parseInt(role);
            
        String sql = "INSERT INTO tb_users(name, password, role_id) VALUES(?, ?, ?)";

        try{             
                    
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, userName);
            pS.setString(2, password);
            pS.setInt(3, roleID);
            pS.executeUpdate();
                    
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }           
        
    }
    
}
