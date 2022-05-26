/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn5;

import java.util.ArrayList;

/**
 *
 * @author erik.sandlov
 */
public class Kap10Ovn5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figur> shapeList = new ArrayList<>();
        Rektangel r = new Rektangel(50, 40, new Punkt(3, 2));
        Cirkel s = new Cirkel(7, new Punkt(8, 2));
        Triangel t = new Triangel(30, 20, new Punkt(10, 0));
        shapeList.add(t);
        shapeList.add(s);
        shapeList.add(r);
        for (Figur g : shapeList) {
            System.out.println(g.toString());
        }
    }

}
