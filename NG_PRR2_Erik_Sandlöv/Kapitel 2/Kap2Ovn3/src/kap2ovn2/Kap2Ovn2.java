/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2ovn2;

/**
 *
 * @author ERIK
 */
public class Kap2Ovn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kort[] kortlek = new Kort[52];
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                kortlek[counter] = new Kort(i, j);
                System.out.println(kortlek[counter].toString());
                counter++;
                
            }
        }
    }

}
