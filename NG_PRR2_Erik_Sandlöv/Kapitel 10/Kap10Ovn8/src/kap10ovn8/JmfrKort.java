/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn8;

import java.util.Comparator;

/**
 *
 * @author erik.sandlov
 */
public class JmfrKort implements Comparator<Kort> {

    @Override
    public int compare(Kort o1, Kort o2) {
        if (o1.getFärg() != o2.getFärg()) {
            return Integer.compare(o1.getFärg(), o2.getFärg());
        } else {
            if (o1.getValör() == 1) {
                return 1;
            } else if (o2.getValör() == 1) {
                return -1;
            } else {
                return Integer.compare(o1.getValör(), o2.getValör());
            }

        }
    }

}
