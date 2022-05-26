/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERIK
 */
public class Material {

    private String name, enhet;
    private int cost, amount;

    public Material(String name, String enhet, int cost, int amount) {
        this.name = name;
        this.enhet = enhet;
        this.cost = cost;
        this.amount = amount;
    }

    public int totalCost() {
        return cost * amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Material{" + name + ", " + this.totalCost() + "kr för " + amount + ' ' + enhet + '}';
    }

}
