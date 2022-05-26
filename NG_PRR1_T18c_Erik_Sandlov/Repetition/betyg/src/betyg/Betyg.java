/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betyg;

import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Betyg {

    
    static Elev[] elev = new Elev[10];
    static int eCount = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        boolean on = true;
        while (true) {
            meny();
            switch (s.nextInt()) {
                case 1:
                    addElev();
                    break;
                case 2:
                    addKurs();
                    break;
                case 3:
                    setBetyg();
                    break;
                case 4:
                    ändraNamn();
                    break;
                case 5:
                    printAll();
            }
        }
    }

    public static void meny() {
        System.out.println("Meny");
        System.out.println("1. Lägg till elev");
        System.out.println("2. Lägg till kurs");
        System.out.println("3. Sätt betyg på kurs");
        System.out.println("4. Ändra namn på elev");
        System.out.println("5. Skriv ut alla elever");
    }

    public static void addElev() {
        Scanner s = new Scanner(System.in);
        System.out.println("Vad heter eleven?");
        String namn = (s.nextLine());
        System.out.println("Vilken klass går eleven i?");
        String klass = (s.nextLine());
        elev[eCount] = new Elev(namn, klass);
        eCount++;

    }
    public static int väljElev(){
        System.out.println("Välj elev");
        for (int i = 0; i < eCount; i++) {
            System.out.print((i+1)+". ");
            System.out.print(elev[i]);
            System.out.println("");
        }
        
        Scanner s = new Scanner(System.in);
        int tempElev = s.nextInt()-1;
        return tempElev;
    }
    public static void addKurs(){
        Scanner s = new Scanner(System.in);
        int tempElev=väljElev();
        System.out.println("Vad heter kursen?");
        String namn = s.nextLine();
        System.out.println("Hur många poäng är kursen?");
        int poäng = s.nextInt();
        elev[tempElev].addKurs(namn, poäng);
    }
    public static void setBetyg(){
        int tempElev=väljElev();
        System.out.println("Välj kurs");
        elev[tempElev].skrivKurs();
        
        Scanner s = new Scanner(System.in);
        int tempKurs = s.nextInt()-1;
        System.out.println("Vad vill du sätta betyget till?");
        
        elev[tempElev].setBetyg(tempKurs, s.next().charAt(0));
    }
    public static void ändraNamn(){
        Scanner s = new Scanner(System.in);
        int tempElev = väljElev();
        System.out.println("Vad ska eleven heta istället?");
        elev[tempElev].setNamn(s.nextLine());
    }
    public static void printAll(){
        for (int i = 0; i < eCount; i++) {
            System.out.print((i+1)+". ");
            System.out.println(elev[i]);
            
            elev[i].skrivKurs();

            System.out.println("");
        }
    }
}
