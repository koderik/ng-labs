/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4ovn2;

/**
 *
 * @author erik.sandlov
 */
public class Kap4Ovn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Train tåget = new Train(25, 10000);
        for (int i = 0; i < 10; i++) {
            System.out.println(tåget.toString());
            tåget.addCar();
            tåget.changeSpeed(i);
        }
    }

}
