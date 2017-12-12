/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class FermatCheck {
    public static void checkFermat(int a, int b, int c, int n) {
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2) {
            System.out.println("HOLY SHIT, Fermat was wrong!!");
        } else {
            System.out.println("Nope, that doesn't work");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int a = in.nextInt();
        System.out.print("Enter value for b: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int b = in.nextInt();
        System.out.print("Enter value for c: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int c = in.nextInt();
        System.out.print("Enter value for n: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int n = in.nextInt();
        checkFermat(a,b,c,n);
    }
}
