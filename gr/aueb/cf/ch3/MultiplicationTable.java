package gr.aueb.cf.ch3;

/**
 * Returns as an output the multiplication of an integer
 * that the user gives with all the integers from 1 to 10
 */

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int mul = 1;

        System.out.println("Please insert an integer");
        num = in.nextInt();

        while (i <= 10) {
            // System.out.println(num + " * " + i + " = " + (num * i));
            System.out.printf("%d * %2d = %2d\n", num, i, num * i);
            i++;
        }
    }
}
