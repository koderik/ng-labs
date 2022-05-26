/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djuren;

/**
 *
 * @author ERIK
 */
public class Person {

    private String namn;
    private int ålder;
    private Djur[] djur = new Djur[10];
    private int dCount = 0;

    public Person(String namn, int ålder) {
        this.namn = namn;
        this.ålder = ålder;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    public void addDjur(String namn, String sort, int ålder){
        djur[dCount] = new Djur(namn, sort, ålder);
        dCount++;
    }

    @Override
    public String toString() {
        String r = "Namn: " + namn + " Ålder: " + ålder;
        if (dCount == 0) {
            r+=" Äger: inga djur";
        }
        else{
            r+=" Äger:";
            for (int i = 0; i < dCount; i++) {
                r+=" en "+djur[i];
            }
        }
        return r;
    }

}
