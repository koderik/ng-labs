/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torun.test;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class TorunTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Framen aaaa = new Framen();
        System.out.println("Fråga spåkulan vad torun ska välja");
        Scanner sc = new Scanner(System.in);
        String input="";
        while(!input.equalsIgnoreCase("av")){
        input = sc.nextLine();
        String test = torun(input);
        System.out.println(test); 
        }
        
    }

    private static String torun(String a) {
        int ans = (int)( Math.random() * 3) ;
        switch (ans) {
            case 1:
                return "Torun kommer välja Teknisk Fysik";
            case 2:
                return "Torun kommer välja Arkitektur";
            case 0:
                return "Torun kommer välja något helt annat";
            default:
                return "va";

        }

    }

}
