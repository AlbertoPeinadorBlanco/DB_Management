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
 * @author jazzm
 */
public class ReadItemID extends ReadData{
    
    @Override
    public List readData(String data){
        
        String sql = "SELECT id FROM tb_items WHERE name = ?";

        try{      
                                                   
           PreparedStatement pS = con.prepareStatement(sql);
           pS.setString(1, data);
           ResultSet rS = pS.executeQuery();
                        
           while(rS.next()){
                
                String itemID = rS.getString("id");
                            
                list.add(itemID, positionCount);
                positionCount++;
                
           }
            
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, "Error " + e);
            
        }   
        
        return list;
              
    }
    
}
