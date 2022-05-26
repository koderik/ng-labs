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
public class Produkt {
private static int antalProdukter=1;
private int produktNummer;
    public Produkt() {
        produktNummer=antalProdukter;
        antalProdukter++;
    }

    public int getProduktNummer() {
        return produktNummer;
    }

}
