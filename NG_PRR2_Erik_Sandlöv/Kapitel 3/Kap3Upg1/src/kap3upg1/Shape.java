/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3upg1;

import java.awt.Point;
import java.text.DecimalFormat;

/**
 *
 * @author erik.sandlov
 */
public class Shape {

    private static int numberOfShapes;
    public static final int CIRCLE = 0;
    public static final int SQUARE = 1;
    public static final int TRIANGLE = 2;

    private Point p;
    private double size;
    private int shape;

    public Shape(Point p, double size, int shape) throws ShapeException {
        if (shape != Shape.CIRCLE && shape != Shape.TRIANGLE && shape != Shape.SQUARE) {
            throw new ShapeException("Ogiltig shape");
        } else {

            this.shape = shape;
            this.p = p;
            this.size = size;
            numberOfShapes++;
        }

    }

    public double getArea() {
        DecimalFormat df = new DecimalFormat("#.00");
        double area = 0;
        switch (shape) {
            case TRIANGLE:
                area = Math.pow(size, 2) / 2;
                break;
            case SQUARE:
                area = Math.pow(size, 2);
                break;
            case CIRCLE:
                area = Math.pow(size / 2, 2) * Math.PI;
                break;
        }
        return Math.round(area);
    }

    public static int getNumberOfShapes() {
        return numberOfShapes;
    }

    public Point getPosition() {
        return p;
    }

    public void setPosition(Point p) {
        this.p = p;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getShape() {
        return shape;
    }

    @Override
    public String toString() {
        String s = "";
        switch (shape) {
            case TRIANGLE:
                s += "Triangle: ";
                break;
            case SQUARE:
                s += "Square: ";
                break;
            case CIRCLE:
                s += "Circle: ";
                break;
        }
        s += p.toString().substring(14) + ", ";
        s += getArea() + " unit area";
        return s;
    }

}
