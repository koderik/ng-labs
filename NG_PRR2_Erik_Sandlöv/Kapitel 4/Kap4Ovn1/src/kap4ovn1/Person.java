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
public class Person {
    private String name; // privat instansvariabel för namn
/**
 * 
 * @param name tar in personens namn
 */
    public Person(String name) {
        this.name = name;
    }
/**
 * 
 * @return returnerar namnet i en String
 */
    @Override
    public String toString() {
        return name;
    }
/**
 * 
 * @return returnerar variabeln namn
 */
    public String getName() {
        return name;
    }
    
}
