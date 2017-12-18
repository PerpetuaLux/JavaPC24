/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

/**
 *
 * @author <Jonathan.Poalses>
 */
public class Question6 {
    public static double calc(int a, int b) {
//        double c = ((Math.pow(a, 2)) + (Math.pow(b, 2))) / a * b + 1;
        double part1 = (Math.pow(a, 2));
        double part2 = (Math.pow(b, 2));
        int part3 = (a * b) + 1;
        double part4 = part1 + part2;
        double result = part4 / part3;
        if (result % 1 == 0) {
            return result;
        } return -1;
    }
    public static void main(String[] args) {
        for (int x = 10000; x > 0; x--) {
            for (int x2 = 10000; x2 > 0; x2--) {
                double result = calc(x, x2);
                if (result != -1) {
                System.out.printf("%d + %d = %f\n", x, x2, result);
                }
            }
        }
    }
}
