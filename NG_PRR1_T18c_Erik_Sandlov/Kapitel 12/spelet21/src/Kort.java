/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrli
 */
public class Kort {
    //instansvariabler
    private int färg; //1=klöver, 2=ruter, 3=spader, 4=hjärter 
    private int valör; //1=ess, 11=knekt, 12=dam, 13=kung
    
    //konstruktor
    public Kort(int färg, int valör) {
        this.färg = färg;
        this.valör = valör;
    }

    //getters (vi vill inte ha setters)
    public int getFärg() {
        return färg;
    }

    public int getValör() {
        return valör;
    }
    
    //toString
    public String toString() {
        String ut = "";
        if(färg == 1) {
            ut+="Klöver ";
        }
        else if(färg == 2) {
            ut+="Ruter ";
        }
        else if(färg == 3) {
            ut+="Spader ";
        }
        else {
           ut+="Hjärter ";
        }
        if(valör ==1) {
            ut+="Ess";
        } 
        else if(valör == 11) {
            ut+="Knekt";
        }
        else if(valör == 12) {
            ut+="Dam";
        }
        else if(valör == 13) {
            ut+="Kung";
        }
        else { 
            ut+=valör;
        }
        return ut;
    }

    
    
    
    
}
