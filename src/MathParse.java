
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author <Jonathan.Poalses>
 */
public class MathParse {
    static char current = 'a';
    static char lastin = 'a';
    static char nextin = 'a';
    static int counting = -1;
    static char[] process;
    static String num = ("");
    static int length;
    static int position;
    static int currentInt;
    static int nextInt;
    public static void count() {
        counting++;
        if (counting >= 0 && counting < length) {
        current = process[counting];
        } else {
            current = '@';
        }
        if (counting >= 1 && counting < length - 2) {
        lastin = process[counting - 1];
        } else {
            lastin = '@';
        }
        if (counting >= 0 && counting < length - 1) {
        nextin = process[counting + 1];
        } else {
            nextin = '@';
        }
    }
    public static int num() {
        if (current >= 48 && current <= 57) {
            num = (num + current);
            count();
            num();
        }
        return Integer.parseInt(num);
    }
    public static int checkCurrent() {
        if (current >= 48 && current <= 57) {
            return 0;
        } else if (current == '-') {
            return 1;
        } else if (current == '+') {
            return 2;
        } else return -1;
    }
    public static void subtract() {
        count();
        nextInt = num();
        currentInt = currentInt - nextInt;
    }
    public static void add() {
        count();
        nextInt = num();
        currentInt = currentInt + nextInt;
    }
    public static void parseMethod(String input) {
        process = input.toCharArray();
        length = process.length;
        count();
        for (;counting < length;) {
        int activeType = checkCurrent();
            if (activeType == 0) {
                currentInt = num();
                num = ("");
            } else if (activeType == 1) {
                subtract();
            } else if (activeType == 2) {
                add();
            } else if (activeType == -1) {
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maths: ");
        String input = in.nextLine();
        parseMethod(input);
        System.out.println("= " + currentInt);
    }
}
