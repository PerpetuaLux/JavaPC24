package Java24;

import java.util.*;
public class Time {
    static Calendar now = Calendar.getInstance();

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private int hour;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {

        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    private int minute;
    private int second;
    private int secondsTotal = 24 * 60 * 60;
     public Time() {
        this.hour = now.get(Calendar.HOUR_OF_DAY);
        this.minute = now.get(Calendar.MINUTE);
        this.second = now.get(Calendar.SECOND);
     }
/*
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
*/
}