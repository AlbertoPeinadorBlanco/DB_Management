/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Development team
 * 
 * class that handles the login system
 * created from IUserLogin interface
 */
public class UserLogin implements IUserLogin{

    /**
    * Function to login into the system
    * @param userName passes the username for login in
    * @param password passes the password value for login in
    * @return returns a numeric value (1 fro successful login and 0 for unsuccessful)
    */
    @Override
    public int userLogin(String userName, char[] password) {
        
        int value = 0;
        
        if(userName.equals("")|| password.equals("")){
            
            JOptionPane.showMessageDialog(null,"Username and Password cannot be empty!!\n Please enter a value!!");
            value = 0;
            
        }
        else{
            
            String sql = "SELECT id, name, password, role_id from tb_users WHERE (name = ? AND password = ?)";
            
            try{
                               
                String uName = userName.toLowerCase();
                char[] pWord = password;
                
                LoggedUser.userName = uName;
                
                int id = 0;
                String user = "";
                int role = 0;
                
                Connection con = DBConnection.Connect();
                
                PreparedStatement pS = con.prepareStatement(sql);
                pS.setString(1, uName);
                pS.setString(2, new String(pWord));
                
                ResultSet rS = pS.executeQuery();
                      
                int count = 0;
                while(rS.next()){
                    
                    id = rS.getInt("id");
                    user = rS.getString("name");
                    role = rS.getInt("role_id");
                    
                    count++;
                    
                }
                
                if(role == 1){
                    
                   FormAdmin fA = new FormAdmin();
                   fA.setVisible(true);
                   value = 1;
                   LoggedUser.role = "admin";
                   LoggedUser.userID = id;
                    
                }
                if(role == 2)
                {
                    
                    FormStaff fS = new FormStaff();
                    fS.setVisible(true);
                    value = 1;
                    LoggedUser.role = "staff";
                    LoggedUser.userID = id;
                    
                }
                if(role == 3){
                    
                    FormStudent fS = new FormStudent();
                    fS.setVisible(true);
                    value = 1;
                    LoggedUser.role = "student";
                    LoggedUser.userID = id;

                }                
                else if(count > 1){
                    
                    JOptionPane.showMessageDialog(null, "Duplicate account found!, please contact system administrator ");
                    
                    value = 0;
                    
                }
                else if (role != 1 && role != 3 && role != 2){
                    
                    JOptionPane.showMessageDialog(null, "Invalid username or password entered");
                    
                    value = 0;
                    
                }
                
            }
            catch(HeadlessException | SQLException e){
                
                JOptionPane.showMessageDialog(null, "Error " + e);
                value = 0;
                
            }
            
        }
        
        return value;
        
    }                                   
        
}
    

