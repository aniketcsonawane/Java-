package SendAlert;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JProgressBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class msgsend {

    JFrame frmSendingMessage;
    JProgressBar progressBar;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    msgsend window = new msgsend();
                    window.frmSendingMessage.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public msgsend() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmSendingMessage = new JFrame();
        frmSendingMessage.setTitle("Sending Message");
        frmSendingMessage.setBounds(100, 100, 493, 301);
        //frmSendingMessage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmSendingMessage.getContentPane().setLayout(null);
        frmSendingMessage.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(msgsend.class.getResource("/SendAlert/sendsms.png")));
        label.setBounds(69, 43, 80, 68);
        frmSendingMessage.getContentPane().add(label);

        JLabel lblSendAlert = new JLabel("Send Alert");
        lblSendAlert.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblSendAlert.setBounds(198, 37, 116, 87);
        frmSendingMessage.getContentPane().add(lblSendAlert);

        JButton btnSend = new JButton("Send");
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new Thread() {
                    public void run() {
                        progressBar.setValue(10);
                        try {
                            String dept = (String) SendAlertFrame.jComboBox5.getSelectedItem();
                            String sub = (String) SendAlertFrame.jComboBox10.getSelectedItem();
                            String sem = (String) SendAlertFrame.jComboBox4.getSelectedItem();
                            String cri = SendAlertFrame.jTextField1.getText();
                            int per = (SendAlertFrame.rowcount * 100) / SendAlertFrame.rowcount;
                            int flag = 0;
                            for (int i = 0; i < SendAlertFrame.rowcount; i++) {

                                String name = (String) SendAlertFrame.jTable1.getValueAt(i, 3);
                                System.out.println("name is " + name);

                                Feachstudentparentnumber fsp = new Feachstudentparentnumber();
                                ArrayList std = fsp.GetAllInfo(name);

                                String smob = (String) std.get(0);
                                String pmob = (String) std.get(1);
                                System.out.println(dept + " " + sem + " " + sub + " " + SendAlertFrame.fdate + " " + SendAlertFrame.tdate + " " + name + " " + smob + " " + pmob);
                                String mobile = pmob;
                                String sms = "Dear parent your pal " + name + "'s attendace is less than " + cri + " % so please be punctual.";
                                flag = 0;
                                try {
                                    new sendSMS().sendText(sms, mobile);
                                    flag = 1;
                                } catch (Exception e) {
                                    flag = 0;
                                }
                                if (flag == 1) {
                                    progressBar.setValue((i * 100) / per);
                                } else {
                                    progressBar.setValue(((i * 100) / per) - progressBar.getValue());
                                }
                            }
                            //  progressBar.setValue(100);
                        } catch (Exception e) {
                            progressBar.setValue(0);
                            JOptionPane.showMessageDialog(null, "Failed to Send Message" + e);
                        }
                    }
                }.start();
            }
        });
        btnSend.setBounds(184, 165, 89, 23);
        frmSendingMessage.getContentPane().add(btnSend);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setBounds(69, 215, 325, 14);
        frmSendingMessage.getContentPane().add(progressBar);
    }

}
