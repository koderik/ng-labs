/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Recept {

    private String namn;
    private int tillagningstid;
    private List<Ingrediens> ingredienser = new ArrayList<>();

    public Recept(String namn, int tillagningstid) {
        this.namn = namn;
        this.tillagningstid = tillagningstid;
    }

    public void addIngrediens(Ingrediens i) {
        ingredienser.add(i);
    }

    public void removeIngrediens(Ingrediens i) {
        ingredienser.remove(i);
    }

    @Override
    public String toString() {
        String s = namn + ": Tillagningstid: " + tillagningstid + " minuter \n";
        for (Ingrediens e : ingredienser) {
            s += e.toString() + " \n";
        }
        return s;
    }

}
