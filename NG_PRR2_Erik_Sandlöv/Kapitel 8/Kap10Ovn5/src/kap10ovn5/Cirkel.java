/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn5;

/**
 *
 * @author erik.sandlov
 */
public class Cirkel extends Figur {

    private int radius;

    public Cirkel(int radius, Punkt startPunkt) {
        super(startPunkt);
        this.radius = radius;
    }

    @Override
    public int Area() {
        return (int) ((int) radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "Cirkel" + super.startPunkt.toString() + " a:" + this.Area();
    }
}
