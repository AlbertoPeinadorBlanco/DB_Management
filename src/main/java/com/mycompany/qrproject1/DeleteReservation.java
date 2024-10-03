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
 * Class to delete reservations from the DB by id
 * child of DeleteData class
 */
public class DeleteReservation extends DeleteData {
    
    /**
     * 
     * @param reservationID passes an id value to delete the reservation associated
     */ 
    @Override
    public void deleteData(String reservationID) {
        
        try{
                 
            String sql = "DELETE FROM tb_reservations WHERE id = ?";
                        
            PreparedStatement pS = con.prepareStatement(sql);

            pS.setString(1,reservationID);
            pS.executeUpdate();    
                
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
        }  
               
    }
    
}
