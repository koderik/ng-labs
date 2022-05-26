/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov1;

/**
 *
 * @author ERIK
 */
public class Konto {
    private int pin;
    private double balance;

    public Konto(double balance,int pin) {
        this.pin = pin;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Konto{" + "pin=" + pin + ", balance=" + balance + '}';
    }

    public double getBalance() {
        return balance;
    }
    
}
