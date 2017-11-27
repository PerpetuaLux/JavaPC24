import java.util.*;
public class Time {
    static Calendar now = Calendar.getInstance();
    static int hour;
    static int minute;
    static int second;
     static void getTime() {
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
     }
    public static void main(String[] args) {
        //get current time
        getTime();
        //calculate seconds since midnight
        int secondsTotal = (hour * 60 * 60) + (minute * 60) + second;
        System.out.println("Seconds since midnight:\n" + secondsTotal);
        //calculate and print seconds left in day
        int secondsLeft = (24 * 60 * 60) - secondsTotal;
        System.out.println("Seconds left in day:\n" + secondsLeft);
    }
}