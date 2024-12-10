package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Prints a number n of stars vertically
 */
public class StarsPrintingNVertical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Please enter the number of stars to be printed");
        n = scanner.nextInt();

        for (int i = 1; i<= n; i++) {
            System.out.println("*");
        }
    }
}
