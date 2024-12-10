package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * The user inputs a number n of the stars
 * to be printed horizontally
 */
public class StarsPrintingNHorizontal {

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the number of the stars to be printed");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
