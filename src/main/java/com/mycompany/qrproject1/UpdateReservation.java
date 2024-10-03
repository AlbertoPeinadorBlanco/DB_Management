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
 * Class to update reservations in the DB
 * child of UpdateData class
 */
public class UpdateReservation extends UpdateData{
    
    /**
     * 
     * @param reservationData passes an id to find it in the DB and the values to be updated
     */
    @Override
    public void updateData(String reservationData) {
        
        String[] objAtributes = reservationData.split("_");
        String id = objAtributes[0];
        String itemID = objAtributes[1];
        String dateRequested = objAtributes[2];
        String dateDesired = objAtributes[3];
        String userID = objAtributes[4];
        
        try{
                                        
            String sql = "UPDATE tb_reservations SET id = ?, item_id = ?, date_requested = ?, date_desired = ?, user_id = ? WHERE id = ?";
                                        
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, id);
            pS.setString(2, itemID);
            pS.setString(3, dateRequested);
            pS.setString(4, dateDesired);
            pS.setString(5, userID);
            pS.setString(7, id);

            pS.executeUpdate();  
                           
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }   
        
    }
    
}
