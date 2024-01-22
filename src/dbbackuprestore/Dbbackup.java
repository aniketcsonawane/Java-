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
public class Dbbackup {

    public boolean backupDB(String databaseName, String filepath) {
        boolean flag=false;
       try {
           Process p=null;
       
            Runtime runtime = Runtime.getRuntime();
//            root=root.replace('\\', '/');
            String back="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysqldump.exe -uroot -proot --add-drop-database -B "+databaseName+" -r "+filepath;
            p=runtime.exec("C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysqldump.exe -uroot -proot --add-drop-database -B "+databaseName+" -r"+filepath);
            System.out.println("FILE IS :------ "+back);
            int processComplete = p.waitFor();
            if (processComplete==0) 
            {
                //JOptionPane.showMessageDialog(null, "Backup Created Successfully");
                flag=true;
            }
            else
            {
                //JOptionPane.showMessageDialog(null, "Backup Failed");
                flag=false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
}
}
