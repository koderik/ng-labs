/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5uppg1;

/**
 *
 * @author erik.sandlov
 */
public class Ord {

    private String ord;
    private int typ;
    public static final int VERB = 0;
    public static final int SUBSTANTIV = 1;

    public Ord(String ord, int typ) {
        this.ord = ord;
        this.typ = typ;
    }

    public String getOrd() {
        return ord;
    }

    public int getTyp() {
        return typ;
    }

}
