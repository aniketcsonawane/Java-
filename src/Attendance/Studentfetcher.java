/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import StudentManagment.ViewAttendance;
import staffMangment.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Studentfetcher {
   
    
      public ArrayList  fetchdata(String dept,String sem) 
      {
           ArrayList ar = new ArrayList();
       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
            String query = "select * from studentinfo where dept='" + dept + "'and sem='" + sem + "'";
           
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) 
            {
             
                ar.add(rs.getString(1));
              

            }
            con.close();

        } catch (Exception ex) {
            System.out.println("Exception in fetchdata function of Datafetcher class is:" + ex);
        }
        return ar;
    }
    public void  fetchStudent(String user) 
      {       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
            String query = "select name , sem from studentinfo where userid='" + user + "'";
           
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                ViewAttendance.studentName= rs.getString("name");
                ViewAttendance.sem= rs.getString("sem");
            }
            con.close();
            System.out.println("student Name = "+ViewAttendance.studentName);
            System.out.println("student Name = "+ViewAttendance.sem);

        } catch (Exception ex) {
            System.out.println("Exception in fetchdata function of Datafetcher class is:" + ex);
        }
    }

}
