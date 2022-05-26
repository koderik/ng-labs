/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4upg1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Fordonsägare extends Person {

    private List<Fordon> fordon = new LinkedList<>();

    public Fordonsägare(String namn, int kön) {
        super(namn, kön);
    }

    public void köpFordon(Fordon a) {
        this.fordon.add(a);
    }

    public void säljFordon(Fordon a) {
        this.fordon.remove(a);
    }

    /**
     *
     * @return returnerar Person klassens tostringmetod med ytterligare fakta
     * som antalet bilar
     */
    @Override
    public String toString() {
        String s = super.toString();
        if (!fordon.isEmpty()) {
            s += "även en ";
            for (Fordon a : fordon) {
                if (a instanceof Bil) {
                    s += ((Bil) a).toString() + "\n";
                }

            }
        }
        return s;
    }

}
