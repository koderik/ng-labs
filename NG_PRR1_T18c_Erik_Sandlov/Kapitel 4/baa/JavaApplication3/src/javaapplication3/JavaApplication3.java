/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //u.4.2
        /*
        System.out.println("Skriv in hur många månader det var sen du slutade röka");
        int inputMån = scan.nextInt();
        int antalÅr = inputMån/12;
        int antalMån = inputMån%12;
        System.out.println("Du har inte rök på "+antalÅr+" år och "+antalMån+" månader, grattis!");
     */
        //u4.3
        /*
        int produkt = 4;
        int tal = 5;
        produkt += tal;
        System.out.println("produkt = "+ produkt);
        */
        //u4.4
        /*
        System.out.println("Vi ska nu demonstrera skillnaden mellan --tal och tal--, var god skriv in ett tal");
        int tal = scan.nextInt();
        int spar = tal;
        System.out.println("Okej, -- subtraherar då en etta till talet du angivit skillnaden är bara när det görs");
        System.out.println("Använder man tal-- så blir svaret "+(tal--)+" eftersom operationen sker efter utskriften");   
        System.out.println("Använder man --tal så blir svaret "+(--spar)+" eftersom operationen sker före utskriften");
        */
        //u4.5
        /*
        int tal1 = 5+ 6%4;
        int tal2 = (5+6)%4;
        double tal3 = 5;
        tal3 *= 2.5 + 1;
        System.out.println("Tal1="+tal1+" Tal2="+tal2+" Tal3="+tal3);
        */
        //u4.2
        System.out.println("skriv ett tal");
        int tal = scan.nextInt();
        int spar = tal;
        System.out.println("Addera 1 = "+(++tal));
        tal *= 2;
        System.out.println("Multiplicera med 2 = " +tal);
        tal -=6;
        System.out.println("Subtrahera 6 = "+tal);
        tal /= 2;
        System.out.println("Halvera = "+tal);
        tal += 3;
        System.out.println("Addera 3 = "+tal);
        tal -= spar;
        System.out.println("Ta bort ditt ursprungliga tal, du har nu fått 1! = "+tal);
        
}

    
}
