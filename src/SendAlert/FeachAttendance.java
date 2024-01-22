

package SendAlert;

import java.sql.*;
import java.util.ArrayList;

public class FeachAttendance {

    public ArrayList GetAllInfo(String fdate,String tdate,String sem ,String dept,String sub) {

        ArrayList  mass=new ArrayList();
        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
           
            Statement st2 = con.createStatement();
           
            String query = "select * from attendanceinfo where date >='"+fdate+"' and date <='"+tdate+"' and dept='"+dept+"'and sem='"+sem+"'and sub='"+sub+"'";
           
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
             //System.out.println(mass);
            //date, dept, sem, student, sub, status, feedby, disc
              con.close();
        } catch (Exception e) 
        {
            System.out.println("Exception in GetAllInfo of FeachAttendance class " + e);
            flag = false;
        }
return mass;
    }
}
