package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Prints n vertical and n horizontal stars
 */
public class StarsPrintingNXN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert the number of the stars to be printed");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= n-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
