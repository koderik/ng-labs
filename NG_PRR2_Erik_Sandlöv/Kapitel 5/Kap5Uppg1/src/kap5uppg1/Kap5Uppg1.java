/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5uppg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erik.sandlov
 */
public class Kap5Uppg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // TODO code application logic here
        OrdLista ordLista = new OrdLista();

        File filen = new File("text.txt"); //letar upp filen
        Scanner sc = new Scanner(filen); //skapar scanner
        while (sc.hasNext())  // arbetar medans det fortfarande finns något att scanna
        {
            String input = sc.nextLine();
            if (input.contains("substantiv")) // kontrollerar ifall det finns ett substantiv i meningen och tar då hela raden från 0 till ordet substantiv
            {
                ordLista.addOrd(new Ord(input.substring(0, input.indexOf("substantiv") - 1), Ord.SUBSTANTIV));

            }
            if (input.contains("verb")) //samma fast med verb
            {
                ordLista.addOrd(new Ord(input.substring(0, input.indexOf("verb") - 1), Ord.VERB));
            }

        }
        int meningsdelar = Integer.valueOf(JOptionPane.showInputDialog(null, "Hur många meningsdelar vill du ha?"));//frågar användaren efterhur många meningar den vill ha
        String output = "";

        for (int i = 0; i < meningsdelar; i++)//tar slumpade ord och stoppar ihop till en mening
        {
            output += ordLista.getRandomOrd(Ord.SUBSTANTIV) + " ";
            output += ordLista.getRandomOrd(Ord.VERB) + " ";
            output += ordLista.getRandomOrd(Ord.SUBSTANTIV) + " och ";
        }
        output += "så var det med den saken.";
        PrintWriter utFil = new PrintWriter(new BufferedWriter(new FileWriter("minmening.txt"))); // skapar en fil
        utFil.println(output); //skriver till filen
        utFil.close(); //stänger

    }

}
