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
public class CelsiusConverter {
    public static void main(String[] args) {
    double input;
    double output;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter temperature in Celsius to convert: ");
    input = in.nextDouble();
    output = input * (9.0/5.0) + 32;
    System.out.printf("%f C = %f F\n", input, output);
    }
}
