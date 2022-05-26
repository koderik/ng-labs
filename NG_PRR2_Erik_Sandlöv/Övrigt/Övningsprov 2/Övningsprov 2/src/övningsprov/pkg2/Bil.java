/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övningsprov.pkg2;

/**
 *
 * @author erik.sandlov
 */
class Bil extends Fordon {

    private String märke, modell;
    private int värde;

    public Bil(String märke, String modell, int värde, int vikt, String regnr) {
        super(vikt, regnr);
        this.märke = märke;
        this.modell = modell;
        this.värde = värde;
    }

    public String getMärke() {
        return märke;
    }

    public String getModell() {
        return modell;
    }

    public int getVärde() {
        return värde;
    }

    @Override
    public String toString() {
        return märke + " " + modell + ", värde: " + värde + "kr " + super.toString();
    }

}
