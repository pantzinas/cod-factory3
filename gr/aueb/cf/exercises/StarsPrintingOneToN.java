package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Prints stars from 1 to N times
 */
public class StarsPrintingOneToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Please enter a number of stars to be printed");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
            if (i == n) break;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
