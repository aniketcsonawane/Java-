/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminManagment;

import java.sql.*;
/**
 *
 * @author HP
 */
public class AdminLoginChecker 
{  
    public boolean isLogged(String user,String pass)
    {        
        boolean flag=false;
	try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
            Statement st=con.createStatement();
            
            //fname, dob, gen, addd, email, mob, userid, Pass, cpass

            String query="Select * from  admininfo where userid='"+user+"' and Pass='"+pass+"'";
            ResultSet rs = st.executeQuery(query);          
            if (rs.next())
            {
                flag=true;    
            }          
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception in login class "+e);
            flag=false;
        }
       
        return flag;
    }
    
    
     public boolean staffIsLogged(String user,String pass)
    {
         
        boolean flag=false;
	try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
            Statement st=con.createStatement();
//fname, dob, gen, addd, email, mob, userid, Pass, cpass
            String query="Select * from  staffinfo where userid='"+user+"' and Pass='"+pass+"'";
          ResultSet rs=st.executeQuery(query);          
            if (rs.next())
            {
            flag=true;    
            }          
             con.close();
        }
        catch(Exception e)
        {
           System.out.println("Exception in login class "+e);
           flag=false;
        }       
        return flag;
    } 
}
