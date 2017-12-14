/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Base64;
import java.util.Scanner;

/**
 *
 * @author <Jonathan.Poalses>
 */
public class Decrypter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to be decrypted: ");
        String input = in.nextLine();
        System.out.println("Jonathan: " + jonathansOutput(input));
        System.out.println("Dad: " + dadsOutput(input));
    }

    private static String jonathansOutput(String input) {
        StringBuilder sb = new StringBuilder(input.length());

        char[] process = input.toCharArray();
        for (int dex = 0; dex < process.length; dex++) {
            char current = process[dex];
            if (current == ' ') {
                sb.append(' ');
            } else {
                sb.append((char)(current - 60 - (Math.sqrt(dex))));
            }
        }
        return sb.toString();
    }

    private static String dadsOutput(String input) {

        StringBuilder sb = new StringBuilder(input.length());

        char[] process = new String(Base64.getDecoder().decode(input)).toCharArray();
        for (int dex = 0; dex < process.length; dex++) {
            char current = process[dex];
            if (current == ' ') {
                sb.append(' ');
            } else {
                sb.append((char) (current - 60 - (char) (Math.sqrt(dex))));
            }
        }
        return sb.toString();
    }

}
