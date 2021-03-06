/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Random;

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
    
    /**
     * Returns boolean value true if the inputted value is even, false otherwise
     * @param a
     * @return Returns boolean value true if the inputted value is even, false otherwise
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
    
    public static double expSum(double x) {
        return MyMath.multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
    }
    
    /**
     * Solves the ackerman function using the two inputted values
     * Note - Don't use values higher that 4 as it will result in a stack
     * overflow error due to the fact that its a dumb function with no
     * practical real-life usage, it's just to prove it can be done.
     * @param m
     * @param n
     * @return Returns the solution to the ackerman function
     */
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
    
    /**
     * Returns boolean true if value is positive, false otherwise
     * @param n
     * @return Returns boolean true if value is positive, false otherwise
     */
    public static boolean isPositive(double n) {
        return n * -1 < 0;
    }
    
    /**
     * Returns the value of the first argument raised to the power of the second argument
     * @param x
     * @param n
     * @return Returns the value of the first argument raised to the power of the second argument
     */
    public static double pow(double x, int n) {
        if (n == 0) return 1;
        else if (isEven(n)) {
            if (!isPositive(n)) {
                return 1 / pow(x, -n);
            }
            return pow(x, n/2) * pow(x, n/2);
        } if (!isPositive(n)) {
        return 1 / pow(x, -n);
        }
        return x * pow(x, n-1);
    }
        /**
     * Returns the value of the first argument raised to the power of the second argument
     * Is the iterative version
     * @param x
     * @param n
     * @return Returns the value of the first argument raised to the power of the second argument
     */

    public static double powI(double x, int n) {
        if (n == 0) {
            return 1;
        }
        int c = n;
        double result = 0;
        double process = x;
        while (c > 1) {
            process = x * process;
            c--;
        }
        return process;
    }
    
    public static double sqrt(double a) {
        double x = a/2;
        double thingy = (x + a/x)/2;
        double test = Math.abs(thingy - x);
        if (Math.abs(thingy - x) == 0.0001) {
        return thingy;
        }
            return xsqrt(thingy);
    }
    
    public static double xsqrt(double a) {
        if (a < 0) {
            return Float.NaN;
        }
        if (a == 0 || a == -0) {
            return 0.0;
        }
        double initialGuess = a/2;
        double process = (initialGuess + a/initialGuess)/2;
        double process2 = (process + a/process)/2;
        while (Math.abs(process - process2) != 0) {
            process = process2;
            process2 = (process + a/process)/2;
        }
        return process2;
        
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n-1);
        return n * recurse;
    }
    public static int ifactorial(int num) {
        int result = 1;
        if(num == 0) {
            return 1;
        }
        else {
            for(int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
    
    public static double exp(double x) {
        int n = 12;
        double process = 1 + x;
        while(n > 0 && n != 1) {
            process = process + (MyMath.pow(x, n)/MyMath.factorial(n));
            n--;
        }
        return process;
    }
    
    public static double gauss(double x) { //this doesn't work I dont think
        int n = 3;
        double result = 1;
        while (n > 0) {
            result += 
                    Math.pow(-1, n) * Math.pow(x, (2 * n))/MyMath.factorial(n);
            n--;
        }
        return result;
    }
    
    /**
     * Returns an array in which each value is equal to each value in the first array raised to n
     * @param a
     * @param n
     * @return Returns an array in which each value is equal to each value in the first array raised to n
     */
    public static double[] powArray(double[] a, int n) {
        double[] x = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            x[i] = Math.pow(a[i], n);
        }
        return x;
    }
    
    /**
     * Returns an array of random integers.
     * @param size
     * @return Returns an array of random integers
     */
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    
    /**
     * Computes the number of array elements in [low, high).
     * @param a
     * @param low
     * @param high
     * @return Number of array elements within range
     */
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }
    
    public static int[] histogram(int[] a, int b) {
        int size = 100 / b;
        int buildup = 0;
        int i = 0;
        int result[] = new int[b];
        while (buildup < 100) {
            result[i]  = inRange(a, buildup, buildup + size);
            i++;
            buildup = buildup + size;
        }
        return result;
    }

    public static int[] letterHist(String input) {
        char[] preput = input.toCharArray();
        int[] result = new int[25];
        for (int a = 0; a < preput.length; a++) {
            int letter = (int)preput[a] - 97;
            if (letter == -65) {
            } else if (letter < 0) {
                letter = letter + 32;
                result[letter] = result[letter] + 1;
            } else {
                result[letter] = result[letter] + 1;
            }
        }
        return result;
    }

    public static int parenthesisCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    
    public static int indexOfMax(double[] a) {
        int max = 0;
        double maxVal = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
                max = i;
            }
        }
        return max;
    }
}
