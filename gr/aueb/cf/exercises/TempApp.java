package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * It converts the Fahrenheit temperature into
 * Celcius temperature (integer numbers)
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempInFah = 0;
        int tempInCel = 0;

        System.out.println("Please insert the temperature in Fahrenheit");
        tempInFah = in.nextInt();

        tempInCel = 5 * (tempInFah - 32) / 9;

        System.out.printf("Temperature in Fahrenheit: %d \nTemperature in Celcius: %d", tempInFah, tempInCel);
    }
}
