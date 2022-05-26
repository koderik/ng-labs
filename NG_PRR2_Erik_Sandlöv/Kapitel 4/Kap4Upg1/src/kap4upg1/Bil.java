/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap4upg1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author erik.sandlov
 */
public class Bil extends Fordon {

    private String modell;
    private List<Hjul> hjul = new LinkedList<>();
    private Motor motor;

    public Bil(String modell, int vikt) {
        super(vikt);
        this.modell = modell;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void addHjul(Hjul hjul) {
        this.hjul.add(hjul);
    }

    /**
     *
     * @return returnerar modellen med lite fakta om bilens hjul och motor
     */
    @Override
    public String toString() {
        String s = modell + " med " + motor.toString() + " och " + hjul.size() + " hjul, som väger " + super.getVikt() + "kg";
        return s;
    }

}
