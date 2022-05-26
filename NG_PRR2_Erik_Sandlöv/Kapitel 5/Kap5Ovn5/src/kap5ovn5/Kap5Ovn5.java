/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5ovn5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik.sandlov
 */
public class Kap5Ovn5 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        try {
            double tempMax = Double.MIN_VALUE;
            double tempSum = 0;
            int counter = 0;

            Scanner sc = new Scanner(new File("temp.txt"));

            while (sc.hasNextDouble()) { //skannar alla temperaturer och lägger in dem i totalsumman, samt jämför för att hitta maxtemperaturen
                double temp = sc.nextDouble();
                if (temp > tempMax) {
                    tempMax = temp;
                }
                tempSum += temp;
                counter++;
            }
            System.out.println("Maxtemp: " + tempMax + ", Medeltemp: " + (tempSum / counter)); //matar ut resultatet
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kap5Ovn5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
