package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Checks whether a year is leap or not
 */
public class LeapYearApp {

    public static void main(String[] args) {
        int year = 0;
        boolean isLeapYear = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a year");
        year = in.nextInt();
//        if (((year % 4) == 0) && ((year % 100) != 0)) {
//            isLeapYear = true;
//        } else if ((year % 400 == 0)) {
//            isLeapYear = true;
//        }

        isLeapYear = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);

        System.out.printf("The year %d is leap: %b", year, isLeapYear);
    }
}
