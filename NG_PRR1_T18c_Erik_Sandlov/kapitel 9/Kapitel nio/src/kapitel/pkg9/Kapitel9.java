/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel.pkg9;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Kapitel9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*u9.1
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Skriv in radien");
        int r = s.nextInt();
        System.out.println("Skriv in höjden");
        int h = s.nextInt();
        double volym = areaCalc(r, h);
        System.out.println(""+df.format(volym));
        
    }
    static double areaCalc(int r, int h){
        double ar = r*r*Math.PI*h;
        return ar;
    }
         */
 /*
            beskrivMetod();
    }
    static void beskrivMetod(){
        System.out.println("MEtoder e bra för man kan organisera koden");
        System.out.println("Öhhhhh man kan skriva koden o spara metoder till senare");
}
         */
 /*u9.3b System.out.println("Välj hur många stjärnor");
        Scanner scan = new Scanner(System.in);
        int lenght = scan.nextInt();
        ritaLine(lenght);
    }

    static void ritaLine(int lenght) {
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }*/
 /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal");
        char benis = tecken(scan.nextInt());
        System.out.println(benis);
    }

    static char tecken(double tal){
        if(tal<0)
            return '-';
        else 
            return '+';
    }
         */
 /*
        System.out.println("Skriv in ett tecken");
        Scanner scan = new Scanner(System.in);
        char tecken = (char)scan.next().charAt(0);
        if(siffra(tecken)){
            System.out.println("Det är en siffra");
        }
        else{
            System.out.println("Det är något annat än en siffra");
        }
    }
    
    /**
     * 
     * @param tecken Första (ända) tecknet i inputen
     * @return Sant ifall tecknet är en siffra annars falskt
         */
 /*
    static boolean siffra(char tecken){
      boolean test = Character.isDigit(tecken);
      return test;
    }*/
 /*
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv in en gemen");
        char tecken = s.next().charAt(0);
        System.out.println(versal(tecken));
    }
/**
 * 
 * @param tecken tar in ett tecken
 * @return gör om tecknet till en versal
         */
 /*
    static char versal(char tecken) {
        return Character.toUpperCase(tecken);
    }*/
 /*
 Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal");
        int number = scan.nextInt();
        if(!primTest(number)){
            System.out.println("Det är ett primtal");
        }
        else{
            System.out.println("Det är inte ett primtal");
        }
    }
    /**
     * 
     * @param number tar in en siffra
     * @return returnerar true ifall siffran är ett primtal annars false
         */
 /*
    static boolean primTest(int number){
        boolean test=false;
        for (int i = 2; i < number/2; i++) {
            if(number % i == 0){
                test = true;
                break;
                
            }
            
        }
        return test;*/
 /* System.out.println("Skriv in en bas och sedan en exponent");
        Scanner scan = new Scanner(System.in);
        int bas = scan.nextInt();
        int exp = scan.nextInt();
        System.out.println(potens(bas, exp));
    }
    /**
     * 
     * @param bas tar in basen
     * @param exp tar in exponenten
     * @return returnerar basen upphöjt med exponenten
         */
 /*static int potens(int bas, int exp) {
        int svar = 1;
        for (int i = 0; i < exp; i++) {
           svar=svar*bas;
        }
        return svar;}*/
       /* Scanner s = new Scanner(System.in);
        System.out.println("Skriv in ditt förnamn");
        String forNamn = s.nextLine();
        System.out.println("Skriv in ditt efternamn");
        String efterNamn = s.nextLine();
        System.out.println("Skriv in ditt telefonnummer");
        String telNummer = s.nextLine();
        System.out.println(personData(forNamn, efterNamn, telNummer));
    }*/
    /**
     * 
     * @param f tar in förnamnet
     * @param e tar in efternamnet
     * @param t tar in telefonnumret som en string
     * @return lägger ihop stringarna på ett tydligt sätt
     */
   /* static String personData (String f, String e, String t){
        return "Namn:"+f+" "+e+", Tel:"+t;*/
        
 /**
//  * Program som låter användaren skriva in tal för att sedan hitta skillnaden mellan det största och minsta talet
  */  
        
        int counter = 0;
        Scanner s = new Scanner(System.in); // Skapar en scanner för att läsa in siffror
        double [] numberList = new double[1000]; //Skapar stor lista så användaren inte riskerar att få slut på plats.
        System.out.println("Skriv in siffror och avsluta med en nolla");
        /**
         * Skapar en loop som överskriver listan med nya inmatningar
         */
         while(true){
            numberList[counter]=s.nextDouble();
            counter++;
            if(numberList[counter-1]==0){
                counter--;
                break;
            }
            
        }
        double bredd = calcVariationsbredd(numberList, (counter));
        System.out.println(bredd);
        
    }
    /**
     * Metod som räknar ut variationsbredden
     * @param numberList tar in lista med tal
     * @param counter tar in antalet platser i listan som använts
     * @return matar ut variationsbredden
     */
    static double calcVariationsbredd(double numberList[], int counter){
        double big = Double.NEGATIVE_INFINITY; //förbereder en temporär variabel för det största talet, sätter den till oändligt litet så nästa tal ska kunna ersätta det
        double small = Double.POSITIVE_INFINITY; // samma som ovanstående fast ett oändligt stort tal för den minsta variabeln
        
        for (int i = 0; i < counter; i++) {
            if (numberList[i]>=big) {
                big=numberList[i];
            }
            if (numberList[i]<=small){
                small=numberList[i];
            }
        }
        return big-small;
    }
}

