/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author erik.sandlov
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String s = Calendar.getInstance().getTime().toString();
        String date = s.substring(0,10);
        String time = s.substring(11,19);
        String year = s.substring(25);
        System.out.println("Datum och tid:");
        System.out.print(date);
        System.out.println(" "+year);
        System.out.println(time);
        JOptionPane.showMessageDialog(null, year, "År", JOptionPane.INFORMATION_MESSAGE);
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in radie :DD");
        double rad = scan.nextDouble();
        double vol = (4*Math.PI*Math.pow(rad, 3))/3;
        double area = (4*Math.PI*Math.pow(rad, 2));
        int volav = (int)(10*(vol+0.05));
        double volav2 = (double)(volav/10.0);
        int areaav = (int)(10*(area+0.05));
        double areaav2 = (double)(areaav/10.0);
        System.out.println("Volym: "+volav2);
        System.out.println("Area: "+areaav2);
        
        
        
        
}

    
    
}
