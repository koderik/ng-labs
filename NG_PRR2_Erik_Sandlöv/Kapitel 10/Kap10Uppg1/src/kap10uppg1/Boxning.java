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
public class Boxning extends KampSport {

    private boolean proffsBoxare;

    public Boxning(boolean proffsBoxare, int rondLängd, int viktKlass, int antalSpelare, int antalÅskådare) {
        super(rondLängd, viktKlass, antalSpelare, antalÅskådare);
        this.proffsBoxare = proffsBoxare;
    }

    @Override
    public String beskrivning() {
        return "Idrotten boxning går ut på att man pucklar på varandra \n" + "rondLängd=" + rondLängd + "viktKlass=" + viktKlass + "proffs=" + proffsBoxare;
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
