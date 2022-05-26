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
public abstract class KampSport extends Idrott{
    protected int rondLängd, viktKlass;

    public KampSport(int rondLängd, int viktKlass, int antalSpelare, int antalÅskådare) {
        super(antalSpelare, antalÅskådare);
        this.rondLängd = rondLängd;
        this.viktKlass = viktKlass;
    }
    
   
    
}
