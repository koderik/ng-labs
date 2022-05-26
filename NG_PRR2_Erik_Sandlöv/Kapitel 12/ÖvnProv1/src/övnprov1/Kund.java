/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov1;

import java.util.ArrayList;

/**
 *
 * @author ERIK
 */
public class Kund {
    private ArrayList<Konto> kontoList = new ArrayList<>();
    private String name;

    public Kund(String name) {
        this.name = name;
    }
    public void addKonto(Konto k){
        kontoList.add(k);
    }
    public void removeKonto(Konto k){
        kontoList.remove(k);
    }

    public String getName() {
        return name;
    }
    public int getTotalSaldo(){
        int i = 0;
        for (Konto k:kontoList) {
            i+=k.getBalance();
        }
        return i;
    }

    @Override
    public String toString() {
        String s= name+"\n";
        for(Konto k:kontoList){
            s+=k.toString()+"\n";
        }
        return s;
    }
    
}
