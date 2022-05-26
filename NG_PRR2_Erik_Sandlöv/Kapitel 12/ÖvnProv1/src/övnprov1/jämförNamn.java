/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov1;

import java.util.Comparator;

/**
 *
 * @author ERIK
 */
public class jämförNamn implements Comparator<Kund> {

    @Override
    public int compare(Kund o1, Kund o2) {
        int i = 0;
        while (true) {

            int compare = Character.compare(o1.getName().charAt(i), o2.getName().charAt(i));
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

}
