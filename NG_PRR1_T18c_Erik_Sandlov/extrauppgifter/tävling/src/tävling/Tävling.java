/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tävling;

import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Tävling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int antal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange sidlängden");
        int length = sc.nextInt();
        for (int i = 0; i <= length; i++) {
            antal+=Math.pow(i, 3);
        }
        System.out.println(antal);
    }
    
}

