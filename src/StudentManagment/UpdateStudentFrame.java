/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagment;

import AdminManagment.AdminUpdateFrame;
import AdminManagment.MainLoginFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import staffMangment.*;
import StudentManagment.studentOprationFrame;

/**
 *
 * @author HP
 */
public class UpdateStudentFrame extends javax.swing.JFrame {

    public static boolean gen = false;
    public static String uname;

    /**
     * Creates new form AddStaff
     */
    public UpdateStudentFrame() {
        super("Update Student Profile");
        initComponents();

        StudentDatafetcher df = new StudentDatafetcher();
        ArrayList ar = df.fetchdata(uname);
        ////name, dob, sex, dept, sem, mail, mob, userid, parent, pass
        nameFeild.setText((String) ar.get(0));
        String date = (String) ar.get(1);
        String ch[] = date.split(" / ");
        String d = (ch[0]);
        String m = (ch[1]);
        String y = (ch[2]);
        dateBox.setSelectedItem(d);
        monthBox.setSelectedItem(m);
        yearBox.setSelectedItem(y);

        String ge = (String) ar.get(2);
        if (ge.equals("Male")) {
            maleRbtn.setSelected(true);
            femaleRbtn.setSelected(false);
            gen = true;
        } else if (ge.equals("Female")) {
            maleRbtn.setSelected(false);
            femaleRbtn.setSelected(true);
            gen = true;
        }
        pMobileFeild.setText((String) ar.get(7));
        deptBox.setSelectedItem((String) ar.get(3));
        semBox.setSelectedItem(ar.get(4));
        emailFeild.setText((String) ar.get(5));
        mobileFeild.setText((String) ar.get(6));
        passFeild.setText((String) ar.get(8));

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
        dobLable = new javax.swing.JLabel();
        mobLbl = new javax.swing.JLabel();
        nameFeild = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        maleRbtn = new javax.swing.JRadioButton();
        femaleRbtn = new javax.swing.JRadioButton();
        nameLable = new javax.swing.JLabel();
        mobileFeild = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailFeild = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        passLbl = new javax.swing.JLabel();
        cnPassLbl = new javax.swing.JLabel();
        passFeild = new javax.swing.JPasswordField();
        cnPassFeild = new javax.swing.JPasswordField();
        dateBox = new javax.swing.JComboBox();
        yearBox = new javax.swing.JComboBox();
        monthBox = new javax.swing.JComboBox();
        deptLbl = new javax.swing.JLabel();
        semLbl = new javax.swing.JLabel();
        semBox = new javax.swing.JComboBox();
        deptBox = new javax.swing.JComboBox();
        pMobileLbl = new javax.swing.JLabel();
        pMobileFeild = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        dobLable.setText("Date of Birth");

        mobLbl.setText("Mobile no");

        genderLbl.setText("Gender");

        maleRbtn.setBackground(new java.awt.Color(255, 255, 255));
        maleRbtn.setText("Male");
        maleRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRbtnActionPerformed(evt);
            }
        });

        femaleRbtn.setBackground(new java.awt.Color(255, 255, 255));
        femaleRbtn.setText("Female");
        femaleRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRbtnActionPerformed(evt);
            }
        });

        nameLable.setText("Name");

        emailLbl.setText("Email");

        updateBtn.setBackground(new java.awt.Color(51, 204, 0));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 0, 0));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        passLbl.setText("Password");

        cnPassLbl.setText("Confirm password ");

        dateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBoxActionPerformed(evt);
            }
        });

        yearBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1995", "1996", "1997", "1998", "1999", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        monthBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Jan", "Feb", "March", "April", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        deptLbl.setText("Depatment");

        semLbl.setText("Select Semester");

        semBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester", "I", "II", "III", "IV", "V", "VI" }));
        semBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semBoxActionPerformed(evt);
            }
        });

        deptBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Department", "IT", "COM" }));

        pMobileLbl.setText("Parent Mobile no");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pMobileLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLbl)
                            .addComponent(dobLable))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maleRbtn)
                                .addGap(29, 29, 29)
                                .addComponent(femaleRbtn)
                                .addGap(31, 31, 31)))
                        .addGap(209, 209, 209))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(updateBtn))
                            .addComponent(semLbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLable)
                                    .addComponent(emailLbl)
                                    .addComponent(passLbl)
                                    .addComponent(cnPassLbl)
                                    .addComponent(mobLbl)
                                    .addComponent(deptLbl))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deptBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(passFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(semBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(pMobileFeild)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(clearBtn)
                                        .addComponent(cnPassFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLable)
                    .addComponent(nameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dobLable)
                        .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(maleRbtn)
                    .addComponent(femaleRbtn))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptLbl)
                    .addComponent(deptBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semLbl)
                    .addComponent(semBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pMobileLbl)
                    .addComponent(pMobileFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLbl)
                    .addComponent(passFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnPassLbl)
                    .addComponent(cnPassFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(clearBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(590, 140, 430, 570);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Update Details");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(630, 30, 530, 110);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("Manage Profile");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem1.setText("Edit Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setText("Exit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        nameFeild.setText(null);
        mobileFeild.setText(null);
        emailFeild.setText(null);
        deptBox.setSelectedItem("Department");
        pMobileFeild.setText(null);
        dateBox.setSelectedItem("Date");
        monthBox.setSelectedItem("Month");
        yearBox.setSelectedItem("Year");
        semBox.setSelectedItem("Semester");
        maleRbtn.setSelected(false);
        femaleRbtn.setSelected(false);
        passFeild.setText(null);
        cnPassFeild.setText(null);

    }//GEN-LAST:event_clearBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String d = (String) dateBox.getSelectedItem();
        String m = (String) monthBox.getSelectedItem();
        String y = (String) yearBox.getSelectedItem();
        String dob = d + " / " + m + " / " + y;

        String name = nameFeild.getText();
        String dept = (String) deptBox.getSelectedItem();
        String mob = mobileFeild.getText();
        String Parent = pMobileFeild.getText();
        String mail = emailFeild.getText();
        String sem = (String) semBox.getSelectedItem();
        String gn = "";
        if (maleRbtn.isSelected()) {
            gn = maleRbtn.getText();
        } else if (femaleRbtn.isSelected()) {
            gn = femaleRbtn.getText();
        }

        char ch[] = passFeild.getPassword();
        String pass = String.valueOf(ch);

        char ch1[] = cnPassFeild.getPassword();
        String cpass = String.valueOf(ch1);

        if ((name.isEmpty())) {
            JOptionPane.showMessageDialog(null, "Please enter name");

        } else if (!dOB(d, m, y)) {
            JOptionPane.showMessageDialog(null, "Please Enter Date of Birth");

        } else if (!getGen(gen)) {
            JOptionPane.showMessageDialog(null, "Please Select gender");

        } else if (dept.equals("Department")) {
            JOptionPane.showMessageDialog(null, "Please select Depatment");

        } else if (!isSelectedsem(sem)) {
            JOptionPane.showMessageDialog(null, "Please Select Semester");

        } else if (!getMail(mail)) {
            JOptionPane.showMessageDialog(null, "Please enter Valid Email Address");

        } else if (!getmob(mob)) {
            JOptionPane.showMessageDialog(null, "Please enter Valid Moblie number ");

        } else if (!getmob(mob)) {
            JOptionPane.showMessageDialog(null, "Please enter Valid Parent Mobile number ");

        } else if (!chkpass(pass, cpass)) {
            JOptionPane.showMessageDialog(null, "Please enter Valid Password");

        } else {

            DBupdator as = new DBupdator();
            boolean flag = as.isUpdated(name, dob, gn, dept, sem, mail, mob, uname, Parent, pass);

            if (flag) {
                JOptionPane.showMessageDialog(null, "Student Data Updated Successfully");
                this.dispose();
                studentOprationFrame sof = new studentOprationFrame();
                Dimension dim =  Toolkit.getDefaultToolkit().getScreenSize();
                sof.setVisible(true);
                sof.setSize(dim);
            } else {
                JOptionPane.showMessageDialog(null, "Error occured Please try Again");
            }

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void femaleRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRbtnActionPerformed
        // TODO add your handling code here:
        maleRbtn.setSelected(false);
        femaleRbtn.setSelected(true);
        gen = true;
    }//GEN-LAST:event_femaleRbtnActionPerformed

    private void maleRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRbtnActionPerformed
        // TODO add your handling code here:
        maleRbtn.setSelected(true);
        femaleRbtn.setSelected(false);
        gen = true;
    }//GEN-LAST:event_maleRbtnActionPerformed

    private void dateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dateBoxActionPerformed

    private void semBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semBoxActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        UpdateStudentFrame ad = new UpdateStudentFrame();
        ad.setVisible(true);
        ad.setSize(d);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        MainLoginFrame al = new MainLoginFrame();
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
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudentFrame().setVisible(true);
            }
        });
    }

    public static boolean chkpass(String pass, String cpass) {
        boolean flag = false;

        if (!pass.isEmpty() && !cpass.isEmpty()) {
            if (pass.equals(cpass)) {
                flag = true;
            }
        }
        return flag;
    }
    //Email validation check

    public static boolean getMail(String mail) {
        boolean flag = false;

        if (!mail.isEmpty()) {
            if (mail.contains(".") && mail.contains("@")) {
                flag = true;
            }
        }
        return flag;
    }

    //gender validation
    public static boolean getGen(boolean flag) {
        boolean t = false;
        if (flag) {
            t = true;
        }
        return flag;
    }

    public static boolean dOB(String d, String m, String y) {
        boolean flag = false;

        if (!d.equals("Date") && !m.equals("Month") && !y.equals("Year")) {

            flag = true;

        }
        return flag;
    }

    public static boolean isSelectedsem(String sem) {
        boolean flag = false;

        if (!sem.equals("Semester")) {

            flag = true;

        }
        return flag;
    }

    //Mobile number validation check
    public static boolean getmob(String mob) {
        boolean flag = false;
        try {
            if (!mob.isEmpty()) {

                if (mob.length() == 10) {

                    long n = Long.parseLong(mob);
                    flag = true;

                }

            }
        } catch (Exception e) {

        }
        return flag;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JPasswordField cnPassFeild;
    private javax.swing.JLabel cnPassLbl;
    private javax.swing.JComboBox dateBox;
    private javax.swing.JComboBox deptBox;
    private javax.swing.JLabel deptLbl;
    private javax.swing.JLabel dobLable;
    private javax.swing.JTextField emailFeild;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JRadioButton femaleRbtn;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleRbtn;
    private javax.swing.JLabel mobLbl;
    private javax.swing.JTextField mobileFeild;
    private javax.swing.JComboBox monthBox;
    private javax.swing.JTextField nameFeild;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTextField pMobileFeild;
    private javax.swing.JLabel pMobileLbl;
    private javax.swing.JPasswordField passFeild;
    private javax.swing.JLabel passLbl;
    private javax.swing.JComboBox semBox;
    private javax.swing.JLabel semLbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox yearBox;
    // End of variables declaration//GEN-END:variables
}
