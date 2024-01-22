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
public class StaffDBupdator {
    
    public static boolean isUpdated(String name,String abr,String gen,String mob,String mail,String userid,String pass,String cpass)
    {
        
        boolean flag=false;
         try
        {
       
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st = con.createStatement();            
                     //name, abr, gen, mob, mail, userid, pass, cpass                        // name, abr, gen, mob, mail, userid, pass, cpass
            String query = "Update staffinfo  set name='" + name + "',abr='" + abr + "',gen='" + gen + "',mob='" + mob + "',mail='" + mail + "',pass='" + pass + "',cpass='" + cpass + "' where userid='" + userid + "'";
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
