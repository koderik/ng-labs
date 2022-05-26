/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn3;

/**
 *
 * @author ERIK
 */
public class Fordon implements Ting {

    Ägare owner = null;
    String modell;

    public Fordon(String modell) {
        this.modell = modell;
    }

    @Override
    public void setÄgare(Ägare a) {
        owner = a;
    }

    @Override
    public String toString() {
        return "Fordon{ modell=" + modell + '}';
    }

}
