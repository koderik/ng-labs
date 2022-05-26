/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4upg1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Person {

    private String namn;
    private List<Fastighet> fastigheter = new LinkedList<>();
    private int kön;
    public static final int MAN = 0;
    public static final int KVINNA = 1;
    public static final int ICKE_BINÄR = 2;

    public Person(String namn, int kön) {
        this.namn = namn;
        this.kön = kön;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getKön() {
        return kön;
    }

    public void setKön(int kön) {
        this.kön = kön;
    }

    public void köpFastighet(Fastighet a) {
        this.fastigheter.add(a);
    }

    public void säljFastighet(Fastighet a) {
        this.fastigheter.remove(a);
    }

    /**
     *
     * @return personens info som String, med olika text beroende på antal
     * fastigheter och angivet kön
     */
    @Override
    public String toString() {
        String s = namn + " har könet ";
        switch (kön) {
            case MAN:
                s += "Man";
                break;
            case KVINNA:
                s += "Kvinna";
                break;
            case ICKE_BINÄR:
                s += "Ickebinär";
                break;
        }
        if (!fastigheter.isEmpty()) {
            s += " och äger ";
            for (Fastighet a : fastigheter) {
                if (a instanceof Flerfamiljshus) {
                    s += ((Flerfamiljshus) a).toString() + "\n";
                }

            }
        }
        return s;
    }

}
