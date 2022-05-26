/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrauppgifter2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Extrauppgifter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        /*DecimalFormat df = new DecimalFormat("0.#");
        System.out.println("Skriv in priset på varan");
        double pris = scan.nextDouble();
        System.out.println("Skriv in momssatsen");
        double moms = scan.nextDouble();
        System.out.println("Priset med moms inräknat blir: "+df.format(momspris(pris, moms))+"kr");*/
        /*boolean on=true;
        do{
            System.out.println("Skriv in ett tal du vill ta fram multiplikationstabellen på, skriv in noll för att avsluta programmet");
            int svar = scan.nextInt();
            if (svar==0){
               
               break;
            }
            else{
                tabell(svar);
            }
        }while(on);
        */
        System.out.println("Skriv in ett särskrivet ord");
        sarskriv(scan.nextLine());
    }
    /**
     * 
     * @param pris tar in priset på varan
     * @param moms tar in momssatsen
     * @return returnerar priset med moms inräknad
//     */
    /*
    static double momspris(double pris, double moms){
        moms=(moms/100)+1;
        return (pris*moms);
      
    
    }*/
    /*static void tabell(int tal){
        int multi[] = new int[10];
        for (int i = 1; i <= 10; i++) {
            multi[i-1]=tal*i;
            System.out.println(tal+"x"+i+"="+multi[i-1]);
        }
        
    }*/
    
}
