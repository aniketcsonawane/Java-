/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentManagment;

import static StudentManagment.UpdateStudentFrame.uname;
import java.sql.*;


/**
 *
 * @author HP
 */
public class DBupdator {
                                            //  //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
    public static boolean isUpdated(String name,String dob,String sex,String dept,String sem,String mail,String mob,String uname,String parent,String pass)
    {
        
        boolean flag=false;
         try
        {
       
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();            
                                                                                                     //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
            String query = "Update studentinfo  set name='" + name + "',dob='" + dob + "',sex='" + sex + "',dept='" + dept + "',sem='" + sem + "',mail='" + mail + "',mob='" + mob + "',parent='" + parent + "',pass='" + pass + "' where userid='" + uname + "'";
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
            System.out.println("Exception at DBupdate class in isupdated function "+ex);
        }

         return flag;
    }
    
}
