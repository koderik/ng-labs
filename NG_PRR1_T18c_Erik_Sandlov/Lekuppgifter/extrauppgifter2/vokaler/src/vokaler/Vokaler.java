/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokaler;

import com.sun.javafx.image.impl.IntArgb;
import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Vokaler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        vokalA(s.nextLine());
        
    }
    static void vokalA(String text){
        char[] tecken = new char[text.length()];
        for (int i = 0; i < tecken.length; i++) {
            tecken[i]=text.charAt(i);
            if (tecken[i]=='a' || tecken[i]=='e' || tecken[i]=='o' || tecken[i]=='u' || tecken[i]=='i' || tecken[i]=='y' ) {
                tecken[i]='o';
            }
            System.out.print(tecken[i]);
        }
        
        }
    }

