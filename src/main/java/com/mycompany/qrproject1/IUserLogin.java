/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.qrproject1;

/**
 *
 * @author Development team
 */
public interface IUserLogin {
    
    /**
    *
    * @param userName takes a username for login
    * @param password takes a character array as a password
    * @return returns a one if the login is successful and a cero if it is not
    */    
    int userLogin(String userName, char[] password);
    
}
