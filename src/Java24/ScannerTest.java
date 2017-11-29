package Java24;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class ScannerTest {
        public static void main(String[] args) {
        String name;
        int age;
        double testInt;
        int testDouble;
        String test;
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);

        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
        
        System.out.print("Test out using an integer: ");
        testInt = in.nextDouble();
        System.out.printf("You typed %f\n", testInt);
        in.nextLine();
        System.out.print("What is your name? ");
        test = in.nextLine();
        System.out.printf("Hello %s, age %d\n", test, age);
        System.out.print("Now try using a double: ");
        testDouble = in.nextInt();
        in.nextLine();
        System.out.printf("You typed %d\n", testDouble);
    }

}


