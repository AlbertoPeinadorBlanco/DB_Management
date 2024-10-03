/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Development team
 * class to read the approved reservations of a particular student
 */
public class ReadReservationsAprovedStudent extends ReadData {
    
    /**
     * 
     * @param userID: the user id to read from
     * @return a list of approved reservations for the user
     */
      @Override
    public List readData(String userID){
        
        String sql = "SELECT * FROM tb_aproved_reservations WHERE user_id = ?";

        try{      
                                                   
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, userID);
            ResultSet rS = pS.executeQuery();
                        
            while(rS.next()){
                
                String id = rS.getString("id");
                String itemID = rS.getString("item_id");
                String dateRequested = rS.getString("date_requested");
                String dateDesired = rS.getString("date_desired");
            
                list.add(id + "_" + itemID + "_" + dateRequested + "_" + dateDesired + "_" + userID, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }   
        
        return list;
        
    }
    
}
