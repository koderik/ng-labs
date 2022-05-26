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
public class Hjul {
    private int storlek;

    public Hjul(int storlek) {
        this.storlek = storlek;
    }

    public int getStorlek() {
        return storlek;
    }

    public void setStorlek(int storlek) {
        this.storlek = storlek;
    }

    @Override
    public String toString() {
        return "Hjulsstorlek:"+storlek;
    }
    
}
