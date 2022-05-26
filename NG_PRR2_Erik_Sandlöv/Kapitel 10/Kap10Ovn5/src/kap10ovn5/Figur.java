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
public abstract class Figur {

    Punkt startPunkt;

    public Figur(Punkt startPunkt) {
        this.startPunkt = startPunkt;
    }

    public abstract int Area();

    public abstract String toString();
}
