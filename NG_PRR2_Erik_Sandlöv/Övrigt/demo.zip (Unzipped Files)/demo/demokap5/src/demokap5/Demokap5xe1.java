/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokap5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hrli
 */
public class Demokap5xe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            BufferedReader inFil = new BufferedReader(new FileReader("fil.txt"));
            String s;
            
            s = inFil.readLine();

            while (s != null) {
                System.out.println(s);
                s = inFil.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Kan ej hitta fil");
        } catch (IOException e) {
            System.out.println("går ej att läsa rad");
        }

    }

}
