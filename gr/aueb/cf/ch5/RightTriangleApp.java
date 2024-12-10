package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Check is a triangle is right.
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;

        System.out.println("Please enter b, c, a");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a * a - b * b - c * c) <= EPSILON) {
            System.out.println("The triangle is right");
        } else {
            System.out.println("Triangle is NOT right");
        }
    }
}
