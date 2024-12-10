package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to day
 */

public class YearsToDays {

    public static void main(String[] args) {
        // Declaration and initialization of variables
        Scanner scanner = new Scanner(System.in); // instead of Scanner in = new Scanner("System.in) and subsequently age = in.Scanner.nextInt()
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        // Orders
        System.out.println("Please insert the number of years");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        // Printing the results
        System.out.println("Age in years: " + age + ", Age in days: " + days);
    }
}
