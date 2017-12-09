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
public class DecimalBinaryConverter {
    public static void binaryConverter(String input) {
            double output= 1.0;
        
        char[] process = input.toCharArray();
        for (int dex = 0; dex < process.length; dex++) {
            char current = process[dex];
            double progress = (current - 48) * Math.pow(2, process.length);
            output = output + progress;
        }
            System.out.print(output);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter binary to be converted: ");
        String input = in.nextLine();
        binaryConverter(input);
        System.out.println();
    }
}
