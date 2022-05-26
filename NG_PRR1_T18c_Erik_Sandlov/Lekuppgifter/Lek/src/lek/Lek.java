/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lek;

import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Lek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int pizzaAntal;
        int pizzaÄtare;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hur många dammar pizza?");
        pizzaÄtare = input.nextInt();
        System.out.println("Hur många pizzaslajsar finns det?");
        pizzaAntal = input.nextInt();
        int pizzaÖver = (pizzaAntal % pizzaÄtare);
        System.out.println("Om alla bröder ska damma lika blir det " + pizzaÖver + " över");
        
        
    }
    
}
