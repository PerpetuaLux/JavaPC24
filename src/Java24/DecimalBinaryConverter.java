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
        //put input into an array
        char[] process = input.toCharArray();
        //compute result
        for (int dex = 0; dex < process.length; dex++) {
            //set current value to int
            int current = process[dex];
            //multiply current value(either 0 or 1) by 2^(their position)
            double progress = (current - 48) * Math.pow(2, (process.length - dex));
            //add the results together
            output = output + progress;
        }
        //output decimal number
        System.out.println(output);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter binary to be converted: ");
        String input = in.nextLine();
        binaryConverter(input);
    }
}
