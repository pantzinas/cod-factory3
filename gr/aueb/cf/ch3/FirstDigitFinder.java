package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the first left digit of a number
 * (most significant digit)
 */

public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        int leftDigit = 0;

        System.out.println("Please insert an integer");
        inputNum = in.nextInt();
        tempNum = inputNum;

        while (tempNum >= 10) {
            tempNum /= 10;
        }

        System.out.println("The first digit of " + inputNum + " is " + tempNum);
    }
}
