/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg2;

/**
 *
 * @author erik.sandlov
 */
public class Sopkvast extends Produkt {

    private Borst borste;
    private Handtag handtag;

    public Sopkvast(Handtag handtag, Borst borste) {

        this.borste = borste;
        this.handtag = handtag;
    }

    @Override
    public String toString() {
        return "Sopkvast "+this.getProduktNummer()+" {" + borste.toString() + ", " + handtag.toString() + "}";
    }

}
