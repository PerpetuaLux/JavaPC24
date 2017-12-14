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
}
