/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        /* u.7.1
        System.out.println("Du kan åka rakt fram eller till höger, skriv in ditt val, svara på engelska");
        System.out.println("Skriv svaret på engelska pga att java suger");
        String rikt = scan.nextLine().toUpperCase();
        
        
       if(rikt.equals("LEFT")){
           System.out.println("Det går inte knasboll"); 
       }
       else if(rikt.equals("RIGHT")){
           System.out.println("Okej du svänger höger och kör ner i diket och bryter benet");
       }
       else if(rikt.equals("FORWARD")){
           System.out.println("Du cyklar rakt fram och stöter på en björn som äter upp dig");
       }
       else{
           System.out.println("Kom igen skriv på ENGELSKAAA");
       }*/

 /* u7.2
        System.out.println("Är du sammboende? Svara ja eller nej");
        String ans = scan.nextLine().toUpperCase();
        System.out.println("Ange avstånd till arbete i kilometer");
        double dist = scan.nextDouble();
        if (dist >= 50) {
            System.out.println("Ange antal år du ska arbeta");
            double time = scan.nextDouble();

            if (time >= 1 && ans.equals("NEJ")) {
                System.out.println("Du har rätt till skatteavdrag");
            } else if (time >= 3 && ans.equals("JA")) {
                System.out.println("Du har rätt till skatteavdrag");
            } else {
                System.out.println("Du har tyvärr inte rätt till skatteavdrag");
            }
        } else {
            System.out.println("Im gonna stop you right there det är kört");
        }
         */
 /* System.out.println("Läs in ett heltal");
         int h = scan.nextInt();
 
         if(h%3==0){
             System.out.println("Det är delbart med tre");
         }
         if(h%4==0){
             System.out.println("Det är delbart med fyra");
         }
         if(h%5==0){
             System.out.println("Det är delbart med fem");
         }
         else if(!(h%3==0 || h%4==0 || h%5==0)){
             System.out.println("hej");
         }*/
 /*//u7.3
        System.out.println("Skriv in et tal");
        int h = scan.nextInt();
        if(h<=0){
            System.out.println("Talet är negativt");
        }
        else
            System.out.println("Talet är positivt");
         */
 /*
        //u.7.4
        System.out.println("Välj transportmedel");
        System.out.println("Cykel, bil, buss eller train");
        String medel = scan.next().toLowerCase();
        switch(medel){
            case "cykel":
                System.out.println("Du cyklar, bra för miljön");
                break;
            case "bil":
                System.out.println("Du tar bilen, okej fett normalt");
                break;
            case "buss":
                System.out.println("Du tar bussen hoppas du inte somnar");
                break;
            case "train":
                System.out.println("Du tar tåget cho choo");
                break;
            default:
                System.out.println("Snälla skriv in något av alternativeeen");
        }*/
        //u7.5
        /*
        System.out.println("Skriv in ett tal");
        int tal1 = scan.nextInt();
        System.out.println("Välj + eller -");
        String tecken = scan.next();
        System.out.println("Skriv in talet du vill "+tal1+" "+tecken+" med");
        int tal2 = scan.nextInt();
        switch(tecken){
            case "+":
                System.out.println(tal1+"+"+tal2+"="+(tal1+tal2));
                break;
            case "-":
                System.out.println(tal1+"-"+tal2+"="+(tal1-tal2));
                break;
        }*/
 /*u7.6
        Random rand = new Random();
        int n = rand.nextInt(2);
        n += 1;

        System.out.println("Gissa det hemliga talet, antingen ett, två eller tre");

        int tal = scan.nextInt();
        if (tal != n) {
            System.out.println("Du gissade fel! Gissa igen");
            tal = scan.nextInt();
            if (tal != n) {
                System.out.println("Du gissade fel igen! Nu borde rätt svara vara uppenbart");
                tal = scan.nextInt();
                if (tal != n) {
                    System.out.println("Du är kass på den här leken, du förlorade");
                } else {
                    System.out.println("Du gissade rätt på sista försöket!");
                }
            } else {
                System.out.println("Du gissade rätt på andra försöket!");
            }
        } else {
            System.out.println("Du gissade rätt på första försöket");
        }*/
        /* //u7.7, 7.8
        int[] lon = {12, 5, 3, 8};

        System.out.println("Välj ett av följande alternativ");
        System.out.println("1. Presentera statistik");
        System.out.println("2. Mata in en ny uppgift");
        System.out.println("3. Mata in helt ny statistik");
        int val = scan.nextInt();

        switch (val) {
            case 1:
                break;
            case 2:
                System.out.println("Välj vilken uppgift du vill ändra");
                System.out.println("1. Minst 20000kr MAN");
                System.out.println("2. Mindre än 20000kr MAN");
                System.out.println("3. Minst 20000kr KVINNA");
                System.out.println("4. Mindre än 20000kr KVINNA");
                int val2 = scan.nextInt();
                switch (val2) {
                    case 1:
                        System.out.println("Mata in det nya värdet");
                        lon[0] = scan.nextInt();
                        break;
                    case 2:
                        System.out.println("Mata in det nya värdet");
                        lon[1] = scan.nextInt();
                        break;
                    case 3:
                        System.out.println("Mata in det nya värdet");
                        lon[2] = scan.nextInt();
                        break;
                    case 4:
                        System.out.println("Mata in det nya värdet");
                        lon[3] = scan.nextInt();
                        break;
                    default:
                        System.out.println("Du matade in något konstigt, så vi presenterar det ursprungliga statistiken istället :)");
                }
                break;
            case 3:
                System.out.println("Ange hur många män som tjänar minst 20 000kr");
                lon[0] = scan.nextInt();
                System.out.println("Ange hur många män som tjänar mindre än 20 000kr");
                lon[1] = scan.nextInt();
                System.out.println("Ange hur många kvinnor som tjänar minst 20 000kr");
                lon[2] = scan.nextInt();
                System.out.println("Ange hur många kvinnor som tjänar mindre än 20 000kr");
                lon[3] = scan.nextInt();
                break;
            default:
                System.out.println("Du matade in något konstigt, så vi presenterar det ursprungliga statistiken istället :)");

        }
        System.out.println("Kön");
        System.out.println("         Lön:        Man    Kvinna");
        System.out.println("Minst 20000kr:        " + lon[0] + "      " + lon[2]);
        System.out.println("Mindre än 20000kr:     " + lon[1] + "      " + lon[3]); */
        
        int jobb = 0;

        System.out.println("Utför denna enkät för att ta reda på om du kan söka en tjänst hos AB Diskriminering");
        System.out.println("Är du en man eller en kvinna?");
        System.out.println("1. Man");
        System.out.println("2. Kvinna");
        int valKon= scan.nextInt();
        if(valKon==1){
            jobb++;
            System.out.println("Noterat.");
        }
        else{
            System.out.println("Fel svar... AHEM jag menar noterat.");
        }
        System.out.println("Hur gammal är du");
        int valAge= scan.nextInt();
        if(valAge<30){
            jobb++;
            System.out.println("Noterat.");
        }
        
        else{
            System.out.println("Fel svar... AHEM jag menar noterat.");
             
        }
        if(jobb>=2){
            System.out.println("Grattis du kan söka jobb hos oss :D");
        }
        System.out.println("Hur många barn har du");
        
        int valBarn= scan.nextInt();
        if(valBarn==0){
            jobb++;
            System.out.println("Noterat.");
        }
        else{
            System.out.println("Fel svar... AHEM jag menar noterat.");
        }
         if(jobb>=2){
            System.out.println("Grattis du kan söka jobb hos oss :D");
        }
        else{
            System.out.println("Du är tyvärr inte behörig att arbeta här");
        }
        

    }
    
}
