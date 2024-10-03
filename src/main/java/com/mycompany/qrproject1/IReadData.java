/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.List;

/**
 *
 * @author Development team
 */
public interface IReadData {
    
    /**
     * 
     * @param data this parameter is used to input the necessary data to fill the values in the SQL statement
     * @return returns a list of data gathered from the DB
     */    
    List readData(String data);
    
}
