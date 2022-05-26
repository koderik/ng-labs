/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2ovn2;

/**
 *
 * @author ERIK
 */
public class Kort {

    private String färg, valör;
    private int färgInt, valörInt;

    public Kort(int färg, int valör) {
        färgInt = färg;
        valörInt = valör;
    }

    public Kort() {
        färgInt = ((int) (Math.random() * 4));
        valörInt = ((int) (Math.random() * 13)) + 1;

    }

    private String generateValör(int valörSwitch) {

        String tempValör;
        switch (valörSwitch) {
            case 1:
                tempValör = "Ess";
                break;
            case 11:
                tempValör = "Knekt";
                break;
            case 12:
                tempValör = "Dam";
                break;
            case 13:
                tempValör = "Kung";
                break;
            default:
                tempValör = valörSwitch + "";
                break;
        }
        return tempValör;
    }

    private String generateFärg(int färgSwitch) {
        String tempFärg;

        switch (färgSwitch) {
            case 0:
                tempFärg = "Ruter";
                break;
            case 1:
                tempFärg = "Klöver";
                break;
            case 2:
                tempFärg = "Hjärter";
                break;
            case 3:
                tempFärg = "Spader";
                break;
            default:
                tempFärg = "cursed kort";
                break;
        }
        return tempFärg;
    }

    public String getFärg() {
        return generateFärg(färgInt);
    }

    public String getValör() {
        return generateValör(valörInt);
    }

    @Override
    public String toString() {
        return generateFärg(färgInt) + " " + generateValör(valörInt);
    }

}
