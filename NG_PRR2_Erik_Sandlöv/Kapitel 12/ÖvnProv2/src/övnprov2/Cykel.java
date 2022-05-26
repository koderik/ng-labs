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
public class Cykel extends Fordon {

    private int typ, antalVäxlar, aktuellVäxel;
    private final static int BMX = 0;
    private final static int RACER = 1;
    private final static int LANDSVÄG = 2;
    private final static int HYBRID = 3;

    public Cykel(int typ, int antalVäxlar, int vikt, int antalHjul, int årsmodell, int märke) {
        super(vikt, antalHjul, årsmodell, märke);
        this.typ = typ;
        this.antalVäxlar = antalVäxlar;
        this.aktuellVäxel = 1;
    }

    public void växla(boolean b) {
        if (b) {
            if (aktuellVäxel < antalVäxlar) {
                aktuellVäxel++;
            }
        }
        if (!b) {
            if (aktuellVäxel > 0) {
                aktuellVäxel--;
            }
        }
    }

    @Override
    public boolean hjälmtvång() {
        return true;
    }

    @Override
    public String beskrivning() {
        return "Det är en cykel";
    }

}
