/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbbackuprestore;

//import com.dropbox.core.DbxRequestConfig;
//import com.dropbox.core.v2.DbxClientV2;
//import com.dropbox.core.v2.files.FileMetadata;
//import com.dropbox.core.v2.files.WriteMode;
//import com.dropbox.core.v2.users.FullAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author HP
 */
public class UploadDataToCloud 
{

    public boolean uploadToCloud(String path)
    {
        boolean flag=false;
//        try
//        {
//   
//            final String ACCESS_TOKEN = "paiJHfwmA9wAAAAAAAAAAZ9LtK5kh34f36A8EfHD4GIeO9WzxkTgoN3Cg37X4wsb";
//            DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial1").build();
//            DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
//            FullAccount account = client.users().getCurrentAccount();
//            System.out.println(account.getName().getDisplayName());
//            InputStream in = new FileInputStream(path);
//
//            String fname = new File(path).getName();
//            FileMetadata metadata = client.files().uploadBuilder("/" + fname).withMode(WriteMode.OVERWRITE).uploadAndFinish(in);
//
//            System.out.println("File Uploaded Successfully");
//
//
//            
//            
//            flag=true;
//        }
//       catch(Exception ex)
//       {
//           System.out.println("Exception at UploadDataToCloud "+ex);
//       }
//        
       
        return flag;
    }
}
