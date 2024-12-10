package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Prints stars from N to 1 times
 */
public class StarsPrintingNToOne {

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the number of the stars to be printed");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
