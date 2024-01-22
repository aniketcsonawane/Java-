/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import StudentManagment.*;
import static StudentManagment.UpdateStudentFrame.uname;
import java.sql.*;


/**
 *
 * @author HP
 */
public class Attendanceupdator {
          //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
    public static boolean isUpdated(String dept,String sem,String student,String sub,String status,String feedby,String disc,String date)
    {
        
        boolean flag=false;
         try
        {
       
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();            
                                                      //date, dept, sem, student, sub, status, feedby, disc
            String query = "Update attendanceinfo  set status='" + status + "',feedby='" + feedby + "',disc='" + disc + "' where dept='" + dept + "' and sem='" + sem + "' and student='" + student + "' and sub='" + sub + "' and  date='" + date + "'";
            int x = st.executeUpdate(query);
        
            if (x > 0) {
                flag = true;
            } else {
                flag = false;
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception at Attendanceupdator class in isupdated function "+ex);
        }

         return flag;
    }
    
}
