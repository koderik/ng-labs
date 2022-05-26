/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3upg1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author erik.sandlov
 */
public class Figure {

    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape s) throws ShapeException {
        int test = s.getShape();
        if (test != Shape.CIRCLE && test != Shape.TRIANGLE && test != Shape.SQUARE) {
            throw new ShapeException("Ogiltig shape");
        }
        shapes.add(s);
    }

    public void removeShapes(int type) {
        for (Shape s : shapes) {
            if (s.getShape() == type) {
                shapes.remove(s);
            }
        }
    }

    public void emptyList() {
        shapes.clear();
    }

    public double getTotalArea() {
        double area = 0;
        for (Shape s : shapes) {

            area += s.getArea();

        }
        return area;
    }

    public double getTotalArea(int type) {
        double area = 0;
        for (Shape s : shapes) {
            if (s.getShape() == type) {
                area += s.getArea();

            }
        }
        return area;
    }
}
