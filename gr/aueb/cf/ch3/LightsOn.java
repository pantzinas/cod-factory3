package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining AND the car is running (>100) OR it is dark.
 */

public class LightsOn {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isDark = false;
        boolean isCarRunning = false;
        final int MAX_CAR_SPEED = 100;
        boolean areLightsOn = false;
        int speed = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();
        isCarRunning = speed > 100;

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        // LightsOn
        areLightsOn = (isRaining && isCarRunning) || isDark;
        System.out.println("The lights are on: " + areLightsOn);
    }
}
