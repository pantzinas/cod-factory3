package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */

public class BigIntApp {

    public static void main(String[] args) {

        // Declaration and Initializations
        BigInteger bigNum1 = new BigInteger("1232121212121212112");
        BigInteger bigNum2 = new BigInteger("33423432432423432342342");
        BigInteger result; // there is no need for setting new command since it is automatically done through the sum

        // Commands
        result = bigNum1.add(bigNum2);

        // Printing the results
        System.out.printf("%,d ", result);

    }
}
