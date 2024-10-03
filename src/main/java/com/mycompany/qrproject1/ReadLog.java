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
 * Class to read user actions log from the DB
 * child of ReadData class
 */
public class ReadLog extends ReadData{
    
    /**
     * 
     * @param data empty string
     * @return a list of logged user actions
     */
    @Override
    public List readData(String data){
        
        String sql = "SELECT * FROM tbl_logs";

        try{      
                                                   
            PreparedStatement pS = con.prepareStatement(sql);
            
            ResultSet rS = pS.executeQuery();
                       
            while(rS.next()){
                
                String id = rS.getString("id");
                String date = rS.getString("date");
                String time = rS.getString("time");
                String action = rS.getString("action");
                String user = rS.getString("username");
                            
                list.add(id + "_" + date + "_" + time + "_" + action + "_" + user, positionCount);
                positionCount++;
                
            }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }   
        
        return list;
        
    }
    
}
