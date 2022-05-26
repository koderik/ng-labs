/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokap5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author hrli
 */
public class Demokap5ex2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("addera.txt"));
            double sum = 0;
            sc.useDelimiter("[\\+]");
            while (sc.hasNextDouble()) {
                double tmp = sc.nextDouble(); 
                System.out.println("tmp =  " + tmp);
                sum += tmp;
            }
            System.out.println("sum = " + sum);
        } catch (FileNotFoundException ex) {
            System.out.println("hittar inte filen");
        }

    }

}
