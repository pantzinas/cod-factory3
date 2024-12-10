package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearize the branched and check error first
 */
public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean success = false;

        while (true) {
            System.out.println("Insert a number to guess the secret");
            num = in.nextInt();

            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Bingo");
            break;
        }
    }
}
