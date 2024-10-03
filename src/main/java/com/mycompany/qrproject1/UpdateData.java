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
 * Class to update users in the DB
 * created from IUpdateData interface
 */
public class UpdateData implements IUpdateData{

    IDBConnection idbConnection = new DBConnection();
    DBConnectionInjector connection = new DBConnectionInjector(idbConnection);
    Connection con = connection.connectDB();

    /**
     * Function to update data from the DB
     * @param userData passes a username, a password, an id, and a role to update it in DB
     */
    @Override
    public void updateData(String userData) {
        
        String[] objAtributes = userData.split("_");
        String id = objAtributes[0];
        String userName = objAtributes[1];
        String password = objAtributes[2];
        String role = objAtributes[3];
        
        int roleID = Integer.parseInt(role);
        
        try{
                                
            String sql = "UPDATE tb_users SET id = ?, name = ?, password = ?, role_id = ? WHERE name = ?";
                            
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, id);
            pS.setString(2, userName);
            pS.setString(3, password);
            pS.setInt(4, roleID);
            pS.setString(5, userName);

            pS.executeUpdate();  
                    
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }   
            
    }
    
}
