package gr.aueb.cf.ch2;

/**
 * Converts days, hours, minutes, seconds into
 * total seconds. The user inputs the data and the final result
 * is printed
 */
import java.util.Locale;
import java.util.Scanner;
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        // Declaration and Initialization
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        int days;
        int hours;
        int minutes;
        int seconds;
        int totalSeconds;
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide me with the number of days, hours, minutes and seconds");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();
        totalSeconds = days * SEC_PER_DAY + hours * SEC_PER_HOUR + minutes * SEC_PER_MIN + seconds;

        // Printing
        System.out.printf(Locale.US, "The total seconds for %d days, %d hours, %d minutes and %d seconds is equal to %,d seconds\n", days, hours, minutes, seconds, totalSeconds);
    }
}
