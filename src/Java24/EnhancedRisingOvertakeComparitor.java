package Java24;

import java.util.Scanner;

public class EnhancedRisingOvertakeComparitor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //enter value for a
        System.out.println("Remember : Enter initial values in descending size (biggest first)");
        System.out.print("Enter number of values to compare: ");
        if (!in.hasNextInt()) {
            String error = in.next();
            System.err.println(error + " is not an int");
            return;
        }
        int num = in.nextInt();
        int[] initial = new int[num];
        int[] increment = new int[num];
        char current = 'a';
        for (int x = 0; num > x ; x++) {
            System.out.printf("Enter initial value of %c:", current);
            if (!in.hasNextInt()) {
                String error = in.next();
                System.err.println(error + " is not an int");
                return;
            }
            initial[x] = in.nextInt();
            System.out.printf("Enter increment of %c:", current);
            if (!in.hasNextInt()) {
                String error = in.next();
                System.err.println(error + " is not an int");
                return;
            }
            increment[x] = in.nextInt();
            current++;
        }
        int[] present = initial.clone();
        int cycles = 0;
        int number = 0;
        boolean check = true;
        while (check) {
            //increment all
            for (int x = 0; num > x ; x++) {
                present[x] = present[x] + increment[x];
            }
            cycles++;
            //compare
            for (int x = 1; num > x ; x++) {
                if (present[x] > present[0]) {
                    check = false;
                    number = x + 1;
                    break;
                }
            }
        }
        System.out.printf("Number %d becomes greater than number 1 at %d cycles\n", number, cycles);
        for (int x = 0; num > x ; x++) {
            System.out.printf("%d = %d at %d cycles\n", x + 1, present[x], cycles);
        }

    }
}
