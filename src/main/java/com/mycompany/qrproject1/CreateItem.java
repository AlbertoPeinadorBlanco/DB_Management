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
 * class to create items
 * child of CreateData class
 */
public class CreateItem extends CreateData{
    
    /**
     * 
     * @param itemData it passes the necessary data to input an item in the DB
     */
    @Override
    public void createData(String itemData) {
               
        String[] objAtributes = itemData.split("_");
        String itemName = objAtributes[0];
        String type = objAtributes[1];
        String availability = objAtributes[2];
       
        String sql = "INSERT INTO tb_items(name, type_id, availabily_id) VALUES(?, ?, ?)";

        try{             
                    
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, itemName);
            pS.setString(2, type);
            pS.setString(3, availability);
            
            pS.executeUpdate();
                    
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }           
        
    }
    
}
