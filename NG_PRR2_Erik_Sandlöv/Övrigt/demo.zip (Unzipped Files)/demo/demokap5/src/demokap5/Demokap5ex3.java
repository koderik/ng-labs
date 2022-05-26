/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokap5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hrli
 */
public class Demokap5ex3 {

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            BufferedReader inFil = new BufferedReader(new FileReader("fil.txt"));
            String s;
            
            PrintWriter utFil = new PrintWriter(new BufferedWriter(new FileWriter("utfil.txt")));
            
            
            s = inFil.readLine();

            while (s != null) {
                System.out.println(s);
                 utFil.println(s);
                s = inFil.readLine();
            }
            utFil.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Kan ej hitta fil");
        } catch (IOException e) {
            System.out.println("går ej att läsa rad");
        }

    }
}
