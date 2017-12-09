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
public class BinaryConverter {
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be converted: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int input = in.nextInt();
        displayBinary(input);
        System.out.println();
    }
}
