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
public class Simhopp extends VattenSport {

    private int höjd, maxPoäng, poäng;

    public Simhopp(int höjd, int maxPoäng, int poäng, int bassängDjup, int antalSpelare, int antalÅskådare) {
        super(bassängDjup, antalSpelare, antalÅskådare);
        this.höjd = höjd;
        this.maxPoäng = maxPoäng;
        this.poäng = poäng;
    }

    @Override
    public String beskrivning() {
        return "Idrotten simhopp man hoppar i en pool \n" + "höjd=" + höjd + ", maxPoäng=" + maxPoäng + ", poäng=" + poäng + ", bassängDjup=" + bassängDjup;
    }

    @Override
    public int Popularitet() {
        if (super.getAntalÅskådare() >= 100) {
            if (super.getAntalÅskådare() >= 300) {
                return HÖG;
            } else {
                return MEDEL;
            }
        } else {
            return LÅG;
        }
    }
}
