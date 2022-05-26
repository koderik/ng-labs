
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
public class Cirkel {

    private int x, y;
    private Color färg;
    private int radie;

    public Cirkel(int x, int y, Color färg, int radie) {
        this.x = x- (radie);
        this.y = y - (radie);
        this.färg = färg;
        this.radie = radie*2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void rita(Graphics g) {
        g.setColor(färg);
        g.fillOval(x, y, radie, radie);
    }

}
