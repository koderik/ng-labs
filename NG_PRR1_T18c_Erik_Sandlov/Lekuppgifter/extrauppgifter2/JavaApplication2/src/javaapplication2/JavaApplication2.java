/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Grattis! Skriv in hur mycket pengar du vunnit i kronor");
        Scanner s = new Scanner(System.in);
        double money = s.nextDouble();
        System.out.println("Skriv nu in hur mycket ränta du får på pengarna av banken i procentform utan procenttecknet");
        double interest = s.nextDouble();
        System.out.println("Skriv hur mycket du har i utgifter per månad i kronor");
        double expense = s.nextDouble();
        decimalFix(yearCalc(money, interest, expense), money, interest, expense);
        

    }
    /**
     * Metoden printar ut svaret som en fullständig mening utan decimaler
     * @param year tar in antalet år
     * @param money tar in vinstpengar
     * @param interest tar in räntesatsen
     * @param expense tar in månadsutgiften
     */
    public static void decimalFix(int year, double money, double interest, double expense){
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Du kan leva "+year+" år på vinsten "+df.format(money)+" kronor med räntan "+df.format(interest)+"% om dina månadsutgifter är "+df.format(expense)+" kronor");
    }
    /**
     *
     * @param money tar in vinstpengarna
     * @param interest tar in räntesatsen
     * @param expense tar in månadsutgifter
     * @return returnerar antalet år man kan leva på enbart ränta och
     * vinstpengar
     */
    public static int yearCalc(double money, double interest, double expense) {
        interest=interest * 0.01 + 1; //konverterar räntan till en faktor
        expense *= 12; //gör om månadskostnaden till en årskostnad 
        int year = 0; //bildar en räknare och sätter den till 0
        while (money >= 0) { //skapar en while loop som först multiplicerar money med räntefaktorn, sedan drar av årskostnaden. Ifall money då inte är större eller lika med noll så stängs loopen av eftersom pengarna är slut. Annars så lägger den till ett år på räknaren och gör om allt.
            money *= interest;
            money -= expense;
            if (!(money >= 0)) {
                break;
            } else {
                year++;
            }
        };
        return year; //när loopen är klar så returneras year som en int
    }
}
