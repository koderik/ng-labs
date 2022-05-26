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
public class Person extends Ägare{
private String namn;
private String ålder;

    public Person(String namn, String ålder) {
        this.namn = namn;
        this.ålder = ålder;
    }

    @Override
    public String toString() {
        return "Person{" + "namn=" + namn + ", \u00e5lder=" + ålder +" "+ super.toString()+ '}';
    }

  

   
    
}
