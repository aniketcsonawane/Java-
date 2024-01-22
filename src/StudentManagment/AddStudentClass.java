/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StudentManagment;

import staffMangment.*;
import java.sql.*;



/**
 *
 * @author HP
 */
public class AddStudentClass 
{
     public boolean insertData(String name,String dob,String sex,String dept,String sem,String mail,String mob,String userid,String parent,String pass)
    {
        
        boolean flag=false;
	try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
            Statement st=con.createStatement();
                                                                                         //name, dob, sex, dept, sem, mail, mob, userid, pass, cpass
            String query="insert into studentinfo values ('"+name+"','"+dob+"','"+sex+"','"+dept+"','"+sem+"','"+mail+"','"+mob+"','"+userid+"','"+parent+"','"+pass+"')";
            int x=st.executeUpdate(query);
            if(x>0)
              
               flag=true;
            else
                flag=false;
               con.close();
        }
        catch(Exception e)
        {
           System.out.println("Exception in AddstudDb in isinserted "+e);
           flag=false;
        }
        
        return flag;
    }
    
}
