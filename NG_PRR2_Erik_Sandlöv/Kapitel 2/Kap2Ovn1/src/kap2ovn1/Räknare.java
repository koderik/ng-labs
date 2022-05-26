/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2ovn1;

import javax.swing.JOptionPane;

/**
 *
 * @author erik.sandlov
 */
public class Räknare {
    //instans variabler
    private int min, max, counter;
    //konstruktor
    public Räknare(int min, int max){
        counter=min;
        this.min = min;
        this.max = max;
        
        
    }
    public Räknare(int min){
        this(min, Integer.MAX_VALUE);
    }
    
    // övrig
    public void add(){
        if ((counter)<max) {
            counter++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Räknaren är vid max");
        }
        
    }
    public void remove(){
        if ((counter)>min) {
            counter--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Räknaren är vid sitt minsta");
        }
        
    }
    
    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Räknare{" + "min=" + min + ", max=" + max + ", counter=" + counter + '}';
    }
    
    
}
