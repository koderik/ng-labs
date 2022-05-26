/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov2;

import java.util.ArrayList;

/**
 *
 * @author ERIK
 */
public class Fordonsägare extends Person {

    private ArrayList<Fordon> fordonList;

    public Fordonsägare(String namn, int pnr) throws KennyException {
        super(namn, pnr);
    }

    public void addFordon(Fordon f) {
        if (fordonList == null) {
            fordonList = new ArrayList<>();
        }
        fordonList.add(f);
    }

    public void removeFordon(Fordon f) {
        if (fordonList != null) {
            fordonList.remove(f);
        }
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        if (fordonList != null) {
            for (Fordon f : fordonList) {
                s += f.beskrivning() + "\n";
            }
        }

        return s;
    }
    public void lagraAlla() {
        
        if (fordonList != null) {
            for (Fordon f : fordonList) {
                f.Lagra();
            }
        }

        
    }

    public String skrivUtAllaFordon() {
        String s = "";
        if (fordonList != null) {
            for (Fordon f : fordonList) {
                s += f.beskrivning() + " ";
                if (f instanceof Motorfordon) {
                    s += ((Motorfordon) f).körkortsKlass();
                }
                s += "\n";
            }
        }

        return s;
    }

}
