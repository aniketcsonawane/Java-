/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import staffMangment.*;
import java.sql.*;



/**
 *
 * @author HP
 */
public class AttendanceRowDeletor
{
    public static boolean isdeleted(String date,String sem,String dept,String student) 
    {
        boolean flag=false;
        try {
              Class.forName("com.mysql.jdbc.Driver").newInstance();
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
              Statement st=con.createStatement();
               //date, dept, sem, student, sub, status, feedby, disc   
              String query="delete from attendanceinfo where date='"+date+"' and dept='"+dept+"' and sem='"+sem+"' and student='"+student+"'";
              int x=st.executeUpdate(query);
              if (x>0)
              {
                flag=true;
                }else
              {
                  flag=false;
              }
   con.close();
        } catch (Exception ex)
        {
            System.out.println("Exception in isDelete function of DeleteFrame is:"+ex);
        }
        return flag;
    }
            
}
