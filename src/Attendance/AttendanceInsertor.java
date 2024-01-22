/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import StudentManagment.*;
import staffMangment.*;
import java.sql.*;



/**
 *
 * @author HP
 */
public class AttendanceInsertor 
{
     public boolean insertData(String date,String dept,String sem,String student,String sub,String status,String disc,String feedby)
    {        
        boolean flag=false;
	try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
            Statement st=con.createStatement();
                            //date, dept, sem, student, sub, status, feedby, disc                                                        
            String query="insert into attendanceinfo values ('"+date+"','"+dept+"','"+sem+"','"+student+"','"+sub+"','"+status+"','"+feedby+"','"+disc+"')";
            int x=st.executeUpdate(query);
            if(x>0)
              
               flag=true;
            else
                flag=false;
               con.close();
        }
        catch(Exception e)
        {
           System.out.println("Exception in AttendanceInsertor in isinserted "+e);
           flag=false;
        }
        
        return flag;
    }
    
}
