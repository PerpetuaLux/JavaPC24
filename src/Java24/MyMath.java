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
public class MyMath {
    
    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }
    
    public static boolean isTriangle(int a, int b, int c) {
        if (a+b < c) {
            return false;
        } else if (a+c < b){
            return false;
        } else if (b+c < a){
            return false;
        }
        return true;
    }
    
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
    
    public static double expSum(double x) {
        return MyMath.multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
    }
    
    public static int ack(int m, int n) {
        if (m == 0) {
            return n+1;
        } else if (m > 0 && n == 0) {
            return ack(m-1, 1);
        } else if (m> 0 && n > 0) {
            return ack(m-1, ack(m, n-1));
        }
        return 0;
    }
    
    public static boolean isPositive(double n) {
        return n * -1 < 0;
    }
    
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (isEven(n)) {
            if (!isPositive(n)) {
                return 1 / pow(x, -n);
            }
            return pow(x, n/2) * pow(x, n/2);
        } if (!isPositive(n)) {
        return 1 / pow(x, -n);
        }
        return x * pow(x, n-1);
    }
}
