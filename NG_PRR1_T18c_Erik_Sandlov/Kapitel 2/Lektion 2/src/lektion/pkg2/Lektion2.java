/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektion.pkg2;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Lektion2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2.4 Getto medelvärde och summa uträknare
        double number1;
        double number2;
        double number3; //Definerar 3 tal
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv ett tal");
        number1 = input.nextInt();
        System.out.println("Skriv ett till tal");
        number2 = input.nextInt();
        System.out.println("Skriv ett tilllllll tal"); //Ber användaren tilldela talen
        number3 = input.nextInt();
        double summa = (number1+number2+number3); //Skapar en variabel som är summan av de tre talen
        double avg = summa/3; //Räknar ut medelvärdena för talen genom att dela summan på 3 eftersom det är tre tal
        System.out.println("Summan blir typ " + summa);
        System.out.println("Medelvärdet är öööööö " + avg); //Visar vad resultaten blev
        
    
    }
    
}
