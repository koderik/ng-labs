/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg2;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author erik.sandlov
 */
public class Uppgift2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File filen = new File("utmatning.txt");
        BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter(filen));
        Scanner scan = new Scanner(filen);
        Borst brunBorst = new Borst(new Color(165, 42, 42));
        Borst svartBorst = new Borst(new Color(255, 255, 255));
        Handtag gultHandtag = new Handtag(new Color(255, 255, 0));
        Sopkvast brunKvast = new Sopkvast(gultHandtag, brunBorst);
        Sopkvast svartKvast = new Sopkvast(gultHandtag, svartBorst);
        Kvastbutik butiken = new Kvastbutik();
        butiken.laggTillKvast(brunKvast);
        butiken.laggTillKvast(svartKvast);
        BufferedWriter.append(butiken.toString());

        BufferedWriter.close();
        String s = scan.nextLine() + "\n" + scan.nextLine();
        System.out.println(s);
        butiken.taBortKvast(brunKvast);
        scan = new Scanner(filen);
        BufferedWriter = new BufferedWriter(new FileWriter(filen));
        
        BufferedWriter.append(butiken.toString());
        BufferedWriter.close();
        System.out.println(scan.nextLine());

    }

}
