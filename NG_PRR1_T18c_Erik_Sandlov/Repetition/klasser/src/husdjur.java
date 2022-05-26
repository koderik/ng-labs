/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik.sandlov
 */
public class husdjur {

    
    private String namn;
    private String sort;
    private int ålder;

    public husdjur(String namn, String sort, int ålder) {
        this.namn = namn;
        this.sort = sort;
        this.ålder = ålder;
    }
    public String getNamn() {
        return namn;
    }

    public String getSort() {
        return sort;
    }

    public int getÅlder() {
        return ålder;
    }
    
}
