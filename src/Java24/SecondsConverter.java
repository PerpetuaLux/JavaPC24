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
public class SecondsConverter {
    public static void main(String[] args) {
        int input;
        int hours;
        int minutes;
        int seconds;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of seconds to be converted: ");
        input = in.nextInt();
        seconds = input % 60;
        minutes = (input / 60) % 60;
        hours = input / 60 / 60;
        System.out.printf("%d Seconds = %d Hours, %d Minutes and %d Seconds\n",
                input, hours, minutes, seconds);
    }
    
}
