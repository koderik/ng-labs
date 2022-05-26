/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERIK
 */
public class Topping {

    /**
     * Topping har variablerna namn och pris
     */
    private final String name;
    private final int price;

    /**
     *
     * @param name Tar in toppingens namn
     * @param price Tar in toppingens pris
     */
    public Topping(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    /**
     *
     * @return Returnerar namnet och priset på toppingen
     */
    @Override
    public String toString() {
        return name + " : $" + price;
    }

}
