/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qrproject1;

/**
 *
 * @author Development team
 * this class is used to inject dependencies to lose coupling 
 */
public class UserLoginInjector {
    
    private final IUserLogin _IUserLogin;
    
    /**
    *
    * constructor to initialise the interface in the class instantiation
    *   
    * @param iUserLogin it passes the interface as parameter for the class initialisation
    */
    public UserLoginInjector(IUserLogin iUserLogin){
        
        _IUserLogin = iUserLogin;
        
    }
    
    /**
    * Function to use the class method through the interface
    * 
    * @param user it passes the user data to be checked for login
    * @param pWord it passes the password data to be checked for login
    * @return returns a numeric value to decide if the login was successful 
    */
    public int loginUser(String user, char[] pWord){
        
        return _IUserLogin.userLogin(user, pWord);
        
    }
    
}
