
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ERIK
 */
public class Pizza {

    /**
     * Klassen pizza har variablerna maxtopping och counter för att hålla koll
     * på hur många toppings som får plats på pizzan och ett namn (främst för
     * standardpizzorna)
     */
    private int maxTopping, counter;
    private String name;

    private Topping[] toppingList;

    /**
     *
     * @param maxTopping Tar in maximala antalet toppings
     */
    public Pizza(int maxTopping) {
        name = null;
        this.maxTopping = maxTopping;
        counter = 0;
        toppingList = new Topping[maxTopping];
    }

    /**
     *
     * @param t tar in en topping och försöker lägga på den på pizzan
     * @return returnerar true ifall det lyckades annars false
     */
    public boolean addTopping(Topping t) {
        if (counter < maxTopping) {
            toppingList[counter] = t;
            counter++;
            return true;
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "The pizza is full.", "Problem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * försöker ta bort en topping från pizzan
     *
     * @return returnerar true ifall det lyckades annars false
     */
    public boolean removeTopping() {
        if (counter > 0) {
            counter--;
            toppingList[counter] = null;
            return true;
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "The pizza is empty.", "Problem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     *
     * @return returnerar den totala kostnaden för pizzan adderat med dess
     * toppings
     */
    public int getTotalCost() {

        int total = maxTopping;

        for (int i = 0; i < counter; i++) {
            total += toppingList[i].getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTopping() {
        return maxTopping;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    /**
     *
     * @return Returnerar pizzans namn eller storlek och dess toppings
     */
    @Override
    public String toString() {
        String r;
        if (name != (null)) {
            r = name + ": ";
        } else if (maxTopping == 3) {
            r = "Small: ";
        } else if (maxTopping == 5) {
            r = "Medium: ";
        } else if (maxTopping == 7) {
            r = "Large: ";
        } else {
            r = "Pizza: ";
        }

        for (int i = 0; i < counter; i++) {
            r += toppingList[i].getName() + " ";
        }
        return r;
    }

}
