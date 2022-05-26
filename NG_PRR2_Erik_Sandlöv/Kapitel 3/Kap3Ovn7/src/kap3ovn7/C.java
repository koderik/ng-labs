/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kap3ovn7;

/**
 *
 * @author erik.sandlov
 */
public class C {

    public static double sqrt(double x) {
        double ans = 0;
        double guess = x / 3;
        double difference;
        do {

            double tester = x / guess;
            difference = guess - tester;
            if (difference < 0) {
                difference *= -1;
            }
            guess = (guess + tester) / 2;

        } while (difference > C.pow(10, -6));
        ans = guess;
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
}
