/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap10ovn3;

import java.util.ArrayList;

/**
 *
 * @author ERIK
 */
public abstract class Ägare {
    ArrayList <Ting>objektList;
    
    public Ägare() {
        this.objektList = new ArrayList<>();
        
    }
    
    public void addObject(Ting a){
        a.setÄgare(this);
        objektList.add(a);
    }
    public void removeObject(Ting a){
        a.setÄgare(null);
        objektList.add(a);
    }

    @Override
    public String toString() {
        String s="";
        for(Ting a:objektList){
            s+=a.toString()+" ";
        }
        return s;
    }
    
    
}
