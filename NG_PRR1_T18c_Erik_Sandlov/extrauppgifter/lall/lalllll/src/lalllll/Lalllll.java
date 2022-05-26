/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalllll;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Lalllll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#0.0");
        /*System.out.println("Skriv in farenheit");
        double far = scan.nextDouble();
        double cel = (double)((far-32)*5/9);
        DecimalFormat dec = new DecimalFormat("#.0");
        System.out.println(far+" grader farenheit motsvarar "+dec.format(cel)+" grader celsius");*/
        
        /*System.out.println("Skriv in hur många miles du kommer på en gallon :)");
        double miles = scan.nextDouble();
        double liter = (3.785)/(miles*0.1609);
        System.out.println(miles+" miles/gallon motsvarar "+dec.format(liter)+" liter/mil");*/
        
        /*System.out.println("Skriv in x1");
        double x1 = scan.nextDouble();
        System.out.println("Skriv in y1");
        double y1 = scan.nextDouble();
        System.out.println("Skriv in x2");
        double x2 = scan.nextDouble();
        System.out.println("Skriv in y2");
        double y2 = scan.nextDouble();
        double s = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        System.out.println(s);*/
        
        System.out.println("Skriv in efternamn, förnamn");
        String namn = scan.nextLine();
        int comma = namn.indexOf(",");
        System.out.println("Hej "+ namn.substring(namn.indexOf(",")+1,namn.length()).toUpperCase().trim());
        
    }
    
}
