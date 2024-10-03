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
 * 
 * Class to read reservation requests from the DB
 * child of ReadData class
 */
public class ReadReservations extends ReadData{
    
    /**
     * 
     * @param data empty string
     * @return return a list of reservation requests from the DB
     */
    @Override
    public List readData(String data){
        
        String sql = "SELECT * FROM tb_reservations";

        try{      
                                                   
            PreparedStatement pS = con.prepareStatement(sql);
            
            ResultSet rS = pS.executeQuery();
                        
            while(rS.next()){
                
                String id = rS.getString("id");
                String itemID = rS.getString("item_id");
                String dateRequested = rS.getString("date_requested");
                String dateDesired = rS.getString("date_desired");
                String userID = rS.getString("user_id");
                            
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
