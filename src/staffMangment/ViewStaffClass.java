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
public class ViewStaffClass {

    public void GetAllInfo() {

        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancesystem", "root", "root");
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();

            String query = "select * from staffinfo";

            ResultSet rs1 = st1.executeQuery(query);
            ResultSet rs2 = st2.executeQuery(query);

            int row = 0;
            while (rs1.next()) {
                row++;

            }

            String data[][] = new String[row][6];

            int i = 0;
//name, abr, gen, mob, mail, userid, pass, cpass
            while (rs2.next()) {
                String name = rs2.getString(1);
                String abr = rs2.getString(2);
                String gen = rs2.getString(3);
                 String mob = rs2.getString(4);
                String mail = rs2.getString(5);
                String userid = rs2.getString(6);
                 
                

           //pass to matrix  Rollno, Name, Percentage
                data[i][0] = name;
                data[i][1] = abr;
                data[i][2] = gen;
                data[i][3] = mob;
                data[i][4] = mail;
                data[i][5] = userid;
              
               

                i++;

            }
            ViewstaffFrame.data = data;
   con.close();
        } catch (Exception e) {
            System.out.println("Exception in GetAllInfo of viewDBdata class " + e);
            flag = false;
        }

    }
}
