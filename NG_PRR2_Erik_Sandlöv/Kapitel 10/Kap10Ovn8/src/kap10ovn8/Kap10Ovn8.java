/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn8;

/**
 *
 * @author ERIK
 */
public class Kap10Ovn8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kortbunt k = new Kortbunt();
        System.out.println(k.toString());
        k.blanda();
        System.out.println(k.toString());
        k.sortera();
        System.out.println(k.toString());
    }

}
