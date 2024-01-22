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
public class staffDeleteClass
{
    public static boolean isdeleted(String user) 
    {
        boolean flag=false;
        try {
              Class.forName("com.mysql.jdbc.Driver").newInstance();
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem","root","root");
              Statement st=con.createStatement();
               //name, abr, gen, mob, mail, userid, pass, cpass    
              String query="delete from staffinfo where userid='"+user+"'";
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
