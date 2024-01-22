/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminManagment;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Datafetcher {
   
    
      public ArrayList  fetchdata(String user) 
      {
           ArrayList ar = new ArrayList();
       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //FullName, Date of Birth, Gender, Address, Email Id, MobileNo, UserID, Password, Cpassword
            String query = "select * from admininfo where UserID='" + user + "'";
           
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) 
            {

                String Admin = rs.getString(1);
                String pass = rs.getString(2);
                
                
                ar.add(Admin);
                ar.add(pass);
              

                

            } 
            else {
                System.out.println("No data found");
            }
            
              con.close();

        } catch (Exception ex) {
            System.out.println("Exception in fetchdata function of Datafetcher class is:" + ex);
        }
        return ar;
    }

}
