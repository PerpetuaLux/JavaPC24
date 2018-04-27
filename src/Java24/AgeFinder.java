package Java24;

import java.util.*;

public class AgeFinder {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_YEAR);
        int year = now.get(Calendar.YEAR);
        System.err.println(day);
        System.err.println(year);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Year of Birth: ");
        int birthYear = in.nextInt();
        System.out.print("Enter Month of Birth: ");
        int birthMonth = in.nextInt();
        System.out.print("Enter Day of Birth: ");
        int birthDay = in.nextInt();
        int outputYear = (year - birthYear);
        int outputDay = (day - birthDay - ((birthMonth - 1) * 30));
        System.out.println("Age:");
        System.out.println("Years: " + outputYear);
        System.out.println("Days: " + outputDay);
    }
}
