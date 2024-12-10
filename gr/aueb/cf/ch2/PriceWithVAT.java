package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price including VAT
 */

public class PriceWithVAT {

    public static void main(String[] args) {
        double price = 0.0;
        double finalPrice = 0.0;
        final double VAT_RATE = 0.24;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the price");
        price = in.nextDouble();
        finalPrice = price * (1 + VAT_RATE);

        System.out.printf("Price: %.2f, Price (including VAT): %.2f", price, finalPrice);
    }

}
