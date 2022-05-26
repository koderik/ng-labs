/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Kvastbutik {

    private List<Sopkvast> Sopkvastar = new ArrayList<>();

    public Kvastbutik() {
    }

    public void laggTillKvast(Sopkvast k) {
        Sopkvastar.add(k);
    }

    public void taBortKvast(Sopkvast k) {
        Sopkvastar.remove(k);
    }

    @Override
    public String toString() {
        String s = "";
        for (Sopkvast k : Sopkvastar) {
            s += k.toString() + "\n";
        }
        return s;
    }

    

}
