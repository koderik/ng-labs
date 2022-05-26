/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg1;

/**
 *
 * @author erik.sandlov
 */
public class Ingrediens {

    private String namn, mängd;

    public Ingrediens(String namn, String mängd) {
        this.namn = namn;
        this.mängd = mängd;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getMängd() {
        return mängd;
    }

    public void setMängd(String mängd) {
        this.mängd = mängd;
    }

    @Override
    public String toString() {
        return namn + ", " + mängd;
    }

}
