/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpartanExpenseTracker;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author royperlman
 */
public class UserData implements Serializable
    {
    
        private static final long serialVersionUID = 123;
        
        public static UserData currentUser = null;
        
        
        public String ID;
        public String Password;
        public String FirstName;
        public String MiddleName;
        public String LastName;
        
        public double Balance = 0;
        public double Expence = 0;
        public double Income = 0;
        
        public ArrayList<String[]> EatOut = new ArrayList<>();
        
        public ArrayList<String[]> BookStore = new ArrayList<>();
        
        public ArrayList<String[]> Classes = new ArrayList<>();
        
        public ArrayList<String[]> Others = new ArrayList<>();
        
        public ArrayList<String[]> AllTheAbove = new ArrayList<>();
       
        public UserData(String ID, String Password, 
                String FirstName, String LastName) 
        {
            this.ID = ID;
            this.Password = Password;
            this.FirstName = FirstName;
            this.LastName = LastName;    
        }    
    }