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
public class Encrypter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to be encrypted: ");
        String input = in.nextLine();
        char[] process = input.toCharArray();
        for (int dex = 0; dex < process.length; dex++) {
            char current = process[dex];
            if (current == ' ') {
                System.out.print(current);
            } else {
                System.out.print((char)(current + 60 + (Math.sqrt(dex))));
            }
        }
        System.out.println();
    }
}
