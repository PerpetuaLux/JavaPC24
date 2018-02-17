package Java24;

import java.util.Scanner;

public class RisingOvertakeComparitor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //enter value for a
        System.out.print("Enter initial value of a (1 = 1 pence, 100 = £1): ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int initiala = in.nextInt();
        System.out.print("Enter initial value of b (1 = 1 pence, 100 = £1): ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int initialb = in.nextInt();
        System.out.print("Enter increment of a: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int inca = in.nextInt();
        System.out.print("Enter increment of b: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int incb = in.nextInt();
        //process increment
        int currenta = initiala;
        int currentb = initialb;
        int cycles = 0;
        while (currenta > currentb) {
            cycles++;
            currenta = currenta + inca;
            currentb = currentb + incb;
        }
        System.out.println("B will be greater than A after " + cycles + " number of cycles\nAt this " +
                "point a will be " + currenta + " and B will be " + currentb);
    }
}
