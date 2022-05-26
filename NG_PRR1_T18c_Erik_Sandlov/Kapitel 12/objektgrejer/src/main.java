
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

    static Bil[] bil = new Bil[5];

    public static void main(String[] args) {
        boolean on = true;

        Scanner s = new Scanner(System.in);
        int bilNum = 0;
        System.out.println("Välkommen till din bildatabas");
        while (on) {
            System.out.println("1: Lägg till en bil (MAX 5 BILAR)");
            System.out.println("2. Visa info om en av dina bilar");

            int meny = s.nextInt();
            switch (meny) {

                case 1:
                    if (bilNum > 5) {
                        System.out.println("Du har skrivit in maximalt antal bilar redan");
                        break;
                    }
                    addCar(bilNum);
                    bilNum++;
                    break;
                case 2:
                    System.out.println("Vilken bil vill du se info om?");
                    showCar((s.nextInt()) - 1);
            }
        }

    }

    private static void addCar(int num) {
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv in märket på din bil");
        String tempManu = s.nextLine();
        System.out.println("Skriv in modellen på din bil");
        String tempModel = s.nextLine();
        System.out.println("Skriv in tillverkningsåret på din bil");
        int tempYear = s.nextInt();

        bil[num] = new Bil(tempManu, tempModel, tempYear);

    }
    private static void showCar(int num){
        System.out.println("Märke = "+bil[num].getManu());
    }
}
