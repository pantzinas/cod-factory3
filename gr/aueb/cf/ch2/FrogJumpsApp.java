package gr.aueb.cf.ch2;

import java.util.Scanner;

import static java.lang.Math.ceil;

/**
 * X = 10
 * Y = 85
 * D = 30
 * Jumps = 3
 * 40, 70, 100
 */

public class FrogJumpsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = 0;
        int start = 0;
        final int HOP = 30;
        int jumps = 0;

        System.out.println("Please insert the current position and target position of the frog");
        start = in.nextInt();
        target = in.nextInt();

        jumps = (int) Math.ceil(((target - start) / (double) HOP));

        System.out.println("Jumps: " + jumps);
    }
}
