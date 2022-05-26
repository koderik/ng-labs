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
public class Rektangel extends Figur {

    private int height, base;

    public Rektangel(int height, int base, Punkt startPunkt) {
        super(startPunkt);
        this.height = height;
        this.base = base;
    }

    @Override
    public int Area() {
        return (int) (base * height);
    }

    @Override
    public String toString() {
        return "Rektangel" + super.startPunkt.toString() + " a:" + this.Area();
    }
}
