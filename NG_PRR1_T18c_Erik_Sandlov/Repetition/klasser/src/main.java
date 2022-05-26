
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik.sandlov
 */


public class main {
    static person[] p = new person[10];
    static int pCount = 0;

    public static void main(String[] args) {
        boolean on = true;
        Scanner s = new Scanner(System.in);
                while(on){
            int val = s.nextInt();
            switch(val){
                case 1:
                    newPerson();
            }
        }
    }
    private static void newPerson(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv in personens namn");
        String namn = s.nextLine();
        System.out.println("Skriv in personens ålder");
        int ålder = s.nextInt();
        p[pCount]= new person(namn, ålder);
        
    }
}
