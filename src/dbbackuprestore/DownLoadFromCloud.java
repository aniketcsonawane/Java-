/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbbackuprestore;
//
//import com.dropbox.core.DbxRequestConfig;
//import com.dropbox.core.v2.DbxClientV2;
//import com.dropbox.core.v2.files.FileMetadata;
//import com.dropbox.core.v2.users.FullAccount;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author HP
 */
public class DownLoadFromCloud 
{

    public boolean downLoadNow(String fname,String downloadpath)
    {
        boolean flag=false;
       // try
        //{
//                final String ACCESS_TOKEN = "paiJHfwmA9wAAAAAAAAAAZ9LtK5kh34f36A8EfHD4GIeO9WzxkTgoN3Cg37X4wsb";
//            DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial1").build();
//            DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
//            FullAccount account = client.users().getCurrentAccount();
//            System.out.println(account.getName().getDisplayName());
//            
//              OutputStream downloadFile = new FileOutputStream(downloadpath);
//                try
//                {
//                FileMetadata metadata = client.files().downloadBuilder("/"+fname).download(downloadFile);
//                }
//                finally
//                {
//                    downloadFile.close();
//                }
//            
//            
//            flag=true;
//        }
//       catch(Exception ex)
//       {
//                 System.out.println("Exception at DownLoadFromCloud "+ex);
//       }
//       
        
        return flag;
    }
}
