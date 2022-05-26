/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3ovn6;

/**
 *
 * @author erik.sandlov
 */
public class C {

    public static double sin(double x) {
        double test;
        int counter = 3;
        double ans = x;
        int varannan = 0;
        do {

            double counterFact = factorial(counter);

            if (varannan == 0) {
                test = ((C.pow(x, counter)) / counterFact);
                ans -= test;
                varannan++;

            } else {
                test = ((C.pow(x, counter)) / counterFact);
                ans += test;
                varannan--;

            }
            counter += 2;

        } while (test > C.pow(10, -5));

        return ans;
    }

    private static double pow(double x, double exp) {
        double ans = 1;
        if (exp >= 0) {
            for (int i = 0; i < exp; i++) {
                ans *= x;
            }
        } else {
            for (int i = 0; i < exp * -1; i++) {
                ans /= x;
            }
        }

        return ans;
    }

    private static double factorial(double x) {
        double ans = 1;

        for (int i = 1; i <= x; i++) {
            ans *= i;
        }

        return ans;
    }

}
