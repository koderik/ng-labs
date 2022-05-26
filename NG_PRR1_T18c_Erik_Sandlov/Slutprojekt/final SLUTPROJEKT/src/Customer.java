
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ERIK
 */
public class Customer {

    /**
     * Kund har en lista med pizzor, användarnamn och lösenord
     */
    private String username, password;
    private ArrayList<Pizza> pizzaList;

    /**
     *
     * @param username Tar in användarnamn
     * @param password Tar in lösenord
     */
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;

        this.pizzaList = new ArrayList<>();

    }

    public void addPizza(Pizza p) {
        pizzaList.add(p);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Räknar ut den totala kostnaden av alla kundens pizzor
     *
     * @return summan av alla pizzor
     */
    public int getTotalCost() {
        int c = 0;
        for (int i = 0; i < pizzaList.size(); i++) {
            c += pizzaList.get(i).getTotalCost();
        }
        return c;
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + "password=" + password + '}';
    }

    /**
     *
     * @return Returnerar alla kundens pizzor i en läsbar lista
     */
    public String pizzaToString() {
        String s = "";
        for (int i = 0; i < pizzaList.size(); i++) {
            s += (i + 1) + ". " + pizzaList.get(i).toString() + "\n";
        }
        return s;
    }

}
