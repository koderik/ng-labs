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
public class Flerfamiljshus extends Fastighet {

    private int antalLagenheter;

    public Flerfamiljshus(int antalLagenheter, String adress) {
        super(adress);
        this.antalLagenheter = antalLagenheter;
    }

    public int getAntalLagenheter() {
        return antalLagenheter;
    }

    public void setAntalLagenheter(int antalLagenheter) {
        this.antalLagenheter = antalLagenheter;
    }

    /**
     *
     * @return returnerar superklassens tostring plus lite tillägsinformation
     */
    @Override
    public String toString() {
        return super.toString() + " med " + antalLagenheter + " lägenheter";
    }

}
