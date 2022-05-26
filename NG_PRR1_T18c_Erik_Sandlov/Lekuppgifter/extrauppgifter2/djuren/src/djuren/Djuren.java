/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djuren;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Djuren {
static int pCount = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] p = new Person[10];
        
        Scanner s = new Scanner(System.in);
        while (true) {
            meny();
            switch (s.nextInt()) {
                case 1:
                    addPerson(p);
                    System.out.println(pCount);
                    break;
                case 2:
                    addDjur(p);
                    break;
            }
        }
    }

    public static void addPerson(Person[] p) {
        Scanner s = new Scanner(System.in);
        System.out.println("Namn?");
        String tempNamn = s.nextLine();
        System.out.println("Ålder?");
        int tempÅld = s.nextInt();
        p[pCount] = new Person(tempNamn, tempÅld);
        pCount++;
        
    }

    public static void addDjur(Person[] p) {
        Scanner s = new Scanner(System.in);

        System.out.println("Vilken person?");
        System.out.println(pCount);
        for (int i = 0; i < pCount; i++) {
            System.out.print(i+1+". ");
            System.out.println(p[i]);
        }
        System.out.println("");
        int val = s.nextInt()-1;
        s.nextLine();
        System.out.println("Djur namn?");
        String dNamn = s.nextLine();
        System.out.println("Djur sort?");
        String dSort = s.nextLine();
        System.out.println("Ålder?");
        int dÅlder = s.nextInt();
        
        p[val].addDjur(dNamn, dSort, dÅlder);
    }

    public static void meny() {
        System.out.println("1. Lägg till person");
        System.out.println("2. Lägg till djur");
        System.out.println("3. Ändra namn på person");
        System.out.println("4. Skriv ut alla personer");
    }
}
