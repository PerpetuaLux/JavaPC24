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
public class HappyNumbers100 {
        static int[] digits;
        static int num = 0;
        
    public static void testNum() {
        for (int dex = 0; dex < digits.length; dex++) {
            num = num + (char)((digits[dex])*(digits[dex]));
        }
    }
    public static void testHappy(int input) {
            switch (num) {
                case 1:
                    System.out.println(input + " = Happy!");
                    break;
                case 4:
                    System.out.println(input + " = Unhappy!");
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
        for (int dex = 1; dex <= 100; dex++) {
            //take in number
            Scanner in = new Scanner(System.in);
            System.out.print("Number: ");
            int input = dex;
            //seperate number into digits in an array
            seperator(input);
            //square each digit, then add together
            testNum();
            //test to see if it's happy
            testHappy(input);
            for (;num != 1 && num != 4;) {
                testNum();
                testHappy(input);
            }
        }
    }
}
