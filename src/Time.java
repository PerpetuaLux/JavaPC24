import java.util.*;
public class Time {
    static Calendar now = Calendar.getInstance();
    static int hour;
    static int minute;
    static int second;
    static int secondsTotal = 24 * 60 * 60;
     static void getTime() {
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
     }
    public static void main(String[] args) {
        //get current time
        getTime();
        //calculate seconds since midnight
        int secondsSoFar = (hour * 60 * 60) + (minute * 60) + second;
        System.out.println("Seconds since midnight:\n" + secondsSoFar);
        //calculate and print seconds left in day
        int secondsLeft = secondsTotal - secondsSoFar;
        System.out.println("Seconds left in day:\n" + secondsLeft);
        //calculate and print the percentage of the day that has passed
        int percent = ((100 * secondsTotal - 100 * secondsLeft) / secondsTotal);
        System.out.println("The percentage of the day that has passed is:\n"
        + percent + "%");
    }
}