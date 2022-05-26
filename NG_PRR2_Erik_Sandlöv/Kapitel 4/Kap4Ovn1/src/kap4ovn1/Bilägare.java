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
public class Bilägare extends Person {

    private Bil car; // privata instansvariabel
/**
 * 
 * @param name tar in namnet
 */
    public Bilägare(String name) {
        super(name);
        this.car = null;
    }
/**
 * 
 * @param b tar in bil för bilägare att köpa
 */
    public void buyCar(Bil b) {
        car = b;
        car.setOwner(this);
    }
/**
 * "Säljer bilen" dvs sätter bil till null
 */
    public void sellCar() {

        car.setOwner(null);
        car = null;
    }
/**
 * 
 * @return returnerar läsbar fakta om bilägaren i testsyfte
 */
    @Override
    public String toString() {
        if (car==null) {
            return super.toString()+" äger ingen bil";
        }
        else{
            return super.toString()+" äger bilen: "+car.toString();
        }
        
    }

    

}
