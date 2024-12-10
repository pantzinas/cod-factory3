package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Test if a person is eligible for voting based on its age
 */

public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        final int AGE_LIMIT = 18;
        boolean isEligible = false;

        System.out.println("Please insert your age");
        age = in.nextInt();

        // isEligible
        isEligible = age >= AGE_LIMIT;
        System.out.printf("The person is eligible for voting: %b", isEligible);
    }
}
