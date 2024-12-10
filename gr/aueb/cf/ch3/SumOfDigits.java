package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of digits of an integer
 */

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Please insert a number");
        inputNum = in.nextInt();
        tempNum = inputNum;

        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /= 10;
        }

        System.out.println("The sum of digits of " + inputNum + " is " + sum);
    }
}
