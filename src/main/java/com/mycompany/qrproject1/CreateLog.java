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
 * class to record user actions
 * child of CreateData class
 */
public class CreateLog extends CreateData{
        
    /**
     * 
     * @param logData it passes the necessary data to be recorded from the user actions 
     */
    @Override
    public void createData(String logData) {
                
        String[] objAtributes = logData.split("_");
        String date = objAtributes[0];
        String time = objAtributes[1];
        String action = objAtributes[2];
        String username = objAtributes[3];

        String sql = "INSERT INTO tbl_logs(date, time, action, username) VALUES(?, ?, ?, ?)";

        try{             
                    
            PreparedStatement pS = con.prepareStatement(sql);
            pS.setString(1, date);
            pS.setString(2, time);
            pS.setString(3, action);
            pS.setString(4, username);
            pS.executeUpdate();
                    
        }
        
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }           
        
    }
    
}
