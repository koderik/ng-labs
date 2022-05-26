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
public abstract class VattenSport extends Idrott{
        protected int bassängDjup;

    public VattenSport(int bassängDjup, int antalSpelare, int antalÅskådare) {
        super(antalSpelare, antalÅskådare);
        this.bassängDjup = bassängDjup;
    }

    
    
}
