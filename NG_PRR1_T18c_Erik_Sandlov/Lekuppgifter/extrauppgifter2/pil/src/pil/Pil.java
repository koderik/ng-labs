/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pil;

/**
 *
 * @author ERIK
 */
public class Pil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ritaFigur(5);
    }
    
    
    public static void ritaFigur(int höjd){
        for (int i = 1; i <= höjd; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        for (int i = höjd-1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
    }
    }
}

