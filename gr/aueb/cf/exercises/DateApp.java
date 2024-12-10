package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Reads the dates
 */
public class DateApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please insert the day, the month and the year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("The current is %02d/%02d/%04d", day, month, year);
    }
}
