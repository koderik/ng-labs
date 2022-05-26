/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4upg1;

/**
 *
 * @author erik.sandlov
 */
public class Kap4Upg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        testkod för att göra ett par fastigheter och ett par bilar och för att visa dem

         */
        //Om någon är inne och läser detta så har jag gjort uppgiften men mycket försvann i google sync, väldigt störande men aja
        Fordonsägare testPerson = new Fordonsägare("Conny", Person.MAN);

        Bil testBil = new Bil("Mercedes C43 AMG", 1500);
        Bil testBil2 = new Bil("Ford Mustang GT", 1300);

        for (int i = 0; i < 4; i++) {
            testBil.addHjul(new Hjul(17));
            testBil2.addHjul(new Hjul(17));
        }
        testBil.setMotor(new Motor(325));
        testBil2.setMotor(new Motor(450));
        Flerfamiljshus testHus = new Flerfamiljshus(8, "Knegargatan 13");
        Flerfamiljshus testHus2 = new Flerfamiljshus(13, "Ghettovägen 2");
        testPerson.köpFastighet(testHus);
        testPerson.köpFastighet(testHus2);

        testPerson.buyCar(testBil);
        testPerson.buyCar(testBil2);
        System.out.println(testPerson.toString());
    }

}
