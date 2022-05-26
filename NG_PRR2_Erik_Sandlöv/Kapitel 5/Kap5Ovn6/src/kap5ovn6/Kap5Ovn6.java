/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5ovn6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik.sandlov
 */
public class Kap5Ovn6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        PrintWriter utFil;
        try {
            utFil = new PrintWriter(new BufferedWriter(new FileWriter("fil.txt"))); //skapar en filskrivare
            Scanner sc = new Scanner(new File("indata.txt")); // skapar en scanner och hittar en fil att skanna från
            while (sc.hasNext()) {
                String test = "";
                test = sc.nextLine();
                test += "\n" + sc.nextLine(); // scannar den första och andra raden som en string
                System.out.println(test);
                int testInt = Integer.valueOf(test.substring(test.indexOf("Längd: ") + 7, test.indexOf("cm"))); // hämtar ut längden
                
                if (testInt >= 200) {
                     //jämför längden och skriver in de som har längd över 200 i en ny fil
                    utFil.println(test);

                }

            }
            utFil.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kap5Ovn6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
