/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap11upg1;

/**
 *
 * @author ERIK
 */
public class Triangle {
    
    private int s1, s2, s3;
    
    public Triangle(int s1, int s2, int s3) throws NotRightException {
        if (s1 > s2 && s1 > s3) {
            if (!pythagorasCalc(s1, s2, s3)) {
                throw new NotRightException("Den är inte rät");
            }
        } else if (s2 > s3) {
            if (!pythagorasCalc(s2, s1, s3)) {
                throw new NotRightException("Den är inte rät");
            }
        } else {
           if (!pythagorasCalc(s3, s2, s1)) {
                throw new NotRightException("Den är inte rät");
            }
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public int getOmkrets(){
        return s1+s2+s3;
    }

    private boolean pythagorasCalc(int hyp, int cat1, int cat2) {
        hyp = (int) Math.pow(hyp, 2);
        int cathnånting = (int) (Math.pow(cat1, 2) + Math.pow(cat2, 2));
        if (hyp == cathnånting) {
            return true;
        }
        return false;
    }
}
