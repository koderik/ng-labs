/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10uppg1;

import java.util.ArrayList;

/**
 *
 * @author ERIK
 */
public class Kap10Uppg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Idrott> idrottList = new ArrayList<>();
        Simhopp s1 = new Simhopp(50, 24, 13, 50, 5, 200);
        Simning s2 = new Simning("fjäril", 250, 66, 50, 10, 300);
        Fotboll f = new Fotboll(50, 5000, 25, 4, 20, 1000);
        Basket b = new Basket(50, 3, 3000, 30, 4, 10, 900);
        Boxning k1= new Boxning(true, 5, 60, 2, 2000);
        Judo j = new Judo("röd", 50, 70, 2, 50);
        idrottList.add(s1);
        idrottList.add(s2);
        idrottList.add(f);
        idrottList.add(b);
        idrottList.add(k1);
        idrottList.add(j);
        for(Idrott a : idrottList){
            System.out.println(a.beskrivning());
            System.out.println("popularitet "+a.Popularitet());
        }
    }

}
