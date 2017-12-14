/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java24;

import java.util.Calendar;

/**
 *
 * @author <Jonathan.Poalses>
 */
public class Date {
        public static void printAmerican(int date, int year, String dayName,
                String monthName) {
            System.out.println("American Format: ");
            System.out.printf("%s, %s %d, %d\n", dayName, monthName, date, year);
        }
        public static void printEuropean(int date, int year, String dayName,
                String monthName) {
            System.out.println("European Format: ");
            System.out.printf("%s, %d %s, %d\n", dayName, date, monthName, year);
        }
        public static void main(String[] args) {
            Calendar now = Calendar.getInstance();
            // set the current time
            int day = now.get(Calendar.DAY_OF_WEEK);
            int month = now.get(Calendar.MONTH);
            int date = now.get(Calendar.DAY_OF_MONTH);
            int year = now.get(Calendar.YEAR);
            String monthName = ("wrong");
            String dayName = ("wrong");
            // set the name of the day
            switch (day) {
                case 1:
                    dayName = ("Monday");
                    break;
                case 2:
                    dayName = ("Tuesday");
                    break;
                case 3:
                    dayName = ("Wednesday");
                    break;
                case 4:
                    dayName = ("Thursday");
                    break;
                case 5:
                    dayName = ("Friday");
                    break;
                case 6:
                    dayName = ("Saturday");
                    break;
                case 7:
                    dayName = ("Sunday");
            }
            // set the name of the month
            switch (month) {
                case 1:
                    monthName = ("January");
                    break;
                case 2:
                    monthName = ("February");
                    break;
                case 3:
                    monthName = ("March");
                    break;
                case 4:
                    monthName = ("April");
                    break;
                case 5:
                    monthName = ("May");
                    break;
                case 6:
                    monthName = ("June");
                    break;
                case 7:
                    monthName = ("July");
                    break;
                case 8:
                    monthName = ("August");
                    break;
                case 9:
                    monthName = ("September");
                    break;
                case 10:
                    monthName = ("October");
                    break;
                case 11:
                    monthName = ("November");
                    break;
                case 12:
                    monthName = ("December");
            }
            printAmerican(date, year, dayName, monthName);
            printEuropean(date, year, dayName, monthName);
        }
}
