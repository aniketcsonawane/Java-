/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staffMangment;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class StaffDatafetcher {
   
    
      public ArrayList  fetchdata(String user) 
      {
           ArrayList ar = new ArrayList();
       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //name, abr, gen, mob, mail, userid, pass, cpass
            String query = "select * from staffinfo where userid='" + user + "'";
           
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) 
            {
                
                ar.add(rs.getString(1));
                ar.add(rs.getString(2));
                ar.add(rs.getString(3));
                ar.add(rs.getString(4));
                ar.add(rs.getString(5));
                ar.add(rs.getString(7));
                ar.add(rs.getString(8));

            } else {
                System.out.println("No data found");
            }
            
              con.close();

        } catch (Exception ex) {
            System.out.println("Exception in fetchdata function of Datafetcher class is:" + ex);
        }
        return ar;
    }

}
