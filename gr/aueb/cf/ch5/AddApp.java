package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the sum of two integers
 * by using methods.
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two integer");
        a = in.nextInt();
        b = in.nextInt();

        sum = add(a, b);
        sub = AddApp.sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds two integer
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum o the two integers
     */
    public static int add(int a, int b) {
//        int result = 0;
//        result = a + b;
//        return result;
        return a + b;
    }

    /**
     * Subtracts two integers
     * @param a the first integer to subtract from.
     * @param b the second integer that is subtracted.
     * @return the subtraction of a - b
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}
