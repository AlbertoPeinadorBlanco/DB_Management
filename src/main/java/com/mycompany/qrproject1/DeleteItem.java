/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Development team
 * 
 * Class to delete items from the DB
 * child of DeleteData class
 */
public class DeleteItem extends DeleteData{
    
    /**
     * 
     * @param itemID passes an id value to delete the item associated
     */
    @Override
    public void deleteData(String itemID) {
        
        try{
                 
            String sql = "DELETE FROM tb_items WHERE id = ?";
                        
            PreparedStatement pS = con.prepareStatement(sql);

            pS.setString(1,itemID);
            pS.executeUpdate();    
                
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }  
               
    }
    
}
