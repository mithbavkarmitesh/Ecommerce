/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Mitesh
 */
public class Testapplication {
    
    public static void main(String[] args) {
       SessionFactory sf=FactoryProvider.getFactory(); 
       Session session = sf.openSession();
       
    }
    
    
    
}
