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
 * Class to delete users from the DB
 * parent of all classes used for deleting data from the DB
 */
public class DeleteData implements IDeleteData{

    IDBConnection idbConnection = new DBConnection();
    DBConnectionInjector connection = new DBConnectionInjector(idbConnection);
    Connection con = connection.connectDB();

    /**
     * Function to delete data from the DB
     * @param userID passes an id value to delete the user associated
     */
    @Override
    public void deleteData(String userID) {
        
        int user_ID = Integer.parseInt(userID);
        
        try{
                 
            String sql = "DELETE FROM tb_users WHERE id = ?";
                        
            PreparedStatement pS = con.prepareStatement(sql);

            pS.setInt(1, user_ID);
            pS.executeUpdate();    
                
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }  
        
    }
    
}
