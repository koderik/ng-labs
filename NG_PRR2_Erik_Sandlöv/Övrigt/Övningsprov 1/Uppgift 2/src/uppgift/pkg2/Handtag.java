/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg2;

import java.awt.Color;

/**
 *
 * @author erik.sandlov
 */
public class Handtag {

    private Color färg;

    public Handtag(Color färg) {
        this.färg = färg;
    }
 @Override
    public String toString() {
        return "Handtagsfärg: "+färg.toString();
    }

}
