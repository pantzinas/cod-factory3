package gr.aueb.cf.ch3;

/**
 * There is a secret integer number and the user will try to find it.
 */

import java.util.Scanner;

public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a number to guess the secret");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!!");
        } else {
            System.out.println("Failure!!");
        }
    }
}
