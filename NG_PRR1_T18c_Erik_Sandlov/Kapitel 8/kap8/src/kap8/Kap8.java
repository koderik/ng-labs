/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Kap8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //u8.1
        /*
        for (int i = 3; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int i = 3;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = 3;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);*/
        //u8.3
        /*
        int[] lista = new int[5];
        for(int i = 0; i<=4; i++){
            lista[i]=i+1;
        }
        for (int j = 4; j >= 0; j--){
            System.out.print(lista[j]+" ");
        } 
         */
        //u8.3
        /*
        System.out.println("Hur många asterikser vill du ha?");
        Scanner scan = new Scanner(System.in);
        /* int benis = scan.nextInt();
        for(int i = 0; i<=benis-1; i++){
            System.out.print("*");
        }
        
        System.out.println("Välj antalet rader");
        int rad = scan.nextInt();
        System.out.println("Välj antalet kolumner");
        int kol = scan.nextInt();
        for (int i = 0; i<rad; i++){
            for(int j = 0; j<kol; j++){
            System.out.print("*");
        }
            System.out.println(" ");
        } */
        //u8.4
        /*
        int pass = 0;
        boolean on = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Välkommen till Passagerarkollen!");
        System.out.println("Vad vill du göra kaptenen?");
        System.out.println("1. Nollställ antalet passagerare");
        System.out.println("2. Öka antalet passagerare med 1");
        System.out.println("3. Minska antalet passagerare med 1");
        System.out.println("4. Skriv antalet passagerare");
        System.out.println("5. Avsluta programmet");
        do {
            int val = scan.nextInt();
            switch (val) {
                case 1:
                    pass = 0;
                    System.out.println("Nollställde antalet passagerare");
                    break;
                case 2:
                    pass++;
                    System.out.println("Adderade en passagerare");
                    break;
                case 3:
                    pass--;
                    System.out.println("Subtraherade en passagerare");
                    break;
                case 4:
                    System.out.println("Antalet passagerare ombord:" + pass);
                    break;
                case 5:
                    on = false;
                    break;
                default:
                    System.out.println("Skriv in ett giltigt alternativ");

            }
        } while (on == true);
        System.out.println("Program avslutat");*/
        //u8.5, u8.6
        /* .out.println("1+2+3+4+5+....+n");
        System.out.println("Mata in n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int svar = 1;

        for (int i = 1; i < n; i++) {
            System.out.print(i + "*");
            svar = svar * (i + 1);

        }
        System.out.println(n + "=" + svar); */
 /* Scanner scan = new Scanner(System.in);
        int start = 0;
        int antal = 20;
        boolean on = true;
        for (int n = start; n <= start + antal; n++) {
            System.out.println(n + "\t " + (char) n);
        }
         do{
             System.out.println("Skriv 1 för flera karaktärer eller 2 för att avsluta"); 
            int svar = scan.nextInt();
            switch (svar) {
                case 1:
                    start = start+antal;
                    for (int n = start; n <= start + antal; n++) {
                        System.out.println(n + "\t " + (char) n);
                    }
                    break;
                case 2:
                    System.out.println("Program avslutas");
                    on = false;
                    break;
                default:
                    System.out.println("Felaktig input");

            }

        }while (on);*/
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        boolean on = true;
        int[] money = new int[1000];
        int index = 0;
        int indexSpar = 0;
        int test = 0;
        
        do {
            System.out.println("1. Presentera ny statistik.");
            System.out.println("2. Mata in nya uppgifter.");
            System.out.println("3. Avsluta.");
            int svar = scan.nextInt();
            switch (svar) {
                case 2:
                    System.out.println("Skriv in första lönen");
                    index = 0;
                    do { 
                        test = scan.nextInt();
                        if(test>0){
                            money[index]=test;
                            index++;
                        }  
                    } while (test > 0);
                    if(index>indexSpar){
                        indexSpar=index;
                    }
                    break;
                case 1:
                    double sum = 0;
                    for (int j = 0; j < (indexSpar); j++) {
                        System.out.println("Anställd "+(j+1)+": \t"+money[j]+"kr");
                        sum=sum+money[j];
                        
                    }
                    System.out.println("Medellönen är: "+df.format(sum/(indexSpar))+"kr");
                    break;
                case 3:
                    on=false;
                    break;
                    

            }

        } while (on);

    }

}
