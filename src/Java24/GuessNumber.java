/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between\n1 and 100,"
                + " Can you guess what it is?");
        //enter user guess
        System.out.print("Guess a number: ");
        int guess = in.nextInt();
        System.out.printf("You guessed: %d\n", guess);
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.printf("My number was: %d.\n", number);
        //show how far off you were
        int offset = number - guess;
        if (offset < 0) {
            offset = offset * -1;
        }
        if (offset == 0) {
            System.out.println("You guessed correctly!! Congrats!!");
        } else {
        System.out.printf("You were off by: %d\n", offset);
        }
        
    }
    
}
