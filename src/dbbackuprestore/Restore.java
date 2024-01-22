/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbbackuprestore;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Restore 
{
    public boolean isrestored(String path)
    {
         boolean flag=false;
        String dbUserName = "root";// username
        String dbPassword = "root";//Password
//        root=root.replace('/', '\\');
        String[] restoreCmd = new String[]{"C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql.exe ", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + path};
        Process runtimProcess;
        try {
            runtimProcess = Runtime.getRuntime().exec(restoreCmd);
            int proceCom = runtimProcess.waitFor();
            
            if (proceCom==0) {
               flag=true;
            }else{
               flag=false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
}
