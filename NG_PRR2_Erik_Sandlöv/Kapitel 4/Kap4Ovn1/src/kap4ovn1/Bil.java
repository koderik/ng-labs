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
public class Bil {
    private String plate, desc;
    private Bilägare owner; // privata instansvariabler
/**
 * 
 * @param plate tar in regnr
 * @param desc tar in bilbeskrivning
 */
    public Bil(String plate, String desc) {
        this.plate = plate;
        this.desc = desc;
        owner=null;
    }
    /**
     * 
     * @param b sätter bilens ägare till b
     */
    public void setOwner(Bilägare b){
        owner=b;
        
    }
/**
 * 
 * @return  returnerar fakta om bilen
 */
    @Override
    public String toString() {
         
        if (owner==null) {
            return desc + " "+ plate;
        }
        else{
            return desc + " "+ plate+ " ägs av "+owner.getName();
        }
    }
    
}
