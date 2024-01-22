/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SendAlert;

import Attendance.*;
import java.sql.*;
import java.util.ArrayList;
import staffMangment.*;

/**
 *
 * @author HP
 */
public class CheckStatus {

    public boolean isPresent(String date,String sname,String sub,String dept,String sem) {

        ArrayList  mass=new ArrayList();
        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
           
            Statement st2 = con.createStatement();
            //date, dept, sem, student, sub, 
            String query = "select * from attendanceinfo where date='"+date+"' and student='"+sname+"' and sub='"+sub+"'and sem='"+sem+"'and dept='"+dept+"'";
             ResultSet rs2 = st2.executeQuery(query);
            //date, dept, sem, student, sub, status, feedby, disc           
            if(rs2.next()) 
            { 
               
             String st= rs2.getString(6);
                if (st.equals("Present"))
                {
                    flag=true;
                }

            }   
               con.close();
        } catch (Exception e) {
            System.out.println("Exception in GetAllInfo of FeachAttendance class " + e);
            flag = false;
        }
return flag;
    }
}
