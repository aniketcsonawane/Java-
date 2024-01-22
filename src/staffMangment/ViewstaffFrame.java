/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staffMangment;

import AdminManagment.AdminUpdateFrame;
import AdminManagment.MainLoginFrame;
import AdminManagment.SQLBackupAndRestore;
import AdminManagment.download;
import AdminManagment.upload;
import SendAlert.SendAlertFrame;
import dbbackuprestore.Dbbackup;
import dbbackuprestore.DownLoadFromCloud;
import dbbackuprestore.Restore;
import dbbackuprestore.UploadDataToCloud;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ViewstaffFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewStud
     */
    public static String data[][]; 
    public ViewstaffFrame() {
        super("Staff View By Admin ");
        initComponents();
        //name, abr, gen, mob, mail, userid, pass, cpass
        String col[]={"Name","ABR","Gender","Mobile No","Email ID","UserId"};
        ViewStaffClass vd=new ViewStaffClass();
        vd.GetAllInfo();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,col));//factory  method                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 0, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(4, 60, 1580, 710);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Staff Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(690, 10, 240, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1580, 770);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("Manage Profile");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem1.setText("Edit Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Staff Managment");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(51, 204, 0));
        jMenuItem2.setText("Add Staff");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem3.setText("Update Staff");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem5.setText("View Staff");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem6.setText("Delete Staff");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Alerts");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem7.setText("Send Alert");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Cloud files");
        jMenu5.setToolTipText("");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem9.setText("Export File On Cloud");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem10.setText("Import File From Cloud");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setText("Exit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem4.setText("Logout");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        AdminUpdateFrame ad=new AdminUpdateFrame();
        ad.setVisible(true);
        ad.setSize(d);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        AddStaffFrame ad=new AddStaffFrame();
        ad.setVisible(true);
        ad.setSize(d);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        StaffupdateFrame ad=new StaffupdateFrame();
        ad.setVisible(true);
        ad.setSize(d);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        ViewstaffFrame ad=new ViewstaffFrame();
        ad.setVisible(true);
        ad.setSize(d);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        StaffDeleteFrame ad=new StaffDeleteFrame();
        ad.setVisible(true);
        ad.setSize(d);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        SendAlertFrame ad=new SendAlertFrame();
        ad.setVisible(true);
        ad.setSize(d);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        upload u=new upload();
        u.frmUploadDatabase.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        download d=new download();
        d.frmDownloadDatabase.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        MainLoginFrame al=new MainLoginFrame();
        al.setVisible(true);
        al.setSize(d);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewstaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewstaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewstaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewstaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewstaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
