package gr.aueb.cf.exercises;

import java.util.Scanner;

public class TemperatureAppWithMethod {

    public static void main(String[] args) {
        double tempAtCelcius = 0.00;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a temperature at Celcius");
        tempAtCelcius = in.nextDouble();

        System.out.printf("%.2f degrees of Celcius: %.2f degrees of Fahrenheit", tempAtCelcius, celciusToFahrenheit(tempAtCelcius));
    }

    public static double celciusToFahrenheit(double tempAtCelcius) {
        return tempAtCelcius * 9/5 + (double) 32.00;
    }
}
