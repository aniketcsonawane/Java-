package AdminManagment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import dbbackuprestore.DownLoadFromCloud;
import dbbackuprestore.Restore;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class download {

    public JFrame frmDownloadDatabase;
	JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					download window = new download();
					window.frmDownloadDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public download() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDownloadDatabase = new JFrame();
		frmDownloadDatabase.setTitle("Download Database");
		frmDownloadDatabase.setBounds(100, 100, 488, 329);
		//frmDownloadDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDownloadDatabase.getContentPane().setLayout(null);
		frmDownloadDatabase.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		JButton btnDownload = new JButton("Download");
		btnDownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new Thread(){
			        public void run(){
			        	
			        	 progressBar.setValue(10);
			        	 String dbname="attendancesystem";
			        	 progressBar.setValue(30);
			             String filename=dbname+".sql";
			             String path="C:\\Users\\91721\\Desktop\\"+filename;
			             progressBar.setValue(50);
			             if (new DownLoadFromCloud().downLoadNow(filename,path)) 
			             {
			            	 progressBar.setValue(70);
			                 if (new Restore().isrestored(path)) 
			                 {
			                	 progressBar.setValue(100);
			                     JOptionPane.showMessageDialog(null, "Database restored successfully");
			                 } 
			                 else 
			                 {                
			                	 progressBar.setValue(0);
			                     JOptionPane.showMessageDialog(null, "Failed To Download File On Cloud");
			                 }
			             } 
			             else 
			             {
			                 JOptionPane.showMessageDialog(null, "Error to download file please check file name");
			             }
			           
			        	
			        }  }.start();
			}
		});
		btnDownload.setBounds(177, 189, 89, 23);
		frmDownloadDatabase.getContentPane().add(btnDownload);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(85, 236, 283, 14);
		frmDownloadDatabase.getContentPane().add(progressBar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(download.class.getResource("/AdminManagment/managed-backup.png")));
		label.setBounds(10, 10, 452, 280);
		frmDownloadDatabase.getContentPane().add(label);
	}

}
