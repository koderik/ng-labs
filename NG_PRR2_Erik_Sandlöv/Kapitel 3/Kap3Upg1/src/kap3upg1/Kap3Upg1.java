/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3upg1;

import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author erik.sandlov
 */
public class Kap3Upg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figure fig = new Figure();
        try {
            Shape s = new Shape(new Point(10, 10), 100, Shape.SQUARE);
            fig.addShape(s);
        } catch (ShapeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {
                try {
                    Shape form = new Shape(new Point((int) (Math.random() * 30), (int) (Math.random() * 30)), (int) (Math.random() * 30), (int) (Math.random() * 3));
                    fig.addShape(form);
                    System.out.println(form.toString());
                } catch (ShapeException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }
            double a = fig.getTotalArea();
            double c = fig.getTotalArea(0);
            double t = fig.getTotalArea(2);
            double s = fig.getTotalArea(1);

            System.out.println("Total: " + a);
            System.out.println("Circle: " + c);
            System.out.println("Triangle: " + t);
            System.out.println("Square: " + s);
            System.out.println(c + t + s);
            fig.emptyList();
        }

    }

}
