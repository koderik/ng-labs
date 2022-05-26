/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruh;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Bruh {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isAnagram("triangle", "integral"));

    }
/**
 * Metod som jämför två texter för att se ifall de är anagram
 * @param text1 tar in den första stringen
 * @param text2 tar in den andra stringen att jämföra med
 * @return returnerar sant om det är anagram och falskt ifall det inte är anagram
 */
    public static boolean isAnagram(String text1, String text2) {
        text1 = text1.replaceAll("\\s+", "");
        text2 = text2.replaceAll("\\s+", "");
        if (!(text1.length() == text2.length())) {
            return false;
        } else {
            char[] charList1 = new char[text1.length()];
            for (int i = 0; i < charList1.length; i++) {
                charList1[i] = text1.charAt(i);
            }
            char[] charList2 = new char[text2.length()];
            for (int i = 0; i < charList2.length; i++) {
                charList2[i] = text2.charAt(i);
            }
            int n = 0;
            for (int i = 0; i < charList1.length; i++) {
                if (charList1[i] == charList2[i]) {
                    n++;
                } else {
                    for (int j = 0; j < charList2.length; j++) {
                        if (charList1[i] == charList2[j]) {
                            n++;
                        }
                    }}
            }
            if (n == text1.length()) {
                return true;
            } else {
                return false;
            }

        }
    }
}
