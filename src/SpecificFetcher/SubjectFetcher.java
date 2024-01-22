/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecificFetcher;

import StudentManagment.ViewAttendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;    

/**
 *
 * @author Nakul
 */
public class SubjectFetcher {
    public ArrayList fetchSubject(String sem) 
      {       
        ArrayList subList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();
            //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
            String query = "select sub from subjectinfo where sem='" + sem + "'";
           
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                subList.add(rs.getString(0));
            }
            con.close();
         
        } catch (Exception ex) {
            System.out.println("Exception in fetchsubject function of Datafetcher class is:" + ex);
        }
        return subList;
    }
}
