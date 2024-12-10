package gr.aueb.cf.ch1;

/**
 * Calculates the sum of 2 integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 0;
        int num2 = 12;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση του αποτελέσματος
        System.out.println("the result is: " + result);
        System.out.println("The sum of " + num1 + ", " + num2 + " is equal to: " + result);
        System.out.printf("The sum of %d, %d is equal to: %d", num1,num2, result);
    }
}
