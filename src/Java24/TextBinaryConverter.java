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
public class TextBinaryConverter {
    //the general idea - The decimal number is equal to the sum of binary digits (dn) times their power of 2 (2n):
    //decimal = d0×2^0 + d1×2^1 + d2×2^2 + ...
    static double output= 0.0;
    public static void printIt(char theOutput) {
        if (theOutput == '@') {
            System.out.print(' ');
            output = 0.0;
        } else {
        System.out.print(theOutput);
        output = 0.0;
    }
    }
    public static void binaryConverter(String input) {
        int dex2 = 0;
        //put input into an array
        char[] process = input.toCharArray();
        //compute result peice by peice
        for (int dex = 0; dex < process.length; dex++) {
            //set current value to int
            int current = process[dex];
            //when encountering a space, print output, then reset it for next letter
            if (current == 32) {
                printIt((char)output);
                dex++;
                current = process[dex];
                dex2 = 0;
            }
            //multiply current value(either 0 or 1) by 2^(their position)
            double progress = (current - 48) * Math.pow(2, (7 - (dex2+1)));
            //add the results together
            output = output + progress;
            dex2++;
        }
        //output text
        printIt((char)output);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter binary to be converted: ");
        String input = in.nextLine();
        binaryConverter(input);
        System.out.println();
    }
}
