package gr.aueb.cf.ch2;

import java.util.Scanner;
public class EuroUsdConverter {
    public static void main(String[] args) {

        // Declarations and Initializations
        int amountEuro = 0;
        int amountUSD = 0;
        int totalUSD = 0;
        int amountCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        // Orders
        System.out.println("Please provide me with an integer amount in Euro");
        amountEuro = in.nextInt();
        totalUSD = amountEuro * PARITY;
        amountUSD = totalUSD / 100;
        amountCents = totalUSD % 100;

        // Printing
        System.out.printf("%d \u20AC = %d \u0024, %d usa cents", amountEuro, amountUSD, amountCents);
    }
}
