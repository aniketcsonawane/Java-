/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import java.sql.*;
import java.util.ArrayList;
import staffMangment.*;

/**
 *
 * @author HP
 */
public class ViewAttendanceClass {

    public ArrayList GetAllInfo(String dept,String sub,String sem ) {

        ArrayList  mass=new ArrayList();
        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
           
            Statement st2 = con.createStatement();
            //date, dept, sem, student, sub, status, feedby, disc
                     String query = "select * from attendanceinfo where dept='"+dept+"' and sub='"+sub+"' and sem='"+sem+"'";

            
            ResultSet rs2 = st2.executeQuery(query);
    //date, dept, sem, student, sub, status, feedby, disc
            int row = 0;
           
            while (rs2.next()) 
            { 
                 ArrayList  in=new ArrayList();
                in.add(rs2.getString(1));
                in.add(rs2.getString(2));
                in.add(rs2.getString(3));
                in.add(rs2.getString(4));
                in.add(rs2.getString(5));
                in.add(rs2.getString(6));
                in.add(rs2.getString(7));
                in.add(rs2.getString(8));
                
                System.out.println("in ArrayList "+in);
                    mass.add(in);
              
            }
      
              con.close();
             //System.out.println(mass);
            //date, dept, sem, student, sub, status, feedby, disc
           
        } catch (Exception e) {
            System.out.println("Exception in GetAllInfo of viewDBdata class " + e);
            flag = false;
        }
return mass;
    }
}
