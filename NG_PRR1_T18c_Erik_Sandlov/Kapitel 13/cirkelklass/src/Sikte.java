
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
public class Sikte {
    private int x, y, radie, bredd;

    public Sikte(int x, int y, int radie) {
        this.x = x;
        this.y = y;
        this.radie = radie;
        this.bredd = radie*2;
        
    }
    public void rita(Graphics g){
        g.setColor(Color.black);
        g.drawOval(x-radie, y-radie, bredd, bredd);
        g.drawLine(x+radie, y+radie, x-radie, y-radie);
        g.drawLine(x-radie, y+radie, x+radie, y-radie);
    }
    
}
