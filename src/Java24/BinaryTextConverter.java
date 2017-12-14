/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Scanner;

/**
 *
 * @author <Jonathan.Poalses>
 */
public class BinaryTextConverter {
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
    private static void convertBinary(String input) {
        int binary;
        char[] process = input.toCharArray();
        for (int dex = 0; dex < process.length; dex++) {
            char current = process[dex];
            binary = (int)current;
            displayBinary(binary);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to be converted: ");
        String input = in.nextLine();
        convertBinary(input);
        System.out.println();
    }
}
