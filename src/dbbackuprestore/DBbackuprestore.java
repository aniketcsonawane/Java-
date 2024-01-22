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
public class DBbackuprestore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String dbname="attendancesystem";
        String filename=dbname+".sql";
        String path="C:\\Users\\91721\\Desktop\\\\\\"+filename;
        System.out.println("Database name : "+dbname);
        System.out.println("filename : "+filename);
        System.out.println("Path is : "+path);
 //code for getting database backup and upload to cloud
//        if ( new Dbbackup().backupDB(dbname,path))
//        {
//            
//            if (new UploadDataToCloud().uploadToCloud(path)) 
//            {
//                JOptionPane.showMessageDialog(null, "File Uploaded Successfully On Cloud");
//            } 
//            else 
//            {                
//                JOptionPane.showMessageDialog(null, "Failed To upload File On Cloud");
//            }
//            
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Backup Failed");
//        }
       
        //download file from cloud and resore in database
        if (new DownLoadFromCloud().downLoadNow(filename,path)) 
        {
            if (new Restore().isrestored(path)) 
            {
                JOptionPane.showMessageDialog(null, "Database restored successfully");
            } 
            else 
            {                
                JOptionPane.showMessageDialog(null, "Failed To Download File On Cloud");
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Error to download file please check file name");
        }
//        
//        
        
        
        
        
        //new Restore().isrestored("C:\\Users\\Asus\\Desktop\\\\sqli.sql");
    }
    
}
