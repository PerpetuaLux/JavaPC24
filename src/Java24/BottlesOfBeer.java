/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Scanner;

/**
 *
 * @author <Jonathan.Poalses>
 */
public class BottlesOfBeer {
    public static void chorus(String liquid, int number) {
        if (number == 0){
            System.out.printf("No more bottles of %s on the wall,\n"
                    + "no more bottles of %s\n"
                    + "ya' can't take one down, ya' cant pass it around,\n"
                    + "'cause there are no more bottles of %s on the wall!\n", liquid, liquid, liquid);
            return;
        } else if (number == 1){
            System.out.printf("%d bottle of %s on the wall,\n"
                    + "%d bottle of %s,\n"
                    + "ya' take on down, ya' pass it around,\n"
                    + "%d bottles of %s on the wall.\n\n", number, liquid, number, liquid, number - 1, liquid);
        } else  {
            System.out.printf("%d bottles of %s on the wall,\n"
                    + "%d bottles of %s,\n"
                    + "ya' take on down, ya' pass it around,\n"
                    + "%d bottles of %s on the wall.\n\n", number, liquid, number, liquid, number - 1, liquid);
        }
        number--;
        chorus(liquid, number);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter liquid: ");
        String liquid = in.nextLine();
        System.out.print("Enter number: ");
        int number = in.nextInt();
        chorus(liquid, number);
    }
}
