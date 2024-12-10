package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Receives an iput from the user a
 * 2-digit integer and calculates and prints
 * the sum of its digits.
 * For example. for 15 integer, the sum must be equal t 1 + 5 = 6.
 */
public class DigitSum {

    public static void main(String[] args) {

        int number;
        int firstDigit = 0;
        int secondDigit = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide me with an 2-digit integer number");
        number = in.nextInt();
        firstDigit = number / 10;
        secondDigit = number % 10;
        sum = firstDigit + secondDigit;

        System.out.printf("The sum is equal to %d\n", sum);
    }
}
