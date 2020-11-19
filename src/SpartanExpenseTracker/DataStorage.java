
package SpartanExpenseTracker;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author royperlman
 */
public class DataStorage 
{
    private static final String filename = "UserProfileDataBaseee.txt";
   // private static final String ExpenseAndIncomeFile = "ExpenseAndIncomeData.txt";

    private static HashMap<String, UserData> users = new HashMap<String, UserData>();
 
    public static UserData getUser(String StudentID)
    {
        return users.get(StudentID);
    }
    
    public static boolean StoreUser(String studentId, String firstName, String lastName, String middleName,
            String createPassword, String confirmPassword ) 
    {
        //String len = Integer.toString(studentId);
        
        if(studentId.equals("") || firstName.equals("") || lastName.equals("")  && middleName.equals(" ") &&
                createPassword.equals(" ") || confirmPassword.equals(" ") )
        {
            System.out.println("Passing...");
            return false;
        }
     
        if(!createPassword.equals(confirmPassword))
        {
            return false;
        }
       
        if (users.containsKey(studentId))
        {
            return false;
        }
        
        if(!studentId.matches("[0-9]+") || studentId.length() != 9)
        {
            System.out.println("This IS NOT a valid student ID. Please try again.");
            return false;
        }
        
        
        users.put(studentId, new UserData(studentId, createPassword, firstName, lastName ));
        return true;
    }

    public static boolean CheckPassword(String studentId, String createPassword)
    {
        if(studentId.equals("") || createPassword.equals(""))
        {
            return false;
        }
        
        
        if (!users.containsKey(studentId))
        { 
                return false;
        }
        
        return (users.get(studentId).Password.equals(createPassword));
    }

    public static void SaveData() 
    {
        try
        {
           FileOutputStream FOS = new FileOutputStream(filename);
           ObjectOutputStream OOS = new ObjectOutputStream(FOS);
           OOS.writeObject(users);
           OOS.close();
           FOS.close();
        } 
        catch (IOException e) 
        {
            System.out.println("There was an error saving the data.");
        }
    }

    public static void LoadData() 
    {
        try 
        {
           FileInputStream FIS = new FileInputStream(filename);
           ObjectInputStream OIS = new ObjectInputStream(FIS);
           users = (HashMap) OIS.readObject();
           OIS.close();
           FIS.close();
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
