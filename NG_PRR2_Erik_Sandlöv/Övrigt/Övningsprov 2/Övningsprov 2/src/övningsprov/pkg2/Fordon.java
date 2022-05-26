/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övningsprov.pkg2;

/**
 *
 * @author erik.sandlov
 */
class Fordon {

    private int vikt;
    private String regnr;
    public static int antalFordon = 0;

    public Fordon(int vikt, String regnr) {
        this.vikt = vikt;
        this.regnr = regnr;
        antalFordon++;
    }

    public String getRegnr() {
        return regnr;
    }

    public static int getAntalFordon() {
        return antalFordon;
    }

    @Override
    public String toString() {
        return regnr + ", vikt: " + vikt + "kg";
    }

}
