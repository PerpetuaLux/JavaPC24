
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
    static int counting = 0;
    static char[] process;
    public static void count() {
        counting++;
        current = process[counting];
        lastin = process[counting - 1];
        nextin = process[counting + 1];
    }
    
    
    public static void parseMethod(String input) {
        process = input.toCharArray();
        current = process[counting];
        nextin = process[counting + 1];
        if (current >= 48 && current <= 57) {
            String num = (current + "" + nextin);
            System.out.println(num);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maths: ");
        String input = in.nextLine();
        parseMethod(input);
        
    }
}
