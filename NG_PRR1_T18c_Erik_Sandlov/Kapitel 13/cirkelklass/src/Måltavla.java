
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
public class Måltavla {

    private int x, y, radie;
    private Cirkel[] cirklar;
    private Color[] färg;
    private int points = 0;

    public Måltavla(int x, int y, int radie) {
        Color[] färg = {Color.WHITE, Color.BLACK, Color.blue, Color.red, Color.yellow};
        this.radie = radie;

        cirklar = new Cirkel[5];
        this.x = x;
        this.y = y;
        for (int i = 0; i < cirklar.length; i++) {
            cirklar[i] = new Cirkel(x, y, färg[i], (int) (radie * (1 - i * 0.2)));
        }
    }

    public void rita(Graphics g, Träff[] träffar, int hit) {
        for (int i = 0; i < cirklar.length; i++) {
            cirklar[i].rita(g);
        }
        g.setColor(Color.BLACK);
        g.drawOval(x - radie, y - radie, radie * 2, radie * 2);
        for (int i = 0; i < hit; i++) {
            
            träffar[i].rita(g);
        }
        
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

    

    public int getPoints(Träff[] träffar, int hit) {
        points=0;
        for (int i = 0; i < hit; i++) {
            double distance = Math.sqrt(Math.pow((this.y - träffar[i].getY()), 2) + Math.pow((this.x - träffar[i].getX()), 2));
            for (int j = 0; j < 5; j++) {
                if(distance>=this.radie*(1 - j * 0.2)){
                    points+=j;
                    break;
                }
                if(distance<this.radie*(1 - 4 * 0.2)){
                    points+=5;
                    break;
                }
            }
        }
        return points;
    }
}
