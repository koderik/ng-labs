/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4ovn2;

/**
 *
 * @author erik.sandlov
 */
public class Fordon {
   private int speed, weight;

    public Fordon(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    
    public void changeSpeed(int newSpeed){
        speed=newSpeed;
    }

    @Override
    public String toString() {
        return "Fordon{" + "Speed=" + speed + ", Weight=" + weight + '}';
    }
   
}
