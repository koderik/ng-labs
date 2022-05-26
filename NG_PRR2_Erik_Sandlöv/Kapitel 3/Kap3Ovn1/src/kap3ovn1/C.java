/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3ovn1;

/**
 *
 * @author erik.sandlov
 */
public class C {
    private static int totAntal;
    
    private int number;
    
    public C(int number){
        this.number = number;
        totAntal++;
    }
    public static int getAntal(){
        return totAntal;
    }
}
