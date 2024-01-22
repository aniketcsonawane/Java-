/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentManagment;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class StudentDatafetcher {
    
      public ArrayList  fetchdata(String user) 
      {
           ArrayList ar = new ArrayList();
           //System.out.println(user);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //name, dob, sex, dept, sem, mail, mob, userid, parent, pass
            String query = "select * from studentinfo where userid='" + user + "'";           
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) 
            {
             //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
                String name =rs.getString(1);//0
                String dob = rs.getString(2);
                String sex = rs.getString(3);
                String dept =rs.getString(4);
                String sem = rs.getString(5);
                String mail =rs.getString(6);
                String mob = rs.getString(7);
                String parent =rs.getString(9);
                String pass =rs.getString(10);
                
                
                ar.add(name);
                ar.add(dob);
                ar.add(sex);
                ar.add(dept);
                ar.add(sem);
                ar.add(mail);
                ar.add(mob);
                ar.add(parent);
                ar.add(pass);

            } else {
                System.out.println("No data found");
            }
            
            //System.out.println(ar);
   con.close();
        } catch (Exception ex) {
            System.out.println("Exception in fetchdata function of Datafetcher class is:" + ex);
        }
        return ar;
    }

}
