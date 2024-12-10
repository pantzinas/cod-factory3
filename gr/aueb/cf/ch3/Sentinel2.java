package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        int positivesCount = 0;
        int inputNum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a number");

        while ((inputNum = in.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("Please insert a number");
        }

        System.out.println("Positives count: " + positivesCount);
    }
}
