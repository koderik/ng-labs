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
public class jämförSaldo implements Comparator<Kund> {

    @Override
    public int compare(Kund o1, Kund o2) {
        return Double.compare(o2.getTotalSaldo(), o1.getTotalSaldo());
    }

}
