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
public class Buss extends Motorfordon {

    private boolean toalett;

    public Buss(boolean toalett, int motorstyrka, int antalDörrar, int antalPassagerare, String färg, int vikt, int antalHjul, int årsmodell, int märke) {
        super(motorstyrka, antalDörrar, antalPassagerare, färg, vikt, antalHjul, årsmodell, märke);
        this.toalett = toalett;
    }

    @Override
    public String körkortsKlass() {
        return "D";
    }

    @Override
    public boolean hjälmtvång() {
        return false;
    }

    @Override
    public String beskrivning() {
        return "Det är en buss";
    }

}
