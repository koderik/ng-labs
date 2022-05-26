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
public class Företag extends Ägare implements Ting {

    String namn;
    Ägare owner;

    public Företag(String namn, Ägare owner) {
        this.namn = namn;
        this.owner = owner;
    }

    @Override
    public void setÄgare(Ägare a) {
        owner = a;
    }

    @Override
    public String toString() {
        return "Företag{" + "namn=" + namn + ", Owner=" + owner + super.toString();
    }

}
