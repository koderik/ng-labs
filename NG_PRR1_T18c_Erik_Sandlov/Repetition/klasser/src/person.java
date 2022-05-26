/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik.sandlov
 */
public class person {
    private String namn;
    private int ålder;
    private husdjur[] djur = new husdjur[10];
    private int dCount = 0;

    public person(String namn, int ålder) {
        this.namn = namn;
        this.ålder = ålder;
    }
    public void köpDjur(String namn, String sort, int ålder){
        djur[dCount] = new husdjur(namn, sort, ålder);
        dCount++;
    }

    public String getNamn() {
        return namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public husdjur[] getDjur() {
        return djur;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    public void skrivDjur(){
        for (int i = 0; i < dCount; i++) {
            System.out.println(djur[i].getNamn()+", "+djur[i].getSort()+" som är "+djur[i].getÅlder()+" år gammal");
        }
    }
}
