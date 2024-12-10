package gr.aueb.cf.exercises;

import java.util.Scanner;

public class SquareApp {

    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer number");
        num = in.nextInt();

        System.out.printf("%d ^ 2 = %d", num, square(num));
    }

    public static int square(int num) {
        return num * num;
    }
}
