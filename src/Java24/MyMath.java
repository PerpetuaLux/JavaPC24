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
        int result = n * recurse;
        return result;
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
    
    public static double[] powArray(double[] a, int n) {
        double[] x = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            x[i] = Math.pow(a[i], n);
        }
        return x;
    }
}
