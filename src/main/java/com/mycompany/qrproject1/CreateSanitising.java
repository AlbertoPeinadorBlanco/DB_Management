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
 * Class to input sanitising orders into the DB
 * child of CreateData class
 */
public class CreateSanitising extends CreateData{

    /**
     * 
     * @param sanitasionData passes the data to input a sanitising order in the DB
     */
    @Override
    public void createData(String sanitasionData) {
                
        String[] objAtributes = sanitasionData.split("_");
        //String id = objAtributes[0];
        String itemID = objAtributes[0];
        String dateIn = objAtributes[1];
        String dateOut = objAtributes[2];

        String sql = "INSERT INTO tb_sanitising(item_id, date_in, date_out) VALUES(?, ?, ?)";

        try{             
                    
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, itemID);
            pS.setString(2, dateIn);
            pS.setString(3, dateOut);
            pS.executeUpdate();
                    
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }           
        
    }
    
}
