/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author ERIK
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(test());
        int j = 0;
        j = j++;
        System.out.println(j);
        System.out.println(j++);
    }

    public static int test() {
        int j = 0;
        for (int i = 0; i < 3; i++) {
            j = j++;
        }
        return j;
    }

}
