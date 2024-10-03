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
 * Class to input reservations into the DB
 * child of CreateData class
 */
public class CreateReservation extends CreateData{

    /**
     * 
     * @param reservationData passes the data to input a reservation in the DB
     */
    @Override
    public void createData(String reservationData) {
               
        String[] objAtributes = reservationData.split("_");
        //String id = objAtributes[0];
        String itemID = objAtributes[0];
        String dateRequested = objAtributes[1];
        String dateDesired = objAtributes[2];
        String userID = objAtributes[3];

        String sql = "INSERT INTO tb_reservations(item_id, date_requested, date_desired, user_id) VALUES(?, ?, ?, ?)";

        try{             
                    
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, itemID);
            pS.setString(2, dateRequested);
            pS.setString(3, dateDesired);
            pS.setString(4, userID);
            pS.executeUpdate();
                    
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }           
        
    }
    
}
