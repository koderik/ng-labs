/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural.network;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ERIK
 */
public class Main {

    double[][] X;
    double[][] Y;

    public static void main(String[] args) {
        double[][] X = {
            {247, 33, 33},
            {0, 10, 0},
            {255, 255, 51},
            {10, 0, 153},
            {0, 255, 0},
            {128, 0, 0},
            {0, 255, 255},
            {255, 255, 255}
        };
        addTraining();
        //black
        double[][] Y = {
            {1}, {0}, {0}, {0}, {1}, {0}, {1}, {1}
        };
        NeuralNetwork nn = new NeuralNetwork(3, 10, 1);
        try {
            nn.fit(X, Y, 50000);
        } catch (MatrixMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        double[][] input = {
            {0, 128, 128}
        /*  {0, 10, 0},
            {255, 255, 51},
            {10, 0, 153}*/
        };
        for (double d[] : input) {
            try {
                List<Double> output = nn.predict(d);
                //   System.out.println(output.toString());
            } catch (MatrixMismatchException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }

    private static void addTraining() {
        List<List<Double>> TList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Boolean on = true;
        String s;
        
        do {
            s = sc.nextLine();

            if (!s.equals("exit")) {
                List<Double> dList = new ArrayList<>();
                Scanner sc2 = new Scanner(s);
                sc2.useDelimiter(",");
                String stest = sc2.next().replaceAll(",", "");
                double red = Double.parseDouble(stest);
                System.out.println(red);
                stest = sc2.next().replaceAll(",", "");
                double green = Double.parseDouble(stest);
                System.out.println(green);
                stest = sc2.next().replaceAll(",", "");
                double blue = Double.parseDouble(stest);
                System.out.println(blue);
                
                stest = sc2.next().replaceAll(",", "");
                double answer = Double.parseDouble(stest);
                System.out.println(answer);
                

                dList.add(red);
                dList.add(green);
                dList.add(blue);
                dList.add(answer);
                
                TList.add(dList);
                
                
            } else {
                on = false;
            }
        } while (on);
       double[][] X = new double[TList.size()][3];
       int index=0;
       for (List<Double> a:TList){
           X[index]
       }
    }
}
