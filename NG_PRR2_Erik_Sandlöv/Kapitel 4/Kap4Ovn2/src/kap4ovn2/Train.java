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
public class Train extends Fordon{
    private int carCount;

    public Train(int speed, int weight) {
        super(speed, weight);
        carCount=0;
    }
    public void addCar(){
        carCount++;
    }

    @Override
    public String toString() {
        return super.toString()+"{" + "carCount=" + carCount + '}';
    }
    
}
