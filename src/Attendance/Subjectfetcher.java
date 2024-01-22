/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import staffMangment.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Subjectfetcher {
   
    
      public ArrayList  fetchdata(String sem) 
      {
           ArrayList ar = new ArrayList();
       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //srno, sem, sub
            String query = "select * from subjectinfo where sem='" + sem + "'";
           
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) 
            {
             
                ar.add(rs.getString(3));
              

            }
   con.close();
        } catch (Exception ex) {
            System.out.println("Exception in fetchdata function of Datafetcher class is:" + ex);
        }
        return ar;
    }

}
