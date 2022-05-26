/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn3;

/**
 *
 * @author ERIK
 */
public class Kap10Ovn3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person a = new Person("Kenny", "15");
        Företag f = new Företag("Kennys bilar", a);
        System.out.println(a.toString());
        System.out.println(f.toString());
        Person b = new Person("Markus", "33");
        Fordon c = new Fordon("Mercedes");
        Fordon d = new Fordon("BMW");
        b.addObject(d);
        System.out.println(b.toString());
        f.addObject(c);
        System.out.println(f.toString());
    }
    
}
