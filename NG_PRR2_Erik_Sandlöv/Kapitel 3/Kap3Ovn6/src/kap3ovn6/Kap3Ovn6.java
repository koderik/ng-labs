/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3ovn6;

/**
 *
 * @author erik.sandlov
 */
public class Kap3Ovn6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (double i = 0; i < 10; i+=(Math.PI/4)) {
            System.out.println("Sin "+i+" radians: "+C.sin(i));
        }
        
        
    }
    
}
