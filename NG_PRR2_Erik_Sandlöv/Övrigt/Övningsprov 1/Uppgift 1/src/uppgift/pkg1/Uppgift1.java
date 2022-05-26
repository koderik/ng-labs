/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author erik.sandlov
 */
public class Uppgift1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Ingrediens vete = new Ingrediens("vetemjöl", "1 dl");
        Ingrediens mjölk = new Ingrediens("mjölk", "2 dl");
        Ingrediens ägg = new Ingrediens("ägg", "1 styck");
        Ingrediens salt = new Ingrediens("salt", "efter tycke och smak");
        Ingrediens vatten = new Ingrediens("vatten", "1 msk");
        Recept pannkaka = new Recept("Pannkaka", 30);
        pannkaka.addIngrediens(vete);
        pannkaka.addIngrediens(mjölk);
        pannkaka.addIngrediens(ägg);
        Recept omelett = new Recept("Omelett", 15);
        omelett.addIngrediens(ägg);
        omelett.addIngrediens(salt);
        omelett.addIngrediens(vatten);
        System.out.println(pannkaka.toString());
        System.out.println(omelett.toString());
        Recept[] receptbok = new Recept[2];
        receptbok[0] = pannkaka;
        receptbok[1] = omelett;
        for (Recept r : receptbok) {
            System.out.println(r.toString());
        }

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("recept.txt"))));
        for (Recept r : receptbok) {
            pw.append(r.toString());
        }
        pw.close();
    }

}
