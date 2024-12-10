package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Sums only the even numbers
 */

public class SumOfEvens {

    public static void main(String[] args) {
        int i = 2;
        int limit = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the upper limit");
        limit = in.nextInt();

        while (i <= limit) {
            sum += i;
            i += 2;
        }

        System.out.println("The sum of even numbers up to " + limit + " is: " + sum);
    }
}
