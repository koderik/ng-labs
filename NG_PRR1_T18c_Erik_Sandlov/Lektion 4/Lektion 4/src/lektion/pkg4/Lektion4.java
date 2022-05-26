/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lektion.pkg4;

import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Lektion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        //u test
        System.out.println("skriv in tal");
        double tal = scan.nextDouble();
        int avrund = (int)(tal+0.5);
        System.out.println("Avrundat blir det: "+avrund);
        
        //u2.6
        //System.out.println("Hur mycket pengar behöver du");
        //int deg = scan.nextInt();
        //double antalH = deg/100.0;
        //ntalH = antalH+0.999;
        //int hundringar = (int)antalH;
        //int pengar = hundringar*100;
       
        //System.out.println("Du tog ut "+pengar+" kronor");
        
        //u3.1 
        //int[] tal = new int[4];
        //System.out.println("skriv in 4 heltal");
        //tal[0] = scan.nextInt();
        //System.out.println("tack");
        //tal[1] = scan.nextInt();
        //System.out.println("tack");
        //tal[2] = scan.nextInt();
        //System.out.println("tack");
        //tal[3] = scan.nextInt();
        //System.out.println("dina tal var "+tal[0]+", "+tal[1]+", "+tal[2]+", "+tal[3]);
        
        //u3.3
        /*
        int[] tal = new int[3];
        System.out.println("skriv in 3 heltal");
        tal[0] = scan.nextInt();
        tal[1] = scan.nextInt();
        tal[2] = scan.nextInt();
        System.out.println(""+tal[2]+""+tal[1]+""+tal[0]);
        */
        /*u3.1
        double[] decimal = new double[3];
        System.out.println("skriv 3 tal");
        decimal[0] = scan.nextDouble();
        decimal[1] = scan.nextDouble();
        decimal[2] = scan.nextDouble();
        double sum = decimal[0]+decimal[1]+decimal[2];
        System.out.println("Summa: "+sum);
        double avg = sum/3;
        System.out.println("Medelvärde: "+avg);
        */
        
        /* u3.2
        int[] decimal = new int[4];
        System.out.println("skriv 4 tal");
        decimal[0] = scan.nextInt();
        decimal[1] = scan.nextInt();
        decimal[2] = scan.nextInt();
        decimal[3] = scan.nextInt();
        int talEtt = decimal[0];
        int talTvå = decimal[1];
        int talTre = decimal[2];
        int talFyr = decimal[3];
        decimal[0] = talFyr;
        decimal[1] = talTre;       
        decimal[2] = talTvå;
        decimal[3] = talEtt;
        System.out.println("Ordningen flippas och blir "+decimal[0]+", "+decimal[1]+", "+decimal[2]+", "+decimal[3]);
        */
        
                
                
      
        
        
        
    }
    
}
