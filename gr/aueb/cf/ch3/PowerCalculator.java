package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates a ^ power
 */

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        System.out.println("Please insert base and power");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.println("Result: " + result);
    }
}
