/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betyg;

/**
 *
 * @author erik.sandlov
 */
public class Kurs {
    private String namn;
    private int poäng;
    private char betyg;

    public Kurs(String namn, int poäng) {
        this.namn = namn;
        this.poäng = poäng;
    }

   


    public void setBetyg(char betyg) {
        this.betyg = betyg;
    }

    public String getNamn() {
        return namn;
    }

    public int getPoäng() {
        return poäng;
    }
    
    
    
}
