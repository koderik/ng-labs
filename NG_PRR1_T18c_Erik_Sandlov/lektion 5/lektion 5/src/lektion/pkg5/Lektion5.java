/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektion.pkg5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Lektion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //u.4.3
        /*
        System.out.println(56789*100/100);
        System.out.println(56789/100*100);
        System.out.println((56789+50)/100*100);
        System.out.println((56789+500)/1000*1000); //Den gör operationerna i parantes sedan vänster till höger
        System.out.println((int)(234.56+0.5)); //Den klipper av 235.06 vid heltalet
        */
        //u4.4
        /*
        System.out.println("skriv in tal");
        Scanner scan = new Scanner(System.in);
        int tusental = scan.nextInt();
        double dec = (double)tusental/1000;
        dec += 0.5;
        int tusentalNy = (int)dec*1000;
        System.out.println(tusentalNy);
        */
        
        //u4.5
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in täljare och nämnare: ");
        int top = scan.nextInt();
        int bot = scan.nextInt();
        int hel = top/bot;
        int bråk = top%bot;
        System.out.println("Talet "+top+"/"+bot+" blir i blandad form: "+hel+" "+bråk+"/"+bot);
        */
        //u4.6
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv antal timmar");
        int timmar = scan.nextInt();
        System.out.println("Skriv antal minuter");
        int minuter = scan.nextInt();
        System.out.println("Skriv antal sekunder");
        int sekunder = scan.nextInt();
        int timmarSek = timmar*3600;
        int minuterSek = minuter*60;
        int sekundpott= sekunder+minuterSek+timmarSek;
        double timmarTot = (double)sekundpott/3600;
        double minuterTot = (double)sekundpott/60;
        System.out.println("I bara timmar blir det: "+timmarTot);
        System.out.println("I bara minuter blir det: "+minuterTot);
        System.out.println("I bara sekunder blir det: "+sekundpott);
*/
        //u4.7
        /*
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Skriv in antal sekunder");
        int sekundpott = scan.nextInt();
        int timmar = sekundpott/3600;
        int minut = (sekundpott-(timmar*3600))/60;
        int sekund = (sekundpott-(timmar*3600)-(minut*60))%60;
        System.out.println("Timmar: "+timmar);
        System.out.println("Minuter: "+minut);
        System.out.println("Sekunder: "+sekund);
    */
        
        

    }
}

        

        
