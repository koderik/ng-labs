/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övningsprov.pkg2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Person {

    private String namn;
    private String pNr;
    private Person partner;
    private List<Person> barnList = new LinkedList<>();

    public Person(String namn, String pNr) {
        this.namn = namn;
        this.pNr = pNr;
    }

    public String getKön() {

        int test = Integer.valueOf(pNr.substring(pNr.length() - 2, pNr.length() - 1));
        if (test % 2 == 0) {
            return "Kvinna";
        } else {
            return "Man";
        }
    }

    public String getNamn() {
        return namn;
    }

    public void läggTillPartner(Person p) {
        if (!p.equals(this)) {
            if (partner != p) {
                partner = p;
                p.läggTillPartner(this);
            }
        }

    }

    public void taBortPartner() {
        if (partner.partner != null) {
            partner.taBortPartner();
        }
        partner = null;
    }

    public void läggTillBarn(Person p) {
        if (!(barnList.contains(p) || this.equals(p) || partner.equals(p))) {
            barnList.add(p);
        }

    }

    @Override
    public String toString() {
        String s = namn + ", " + this.getKön() + ", född " + pNr.substring(2, pNr.length() - 8);
        if (partner != null) {
            s += ", är tillsammans med " + partner.getNamn();
        }
        if (!barnList.isEmpty()) {
            s += " och är förälder till";
            for (Person b : barnList) {
                s += " " + b.getNamn();
            }
        }
        return s;
    }

}
