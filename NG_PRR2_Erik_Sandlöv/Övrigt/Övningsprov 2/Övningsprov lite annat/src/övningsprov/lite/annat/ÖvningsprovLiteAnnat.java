/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övningsprov.lite.annat;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class ÖvningsprovLiteAnnat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Kapital");
        int kapital = sc.nextInt();
        System.out.println("Ränta");
        double ränta = (sc.nextDouble() / 100) + 1;
        int value = kapital;
        for (int i = 0; i < 10; i++) {
            value *= ränta;
            System.out.println("År " + i + 1 + ": " + value);
        }

    }

}
