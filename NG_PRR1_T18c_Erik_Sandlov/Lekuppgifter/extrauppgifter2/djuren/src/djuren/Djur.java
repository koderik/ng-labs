/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djuren;

/**
 *
 * @author ERIK
 */
public class Djur {
    private String namn;
    private String sort;
    private int ålder;

    public Djur(String namn, String sort, int ålder) {
        this.namn = namn;
        this.sort = sort;
        this.ålder = ålder;
    }

    @Override
    public String toString() {
        String b = sort+", "+ålder+" som heter "+namn;
        return b;
    }
    
}
