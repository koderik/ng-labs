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
public abstract class Motorfordon extends Fordon{
    private int motorstyrka, antalDörrar, antalPassagerare;
    private String färg;

    public Motorfordon(int motorstyrka, int antalDörrar, int antalPassagerare, String färg, int vikt, int antalHjul, int årsmodell, int märke) {
        super(vikt, antalHjul, årsmodell, märke);
        this.motorstyrka = motorstyrka;
        this.antalDörrar = antalDörrar;
        this.antalPassagerare = antalPassagerare;
        this.färg = färg;
    }

    
    
    public abstract String körkortsKlass();
}
