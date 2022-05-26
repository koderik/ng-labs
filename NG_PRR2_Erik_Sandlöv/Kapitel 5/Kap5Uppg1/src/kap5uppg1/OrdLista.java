/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5uppg1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class OrdLista {

    private List<Ord> ordLista = new LinkedList<>();
/**
 * skapar en ordlista
 */
    public OrdLista() {
    }
/**
 * 
 * @param typ tar in vilken typ av ord användaren söker
 * @return letar upp ett slumpat ord som råkar vara av typen användaren söker, gör om sökningen ifall ordet inte stämmer överens med typen
 */
    public String getRandomOrd(int typ) {

        do {
            int key = (int) (Math.random() * ordLista.size());
            if (ordLista.get(key).getTyp() == typ) {
                return ordLista.get(key).getOrd();
            }
        } while (true);

    }
/**
 * 
 * @param ord tar in ett ord och adderar den till ordlistan
 */
    public void addOrd(Ord ord) {
        ordLista.add(ord);
    }

    
}
