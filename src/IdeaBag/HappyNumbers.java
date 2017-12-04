/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdeaBag;

import java.util.*;

/**
 *
 * @author Jonathan
 */
public class HappyNumbers {
        static int[] digits;
        static int num = 0;
        
    public static void testNum() {
        for (int dex = 0; dex < digits.length; dex++) {
            num = num + (char)((digits[dex])*(digits[dex]));
        }
    }
    public static void testHappy() {
            switch (num) {
                case 1:
                    System.out.println("Happy!");
                    break;
                case 4:
                    System.out.println("Unhappy!");
                    break;
                default:
                    break;
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
        int input = in.nextInt();
        //seperate number into digits in an array
        seperator(input);
        //square each digit, then add together
        testNum();
        //test to see if it's happy
        testHappy();
        for (;num != 1 && num != 4;) {
            testNum();
            testHappy();
        }
            System.out.println(num);
    }
}
