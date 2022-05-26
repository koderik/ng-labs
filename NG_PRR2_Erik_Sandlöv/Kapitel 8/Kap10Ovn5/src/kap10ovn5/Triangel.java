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
public class Triangel extends Figur {

    public Triangel(int height, int base, Punkt startPunkt) {
        super(startPunkt);
        this.height = height;
        this.base = base;
    }

    private int height, base;

    @Override
    public int Area() {
        return (int) (base * height * 0.5);
    }

    @Override
    public String toString() {
        return "Triangel" + super.startPunkt.toString() + " a:" + this.Area();
    }

}
