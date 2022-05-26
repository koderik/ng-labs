/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort;

import java.util.Arrays;

/**
 *
 * @author erik.sandlov
 */
public class SelectionSort {

    static String[] lista = {"kurwa", "hejhej", "jacob", "linton", "bert", "august"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        selectionSort(lista);
        System.out.println(Arrays.toString(lista));
    }

    public static void selectionSort(String[] lista) {

        for (int i = 0; i < lista.length - 1; i++) {
            int index = i;
            for (int j = i; j < lista.length; j++) {
                if (lista[j].compareToIgnoreCase(lista[index]) < 0) {
                    index = j;
                }
            }
            String temp = lista[index];
            lista[index] = lista[i];
            lista[i] = temp;

        }
    }

}
