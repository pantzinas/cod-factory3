package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Prints a choice menu and the user selects
 * a menu item and, in turn, depending on the choice,
 * an action is executed.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice is not valid");
                continue;
            }

            doOnChoice(choice);
        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Select one of the followings");
        System.out.println("1. Create");
        System.out.println("2. Deletion");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Insert");
                break;
            case 2:
                System.out.println("Deletion");
                break;
            case 3:
                System.out.println("Search");
                break;
            case 4:
                System.out.println("Update");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
