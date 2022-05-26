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
public class Basket extends BollSport {

    private int periodLängd, korgHöjd;

    public Basket(int periodLängd, int korgHöjd, int planStorlek, int bollStorlek, int antalPerioder, int antalSpelare, int antalÅskådare) {
        super(planStorlek, bollStorlek, antalPerioder, antalSpelare, antalÅskådare);
        this.periodLängd = periodLängd;
        this.korgHöjd = korgHöjd;
    }

    @Override
    public String beskrivning() {
        return "Idrotten basket går ut på att man dribblar en boll \n" + "korgHöjd=" + korgHöjd + ", FperiodLängd=" + periodLängd + "planStorlek=" + planStorlek + ", bollStorlek=" + bollStorlek + ", antalPerioder=" + antalPerioder;
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
