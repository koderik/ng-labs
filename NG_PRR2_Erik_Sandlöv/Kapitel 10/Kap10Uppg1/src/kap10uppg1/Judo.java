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
public class Judo extends KampSport {

    private String bälte;

    public Judo(String bälte, int rondLängd, int viktKlass, int antalSpelare, int antalÅskådare) {
        super(rondLängd, viktKlass, antalSpelare, antalÅskådare);
        this.bälte = bälte;
    }

    @Override
    public String beskrivning() {
        return "Idrotten Judo går ut på att man försöker fälla varandra \n" + "rondLängd=" + rondLängd + "viktKlass=" + viktKlass + "bälte=" + bälte;
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
