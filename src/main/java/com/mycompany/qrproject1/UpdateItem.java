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
 * Class to update items in the DB
 * child of UpdateData class
 */
public class UpdateItem extends UpdateData{
    
    /**
     * 
     * @param itemData passes an id value to update the item associated, and the values to be updated
     */
    @Override
    public void updateData(String itemData) {
        
        String[] objAtributes = itemData.split("_");
        String id = objAtributes[0];
        String itemName = objAtributes[1];
        String typeID = objAtributes[2];
        String availability = objAtributes[3];
              
        try{
                                       
            String sql = "UPDATE tb_items SET name = ?, type_id = ?, availabily_id = ? WHERE id = ?";
                                       
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, itemName);
            pS.setString(2, typeID);
            pS.setString(3, availability);
            pS.setString(4, id);

            pS.executeUpdate();  
                            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        } 
        
    }
    
}
