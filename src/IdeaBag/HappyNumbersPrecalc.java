/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdeaBag;

import java.util.*;

/**
 *
 * @author <Jonathan.Poalses>
 */
public class HappyNumbersPrecalc {
        static int[] digits;
        static int num = 0;
        
    public static void testNum() {
        for (int dex = 0; dex < digits.length; dex++) {
            num = num + (char)((digits[dex])*(digits[dex]));
        }
    }
    public static void testHappy() {
        if (num <= 100) {
            happyCheck(num);
            num = 1;
        } else {
        }
    }
    public static void seperator(int input) {
        int length = String.valueOf(input).length();
        digits = new int[length];
        for (int dex = 0; dex < length; dex++) {
            digits[dex] = input % 10;
            input = input / 10;
        }
    }
    public static void main(String[] args) {
        //take in number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be tested: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int input = in.nextInt();
        num = input;
        //seperate number into digits in an array
        seperator(input);
        //test to see if it's happy
        happyCheck(num);
    }
    public static void happyCheck(int input) {
        if (input <= 100) {
            if (input == 1 || input == 2 || input == 5 || input == 6 || input == 9
                     || input == 12 || input == 13 || input == 16 || input == 17
                     || input == 21 || input == 22 || input == 25 || input == 26
                     || input == 29 || input == 32 || input == 33 || input == 36
                     || input == 37 || input == 41 || input == 42 || input == 45
                     || input == 46 || input == 49 || input == 52 || input == 53
                     || input == 56 || input == 57 || input == 61 || input == 62
                     || input == 65 || input == 66 || input == 69 || input == 72
                     || input == 73 || input == 76 || input == 77 || input == 81
                     || input == 82 || input == 85 || input == 86 || input == 89
                     || input == 92 || input == 93 || input == 96 || input == 97
                     || input == 100) {
                System.out.println("Happy!");
            } else {
                System.out.println("Unhappy!");
            }
        } else {
            for (;num >100;) {
                testNum();
                testHappy();
            }
        }
    }
}
