/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2upg1;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author ERIK
 */
public class Kap2Upg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Klassen point skapar en punkt, den har flera konstruktorer");
        System.out.println("Skriver man Point() skapas en punkt i koordinaten (0,0), Point(2,5) skapar en punkt vid koordinaterna (2,5)");
        Point p1 = new Point();
        Point p2 = new Point(2, 5);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("Punkterna går även att flytta runt, vi flyttar p1 till (-3, 7) med hjälp av move eller set location, båda gör samma");
        p1.move(-3, 7);
        System.out.println(p1.toString());
        System.out.println("Klassen punkt har dessutom ärvt funktioner från Point2D, t.ex metoden distance som räknar ut avståndet mellan två punkter");
        double avstånd = p1.distance(p2);
        System.out.println(avstånd);
        System.out.println("En intressant metod är translate som kan flytta en punkts koordinater med de angivna argumenten i x och y led, vi testar att flytta p1 med 5 i x-led och 3 i y-led");
        p1.translate(5, 3);
        System.out.println(p1.toString());
        System.out.println("En Rectangle hör på sätt och vis ihop med punkter, en av rektanglarnas konstruktorer använder sig av just en Point för att ange vart det övre vänstra hörnet ska ligga");
        System.out.println("Förutom en startkoordinat så innehåller en Rectangle en höjd vilket då expanderar rektangeln neråt från startpunkten, och en bredd som expanderar rektangeln åt höger");
        System.out.println("Vi skapar en rektangel som börjar i punkten p2 och är 50 koordinatpunkter hög och 20 bred");
        Rectangle r1 = new Rectangle((int) p2.getX(), (int) p2.getY(), 20, 50);
        System.out.println(r1.toString());
        System.out.println("Detta blev lite krångligare än tänkt eftersom att det inte finns en konstruktor för en Point och höjd och bredd");
        System.out.println("Rectangle har nästan samma funktioner som Point, du kan flytta runt den vänster översta punkten och då följer rektangeln med, translate metoden fungerar också");
        System.out.println("En intressant metod som är värt att visa är inside, den kontrollerar ifall en punkt finns innuti rektangelns area");
        if (r1.inside((int) p1.getX(), (int) p1.getY())) {
            System.out.println("Punkten p1 befinner sig utanför rektangeln");
        } else {
            System.out.println("Punkten p1 finns innuti");
        }
        System.out.println("Vi kan också få rektangeln att växa(eller krympa) med metoden grow, vi får den att krympa 2 på bredden(vardera sida) och växa 3 på höjden(vardera sida), det intressanta är att rektangeln behåller sin mitt och att startkoordinaten ändras med respekt för ökningen av dess storlek");
        r1.grow(-2, 3);
        System.out.println(r1.toString());
        System.out.println("Hoppas ni lärt er lite mer om klasserna Point och Rectangle");
    }

}
