/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4upg1;

/**
 *
 * @author erik.sandlov
 */
public class Motor {

    private int antalHK;

    public Motor(int antalHK) {
        this.antalHK = antalHK;
    }

    public int getAntalHK() {
        return antalHK;
    }

    public void setAntalHK(int antalHK) {
        this.antalHK = antalHK;
    }

    @Override
    public String toString() {
        return antalHK + "hk";
    }
}
