/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10uppg1;

/**
 *
 * @author ERIK
 */
public abstract class Idrott {
    private int antalSpelare, antalÅskådare;
    public static final int HÖG = 2, MEDEL=1, LÅG=0;
    

    public Idrott(int antalSpelare, int antalÅskådare) {
        this.antalSpelare = antalSpelare;
        this.antalÅskådare = antalÅskådare;
    }

    public int getAntalÅskådare() {
        return antalÅskådare;
    }
    
    public abstract int Popularitet();
    public abstract String beskrivning();
}
