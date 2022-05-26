/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upg4kap2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author ERIK
 */
public class Upg4Kap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Skriver variabler på svenska så det blir mer läsbart, skriver oftast på engelska annars
        String personNummer;
        do {
                   personNummer = JOptionPane.showInputDialog("Skriv in ditt personummer, alla tolv siffror").replaceAll("-", "");
            if (personNummer.length()!=12) {
                JOptionPane.showMessageDialog(null, "Vänligen skriv in alla tolv siffror");
            }
        } while (personNummer.length()!=12);
        
        
        String personnummerFödelsedag = personNummer.substring(4, 8);
        int könSiffra = Integer.valueOf(personNummer.charAt(10));
        String idagFödelsedag = LocalDate.now().toString().replaceAll("-", "").substring(4);

        if (idagFödelsedag.equals(personnummerFödelsedag)) {
            JOptionPane.showMessageDialog(null, "Grattis");
        }
        if (könSiffra % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Du är en man");
        } else {
            JOptionPane.showMessageDialog(null, "Du är en kvinna");
        }

    }

}
