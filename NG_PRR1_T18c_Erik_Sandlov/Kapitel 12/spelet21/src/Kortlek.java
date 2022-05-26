/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrli
 */
public class Kortlek {
    //instansvariabler
    private Kort[] kortlek;
    private int antalKort;
    
    //konstruktor
    public Kortlek() {
        kortlek = new Kort[52];
        antalKort = 52;
        int plats = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                kortlek[plats] = new Kort(i,j);
                plats++;
            }
        }
    }
    
    //getter
    public Kort[] getKortlek() {
        return kortlek;
    }
    
    //toString
    public String toString() {
        String ut = "[";
        for (int i = 52-antalKort; i < kortlek.length; i++) {
            if(i < kortlek.length-1) {
                ut+= kortlek[i] +  " ,";
            }
            else {
                ut+=kortlek[i];
            }
        }
        ut+="]";
        return ut;
        
    }
    
    //övriga metoder
    
    public Kort geKort() {
        Kort k = kortlek[52-antalKort];
        kortlek[52-antalKort] = null;
        antalKort--;
        return k;
    }
    
    public void blanda() {
        for (int i = 0; i < 100; i++) {
            int pos1 = (int)(Math.random()*(antalKort)+(52-antalKort));
            int pos2 = (int)(Math.random()*(antalKort)+(52-antalKort));
            //System.out.println(pos1 + " " + pos2);
            Kort k1 = kortlek[pos1];
            kortlek[pos1] = kortlek[pos2];
            kortlek[pos2] = k1;
        }
    }
    
    
    
    
}
