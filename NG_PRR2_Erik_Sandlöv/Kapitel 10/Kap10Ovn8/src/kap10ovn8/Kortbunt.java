/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn8;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author erik.sandlov
 */
public class Kortbunt {

    private LinkedList<Kort> kortList = new LinkedList<>();

    public Kortbunt() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 13; j++) {
                kortList.add(new Kort(i, j));
            }
        }
    }

    public void sortera() {
        JmfrKort c = new JmfrKort();
        kortList.sort(c);
    }

    public void blanda() {
        Collections.shuffle(kortList);
    }

    public String toString() {
        String s = "";
        for (Kort k : kortList) {
            s += k.toString() + "\n";
        }
        return s;
    }
}
