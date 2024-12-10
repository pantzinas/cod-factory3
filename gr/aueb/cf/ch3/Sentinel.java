package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the positives' count
 */

public class Sentinel {
    public static void main(String[] args) {
        int positivesCount = 0;
        int inputNum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a number");
        inputNum = in.nextInt();

        while (inputNum>=0) {
            positivesCount++;
            System.out.println("Please insert a number");
            inputNum = in.nextInt();
        }

        System.out.println("Positives count: " + positivesCount);
    }
}
