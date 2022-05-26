/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn8;

/**
 *
 * @author ERIK
 */
public class Kort {

    private int färg;
    private int valör;

    public Kort(int färg, int valör) {
        this.färg = färg;
        this.valör = valör;
    }

    public Kort(String f, int valör) {
        if (f.equals("Klöver")) {
            this.färg = 3;
        } else if (f.equals("Ruter")) {
            this.färg = 2;
        } else if (f.equals("Hjärter")) {
            this.färg = 1;
        } else if (f.equals("Spader")) {
            this.färg = 0;
        }

        this.valör = valör;
    }

    public int getFärg() {
        return färg;
    }

    public int getValör() {
        return valör;
    }

    @Override
    public String toString() {
        switch (färg) {
            case 0:
                return "Kort{Klöver, valör=" + valör + '}';
            case 1:
                return "Kort{Ruter, valör=" + valör + '}';
            case 2:
                return "Kort{Hjärter, valör=" + valör + '}';
            case 3:
                return "Kort{Spader, valör=" + valör + '}';

        }
        return null;
    }

}
