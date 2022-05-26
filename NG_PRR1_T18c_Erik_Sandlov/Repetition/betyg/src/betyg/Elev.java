/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betyg;

/**
 *
 * @author erik.sandlov
 */
public class Elev {
    private String namn;
    private String klass;
    private Kurs[] k = new Kurs[10];
    private int kCount = 0;

    public Elev(String namn, String klass) {
        this.namn = namn;
        this.klass = klass;
    }
    public void addKurs(String namn, int poäng){
        k[kCount] = new Kurs(namn, poäng);
        kCount++;
    }
    public void setBetyg(int kurs, char betyg){
        k[kurs].setBetyg(betyg);
    }
    
    public void skrivKurs(){
        for (int i = 0; i < kCount; i++) {
            System.out.print(i+1+". ");
            System.out.print(k[i].getNamn()+", "+k[i].getPoäng()+" poäng");
        }
        System.out.println("");
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    

    @Override
    public String toString() {
        return   namn + ", " + klass;
    }
    
    
    
}
