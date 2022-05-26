/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap11upg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ERIK
 */
public class Kap11Upg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Triangle tri = new Triangle(5, 3, 4);
            System.out.println("bra jobbat, den är rät");
            System.out.println(tri.getOmkrets());
        } catch (NotRightException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
