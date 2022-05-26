/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov2;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author ERIK
 */
public class ÖvnProv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("output.txt");
        file.delete();
        Fordon cykel = new Cykel(1, 1, 1, 1, 1, 1);
        Fordon mc = new Motorcykel(1, 1, 1, 1, "hej", 1, 1, 1, 1);
        try {
            Fordonsägare kenny = new Fordonsägare("kenny", 15);
            kenny.addFordon(mc);
            kenny.addFordon(cykel);
            System.out.println(kenny.skrivUtAllaFordon());
            kenny.lagraAlla();
        } catch (KennyException k) {
            JOptionPane.showMessageDialog(null, k.getMessage());
        }

    }

}
