package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two integers from the
 * standard input (keyboard) and calculates the results.
 */
public class ScannerAddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in); // it could be also at the begging before the initialization

        // Orders
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Printing
        System.out.printf("The sum of %d and %d is equal to %d", num1, num2, sum);
    }
}
