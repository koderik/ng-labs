/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektion2;

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
        Scanner scan = new Scanner(System.in);
        
        //u2.1
        
        //System.out.println("Skriv triangelns bas");
        //double basTriangel = scan.nextDouble();
        //System.out.println("Skriv triangelns höjd");
        //double höjdTriangel = scan.nextDouble();
        //double areaTriangel = (basTriangel*höjdTriangel)*0.5;
        //System.out.println("Arean på triangeln är "+areaTriangel);
        
        //u2.2
        //System.out.println("Skriv ett svenskt ord");
        //String svensktOrd = scan.next();
        //System.out.println(svensktOrd + ", fint ord! Vad är det på engelska då?");
        //String engelsktOrd = scan.next();
        //System.out.println(svensktOrd +" är alltså "+ engelsktOrd + " på engelska, coolt!");
        
        //u2.3
        //System.out.println("Skriv ett ord i singular");
        //String ord = scan.next();
        //System.out.println(ord + ", fint ord! Vad är pluraländelsen?");
        //String plural = scan.next();
        //System.out.println("En " +ord+" flera "+ord+plural+"!");
        
        //u2.4
        //System.out.println("Skriv in ett tal o kolla vilket tecken det motsvarar :D");
        //int kod = scan.nextInt();
        //char tecken = (char)kod;
        //System.out.println("Koden blir i unicode "+tecken);
        
        //2.5
        System.out.println("Skriv in ett tal du vill avrunda");
        double tal = scan.nextDouble();
        double tal2 = tal+0.5;
        int avrund = ((int) tal2);
        System.out.println(avrund);
    }
    
}
