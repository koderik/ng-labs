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
public class Simning extends VattenSport {

    private String simsätt;
    private int sträcka, tid;

    public Simning(String simsätt, int sträcka, int tid, int bassängDjup, int antalSpelare, int antalÅskådare) {
        super(bassängDjup, antalSpelare, antalÅskådare);
        this.simsätt = simsätt;
        this.sträcka = sträcka;
        this.tid = tid;
    }

    @Override
    public String beskrivning() {
        return "Idrotten simning går ut på att man simmar \n" + "simsätt=" + simsätt + "sträcka=" + sträcka + ", bassängDjup=" + bassängDjup + ", tid=" + tid;
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
