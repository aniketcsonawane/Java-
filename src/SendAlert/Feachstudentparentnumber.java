

package SendAlert;

import java.sql.*;
import java.util.ArrayList;

public class Feachstudentparentnumber {

    public ArrayList GetAllInfo(String name) {

        ArrayList  mass=new ArrayList();
        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
           
            Statement st2 = con.createStatement();
           //name, dob, sex, dept, sem, mail, mob, userid, parent, pass
            String query = "select * from studentinfo where name='"+name+"'";
          
            ResultSet rs2 = st2.executeQuery(query);
            
            int row = 0;
           
            while (rs2.next()) 
            {               
                mass.add(rs2.getString(7));
                mass.add(rs2.getString(9));                                                       
            }                 
           
              con.close();
        } catch (Exception e) 
        {
            System.out.println("Exception in GetAllInfo of FeachAttendance class " + e);
            flag = false;
        }
return mass;
    }
}
