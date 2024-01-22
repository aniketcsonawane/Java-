/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staffMangment;

import java.sql.*;



/**
 *
 * @author HP
 */
public class AddSaffClass 
{
    //FullName, Date of Birth, Gender, Address, Email Id, MobileNo, UserID, Password, Cpassword
     public boolean insertData(String name,String abr,String gen,String mob,String mail,String userid,String pass,String cpass)
    {
        
        boolean flag=false;
	try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
            Statement st=con.createStatement();
                                                    //name, abr, gen, mob, mail, userid, pass, cpass
            String query="insert into staffinfo values ('"+name+"','"+abr+"','"+gen+"','"+mob+"','"+mail+"','"+userid+"','"+pass+"','"+cpass+"')";
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
