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
public class Personbil extends Motorfordon {

    private int lastVolym;

    public Personbil(int lastVolym, int motorstyrka, int antalDörrar, int antalPassagerare, String färg, int vikt, int antalHjul, int årsmodell, int märke) {
        super(motorstyrka, antalDörrar, antalPassagerare, färg, vikt, antalHjul, årsmodell, märke);
        this.lastVolym = lastVolym;
    }

    @Override
    public String körkortsKlass() {
        return "B";
    }

    @Override
    public boolean hjälmtvång() {
        return false;
    }

    @Override
    public String beskrivning() {
        return "Det är en personbil";
    }

}
