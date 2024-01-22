package AdminManagment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import dbbackuprestore.Dbbackup;
import dbbackuprestore.UploadDataToCloud;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class upload {

	public JFrame frmUploadDatabase;
	JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					upload window = new upload();
					window.frmUploadDatabase.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public upload() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUploadDatabase = new JFrame();
		frmUploadDatabase.setTitle("Upload database");
		frmUploadDatabase.setBounds(100, 100, 488, 329);
		//frmUploadDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUploadDatabase.getContentPane().setLayout(null);
		frmUploadDatabase.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread(){
			        public void run(){
				progressBar.setValue(10);
				
				 String dbname="attendancesystem";
				 progressBar.setValue(20);
			        String filename=dbname+".sql";
			        String path="C:\\Users\\91721\\Desktop\\"+filename;
			        //code for getting database backup and upload to cloud
			        progressBar.setValue(40);
			        if ( new Dbbackup().backupDB(dbname,path))
			        {
			        	progressBar.setValue(50);
			            if (new UploadDataToCloud().uploadToCloud(path)) 
			            {
			            	progressBar.setValue(100);
			                JOptionPane.showMessageDialog(null, "File Uploaded Successfully On Cloud");
			            } 
			            else 
			            {                
			            	progressBar.setValue(0);
			                JOptionPane.showMessageDialog(null, "Failed To upload File On Cloud");
			            }
			            
			        }
			        else
			        {
			            JOptionPane.showMessageDialog(null, "Backup Failed");
			        }
			        }}.start();
			        
			}});
		btnUpload.setBounds(181, 199, 89, 23);
		frmUploadDatabase.getContentPane().add(btnUpload);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(78, 248, 312, 14);
		frmUploadDatabase.getContentPane().add(progressBar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(upload.class.getResource("/AdminManagment/managed-backup.png")));
		label.setBounds(10, 0, 452, 279);
		frmUploadDatabase.getContentPane().add(label);
	}
}
