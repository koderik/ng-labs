/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package övningsprov.pkg2;

/**
 *
 * @author erik.sandlov
 */
public class Övningsprov2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person a = new Person("Kent", "200203229152");
        Person b = new Person("Fanny", "2020203229122");
        Bilägare c = new Bilägare("Morris", "209903229151");
        System.out.println(b.toString());
        a.läggTillPartner(c);
        System.out.println(a.toString());
        c.läggTillBarn(b);
        c.läggTillBarn(a);
        c.läggTillBarn(a);
        c.läggTillBarn(c);
        Bil d = new Bil("Mercedes", "C63", 650000, 2300, "AXY222");
        Bil f = new Bil("Skoda", "Fabia", 23000, 1100, "CUK612");
        c.köp(d);
        c.köp(f);
        c.läggTillPartner(b);
        System.out.println(c.toString());
        System.out.println(c.totalVärdePåBilar() + "kr");
        System.out.println(Fordon.antalFordon);

    }

}
