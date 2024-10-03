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
 * Class to update the availability of items
 */
public class UpdateAvailability extends UpdateData{
    
    /**
     * 
     * @param itemData: the item data to be updated (id and availability) 
     */
    @Override
    public void updateData(String itemData) {
        
        String[] objAtributes = itemData.split("_");
        String id = objAtributes[0];
        String availability = objAtributes[1];
      
        int id2 = Integer.parseInt(id);
        
        try{
                                 
            String sql = "UPDATE tb_items SET availabily_id = ? WHERE id = ?";
                                           
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, availability);
            pS.setInt(2, id2);

            pS.executeUpdate();       
                
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }  
        
    }
    
}
