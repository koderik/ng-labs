/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4ovn1;

/**
 *
 * @author erik.sandlov
 */
public class Kap4Ovn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // testar klasserna lite så de funkar
        Bilägare a = new Bilägare("Conny");
        Bil mercedes = new Bil("BER881", "Mercedes E430");
        System.out.println(a.toString());
        System.out.println(mercedes.toString());
        a.buyCar(mercedes);
        System.out.println(a.toString());
        System.out.println(mercedes.toString());
        a.sellCar();
        System.out.println(a.toString());
    }

}
