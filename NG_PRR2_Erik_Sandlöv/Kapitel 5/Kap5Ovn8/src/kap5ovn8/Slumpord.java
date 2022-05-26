/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap5ovn8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik.sandlov
 */
public class Slumpord {

    private List<String> ordLista = new LinkedList<>();
    private File filen;
/**
 * 
 * @param filNamn tar in vad filen heter och adderar alla dess ord i en ordlista
 */
    public Slumpord(String filNamn) {
        try {
            this.filen = new File(filNamn);
            Scanner sc = new Scanner(filen);
            while (sc.hasNext()) {
                ordLista.add(sc.next()); //loopar igenom alla ord och lägger in dem i ordlistan
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Slumpord.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
/**
 * 
 * @return matar ut ett slumpat ord från listan
 */
    public String ettOrd() {
        int num = ordLista.size();
        int random = (int) (Math.random() * num);
        String s = ordLista.get(random);
        return s; //returnerar ett slumpat ord
    }

}
