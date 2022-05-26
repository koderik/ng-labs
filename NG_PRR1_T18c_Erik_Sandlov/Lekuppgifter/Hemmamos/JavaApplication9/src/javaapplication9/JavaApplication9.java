/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author ERIK
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {1, 2, 3, 4};
        int[] list = new int[100];
        int listcount = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = listcount; j < freq + listcount; j++) {
                if (j < list.length) {
                    list[j] = val;
                    listcount++;
                } else {
                    break;
                }

            }
        }
    }

}
