/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov2;

/**
 *
 * @author ERIK
 */
public class Person {

    private String namn;
    private int pnr;

    public Person(String namn, int pnr) throws KennyException {
        if (namn.equals("kenny")) {
            throw new KennyException("gangsta");
        } else {
            this.namn = namn;
            this.pnr = pnr;
        }

    }

    @Override
    public String toString() {
        return "Person{" + "namn=" + namn + ", pnr=" + pnr + '}';
    }

}
