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
public class Fotboll extends BollSport{
    private int periodLängd;

    public Fotboll(int periodLängd, int planStorlek, int bollStorlek, int antalPerioder, int antalSpelare, int antalÅskådare) {
        super(planStorlek, bollStorlek, antalPerioder, antalSpelare, antalÅskådare);
        this.periodLängd = periodLängd;
    }

   

    @Override
    public String beskrivning() {
        return "Idrotten fotboll går ut på att man sparkar en boll \n"+ "periodLängd=" + periodLängd +"planStorlek=" + planStorlek + ", bollStorlek=" + bollStorlek + ", antalPerioder=" + antalPerioder;
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
