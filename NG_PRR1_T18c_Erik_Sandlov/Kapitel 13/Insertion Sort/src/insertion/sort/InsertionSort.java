/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort;

import java.util.Arrays;

/**
 *
 * @author erik.sandlov
 */
public class InsertionSort {
static String[] inputArray = {"Erik","Davod","aer","Benny","öhman","gustaf", "emil wallll"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        sortera(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void sortera(String[] lista) {
        int i;
        if (lista.length < 2) {
            return;
        }
        String temp;

        for (int j = 1; j < lista.length; j++) {
            temp = lista[j];
            i = j - 1;

            while (i >= 0 && lista[i].compareToIgnoreCase(temp) > 0) {
                lista[i+1]=lista[i];
                i--;
                
            }
            lista[i+1]=temp;
        }
    }
}

