/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminManagment;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        MainLoginFrame mainFrame = new MainLoginFrame();
        mainFrame.setVisible(true);       
        mainFrame.setSize(d);
    }
    
}
