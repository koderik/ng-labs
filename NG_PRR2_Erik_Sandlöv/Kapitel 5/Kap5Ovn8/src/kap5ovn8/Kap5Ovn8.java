/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5ovn8;

/**
 *
 * @author erik.sandlov
 */
public class Kap5Ovn8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Slumpord slumpis = new Slumpord("ord.txt");
        for (int i = 0; i < 100; i++) {
            System.out.println(slumpis.ettOrd()); //slumpar hundra ord

        }
    }

}
