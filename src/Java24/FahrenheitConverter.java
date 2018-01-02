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
public class FahrenheitConverter {
    public static void main(String[] args) {
    double input;
    double output;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter temperature in Fahrenheit to convert: ");
    input = in.nextDouble();
    output = (input -32) / 1.8;
    System.out.printf("%f F = %f C\n", input, output);
    }
}
