/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övnprov2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ERIK
 */
public abstract class Fordon implements Lagra{
    private int vikt, antalHjul, årsmodell, märke;
    public abstract boolean hjälmtvång();
    public abstract String beskrivning();

    public Fordon(int vikt, int antalHjul, int årsmodell, int märke) {
        this.vikt = vikt;
        this.antalHjul = antalHjul;
        this.årsmodell = årsmodell;
        this.märke = märke;
    }
    
    
    @Override
    public void Lagra() {
        BufferedWriter fWrite = null;
        try {
            File file = new File("output.txt");
            fWrite = new BufferedWriter(new FileWriter(file, true));
            fWrite.write(beskrivning()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Fordon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fWrite.close();
            } catch (IOException ex) {
                Logger.getLogger(Fordon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
