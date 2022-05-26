/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övningsprov.pkg2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Bilägare extends Person {

    List<Bil> bilar = new LinkedList<>();

    public Bilägare(String namn, String pNr) {
        super(namn, pNr);
    }

    public void köp(Bil b) {
        bilar.add(b);
    }

    public Bil sälj(String regnr) {

        for (Bil b : bilar) {
            if (b.getRegnr() == regnr) {

                bilar.remove(b);
                return b;

            }
        }
        return null;
    }

    public int totalVärdePåBilar() {
        int värde = 0;
        for (Bil b : bilar) {
            värde += b.getVärde();
        }
        return värde;
    }

    @Override
    public String toString() {
        String s = super.toString();

        if (!bilar.isEmpty()) {
            s += ", äger en ";
            for (Bil b : bilar) {
                s += b.toString() + "\t";
            }
        }
        return s;
    }

}
