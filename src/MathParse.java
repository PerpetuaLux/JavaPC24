
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
    public static void count() {
        counting++;
        if (counting >= 0 && counting < length) {
        current = process[counting];
        } else {
            current = '@';
        }
        if (counting >= 1 && counting < length - 2) {
        lastin = process[counting - 1];
        }
        if (counting >= 0 && counting < length - 1) {
        nextin = process[counting + 1];
        }
    }
    public static void num() {
        
        if (current >= 48 && current <= 57) {
            num = (num + current);
            count();
            num();
        }
    }
    
    
    public static void parseMethod(String input) {
        process = input.toCharArray();
        length = process.length;
        count();
        num();
        System.out.println(num);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maths: ");
        String input = in.nextLine();
        parseMethod(input);
        
    }
}
