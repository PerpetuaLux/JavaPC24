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
 * @author <Jonathan.Poalses>
 */
public class GuessNumber2 {
    static int number = 0;
    static int trys = 0;
    public static void guess(int guess) {
        Scanner in = new Scanner(System.in);
        if (guess > number) {
            System.out.println("Too high");
        } else if (guess < number) {
            System.out.println("Too low");
        }
        System.out.print("Guess again: ");
        int newGuess = in.nextInt();
        trys++;
        if (newGuess == number) {
            System.out.println("Congrats!! You got it right!!");
        }else {
            guess(newGuess);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between\n1 and 100,"
                + " Can you guess what it is?");
        //enter user guess
        System.out.print("Guess a number: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int guess = in.nextInt();
        trys++;
        // pick a random number
        Random random = new Random();
        number = random.nextInt(100) + 1;
        //show how far off you were
        int offset = number - guess;
        if (offset != 0) {
            guess(guess);
        }
        if (offset == 0) {
            System.out.println("You guessed correctly!! Congrats!!");
        }
        System.out.printf("My number was: %d.\n", number);
        System.out.printf("It took you %d attempts.\n", trys);
        
    }
    
}
