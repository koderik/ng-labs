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
public abstract class BollSport extends Idrott{
    protected int planStorlek, bollStorlek, antalPerioder;

    public BollSport(int planStorlek, int bollStorlek, int antalPerioder, int antalSpelare, int antalÅskådare) {
        super(antalSpelare, antalÅskådare);
        this.planStorlek = planStorlek;
        this.bollStorlek = bollStorlek;
        this.antalPerioder = antalPerioder;
    }

    
    
}
