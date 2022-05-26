/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2ovn4;

/**
 *
 * @author ERIK
 */
public class Artikel {

    private String beteckning, beskrivning;
    private int antal, pris;

    public Artikel(String beteckning, String beskrivning, int pris) {
        this.beteckning = beteckning;
        this.beskrivning = beskrivning;
        this.pris = pris;
        antal = 0;
    }

    public void inköp(int mängd) {
        antal += mängd;
    }
    public void sälj(int mängd) {
        antal -= mängd;
    }

    public String getBeteckning() {
        return beteckning;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public int getAntal() {
        return antal;
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return "Artikel "+ beteckning + "\n" + beskrivning + ", Antal=" + antal + ", Försäljningspris=" + pris;
    }
    
}
