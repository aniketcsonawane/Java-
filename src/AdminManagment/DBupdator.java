/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminManagment;

import java.sql.*;


/**
 *
 * @author HP
 */
public class DBupdator {
    
    public static boolean isUpdated(String userid,String pass)
    {
        
        boolean flag=false;
         try
        {
       
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();            
   
            String query = "Update admininfo  set pass='" + pass + "' where userid='" + userid + "'";
            int x = st.executeUpdate(query);
        
            if (x > 0) {
                flag = true;
            } else {
                flag = false;
            }
         
        }
        catch(Exception ex)
        {
            System.out.println("Exception at DBupdate class in isupdated function "+ex);
        }

         return flag;
    }
    
}
