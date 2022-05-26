/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import javax.swing.JOptionPane;

/**
 *
 * @author hrli
 */
public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namn = JOptionPane.showInputDialog("Vad heter du?");
        JOptionPane.showMessageDialog(null, "Hej " + namn);
        
        String tal = JOptionPane.showInputDialog("Ange ett heltal");
        int t1 = Integer.valueOf(tal);
        JOptionPane.showMessageDialog(null, "Du skrev in heltalet " + t1);
        
        
    }
    
}
