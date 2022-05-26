/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4upg1;

/**
 *
 * @author erik.sandlov
 */
public class Fastighet {

    private String adress;

    public Fastighet(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     *
     * @return returnerar adressen
     */
    @Override
    public String toString() {
        return adress;
    }

}
