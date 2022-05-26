/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap11ovn1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ERIK
 */
public class Kap11Ovn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Boolean on = true;
        System.out.println("Filnamn?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        do {
            try {
                öppnaFil(s);
                System.out.println("Du har öppnat filen " + s);
                on = false;
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage() + " Försök igen");
                System.out.println("Filnamn?");  
                s = sc.nextLine();
            }
        } while (on);

    }

    private static void öppnaFil(String s) throws FileNotFoundException {
        File aa = new File(s);
        Scanner sc = new Scanner(aa);
    }

}
