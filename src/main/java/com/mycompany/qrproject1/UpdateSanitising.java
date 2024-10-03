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
 * Class to update sanitising orders in the DB
 * child of UpdateData class
 */
public class UpdateSanitising extends UpdateData{
    
    /**
     * 
     * @param sanitisingData passes an id value to update the item associated and the values to be inputted
     */
    @Override
    public void updateData(String sanitisingData) {
        
        String[] objAtributes = sanitisingData.split("_");
        String id = objAtributes[0];
        String dateIn = objAtributes[1];
        String dateOut = objAtributes[2];
              
        try{
                                        
            String sql = "UPDATE tb_sanitising SET date_in = ?, date_out = ? WHERE id = ?";
                                        
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, dateIn);
            pS.setString(2, dateOut);
            pS.setString(3, id);

            pS.executeUpdate();  
                           
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }  
        
    }
    
}
