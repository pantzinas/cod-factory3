package gr.aueb.cf.exercises;


import java.util.Scanner;

/**
 * Menu App including a validation of the choice
 */
public class MenuSelectionApp {

    public static void main(String[] args) {
        int choice = 0;
        Scanner in = new Scanner(System.in);


        while (choice != 5) {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            System.out.println("Please insert a choice 1 - 5");
            choice = in.nextInt();

            if (choice <= 0 || choice >5) {
                System.out.println("Your insert is false. Please insert again a choice 1 - 5");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");
                    break;
                default:
                    System.out.println("Έξοδος");
            }
        }

    }
}
