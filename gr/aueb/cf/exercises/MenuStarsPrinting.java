package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Appears a menu of 6 choices related to
 * different stars printing choices.
 */
public class MenuStarsPrinting {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int n = 0;

        while (choice!=6) {
            printingMenu();
            choice = choiceSelection(choice);

            if (choice != 6) {
                System.out.println("Please insert the number of the stars to be printed");
                n = in.nextInt();
            }

            switch (choice) {
                case 1:
                    printNStarsHorizontally(n);
                    break;
                case 2:
                    printNStarsVertically(n);
                    break;
                case 3:
                    printNxNStars(n);
                    break;
                case 4:
                    printFrom1ToNStars(n);
                    break;
                case 5:
                    printFromNTo1Stars(n);
                    break;
                default:
                    System.out.println("You selected Exit");
                    break;
            }
        }
    }

    public static void printingMenu() {
        System.out.println("1.\tΕμφάνισε n αστεράκια οριζόντια");
        System.out.println("2.\tΕμφάνισε n αστεράκια κάθετα");
        System.out.println("3.\tΕμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4.\tΕμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5.\tΕμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6.\tΈξοδος από το πρόγραμμα");
    }

    public static int choiceSelection(int choice) {
        System.out.println("Please insert a choice from 1 to 6");
        choice = in.nextInt();
        while (choice < 1 || choice > 6) {
            System.out.println("Your input is wrong. Please insert an option from 1 to 6.");
            choice = in.nextInt();
        }
        return choice;
    }

    public static void printNStarsHorizontally(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printNStarsVertically(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void printNxNStars(int n) {
        for (int i = 0; i < n; i++) {
            printNStarsHorizontally(n);
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    public static void printFrom1ToNStars(int n) {
        for (int i = 0; i < n; i++) {
            printNStarsHorizontally(i+1);
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    public static void printFromNTo1Stars(int n) {
        for (int i = 0; i < n; i++) {
            printNStarsHorizontally(n-i);
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
