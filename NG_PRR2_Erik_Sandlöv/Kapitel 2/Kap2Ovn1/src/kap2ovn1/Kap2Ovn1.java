/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2ovn1;

/**
 *
 * @author erik.sandlov
 */
public class Kap2Ovn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test
        Räknare Räknare1 = new Räknare(5, 7);
        Räknare Räknare2 = new Räknare(2, 6);
        for (int i = 0; i < 3; i++) {
            Räknare1.add();
            System.out.println("Räknare 1:" + Räknare1.getCounter());
            Räknare2.add();
            System.out.println("Räknare 2:" + Räknare2.getCounter());

        }
        for (int i = 0; i < 3; i++) {
            Räknare1.remove();
            System.out.println("Räknare 1:" + Räknare1.getCounter());
            Räknare2.remove();
            System.out.println("Räknare 2:" + Räknare2.getCounter());

        }

    }

}
