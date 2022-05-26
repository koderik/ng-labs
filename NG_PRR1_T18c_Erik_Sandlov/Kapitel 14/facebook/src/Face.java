
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERIK
 */
public class Face {

    private int x, y;

    public Face(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void drawFace(Graphics g){
        g.setColor(Color.pink);
        g.fillOval(x-15, y-15, 30, 30);
        g.setColor(Color.black);
        g.fillOval(x+5, y-5, 5, 5);
        g.fillOval(x-5, y-5, 5, 5);
    }
}
