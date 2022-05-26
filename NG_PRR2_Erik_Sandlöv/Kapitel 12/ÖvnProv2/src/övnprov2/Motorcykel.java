/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov2;

/**
 *
 * @author ERIK
 */
public class Motorcykel extends Motorfordon {

    private int topphastighet;

    public Motorcykel(int topphastighet, int motorstyrka, int antalDörrar, int antalPassagerare, String färg, int vikt, int antalHjul, int årsmodell, int märke) {
        super(motorstyrka, antalDörrar, antalPassagerare, färg, vikt, antalHjul, årsmodell, märke);
        this.topphastighet = topphastighet;
    }

    @Override
    public String körkortsKlass() {
        return "A";
    }

    @Override
    public boolean hjälmtvång() {
        return true;
    }

    @Override
    public String beskrivning() {
        return "Det är en motorcykel";
    }

}
