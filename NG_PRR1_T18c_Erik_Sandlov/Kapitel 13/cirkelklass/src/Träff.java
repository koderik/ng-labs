
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author erik.sandlov
 */
public class Träff {

    private int x, y;

    public Träff(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void rita(Graphics g) {
        g.setColor(Color.pink);
        g.fillOval(x - 6, y - 6, 12, 12);
        g.setColor(Color.black);
        g.drawOval(x - 6, y - 6, 12, 12);
    }
    
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
