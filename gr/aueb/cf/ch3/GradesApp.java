package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The users inputs:
 * 1. the grades of the courses
 * 2. the number of the courses
 *
 * and the program calculates the average and will characterize "Excellent"
 * if the average is >= 9, "Very Well" if the average is >= 7 and "Well" if
 * the average is >=5 and "Failur if the average is < 5
 */

public class GradesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert the total marks");
        totalMarks = in.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero.");
            System.exit(1);
        }

        System.out.println("Please insert the courses count");
        coursesCount = in.nextInt();

        if (coursesCount <=0) {
            System.out.println("Courses count must not be negative or zero.");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("The average must be less than or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Well");
        } else if (average >= 5) {
            System.out.println("Well");
        } else {
            System.out.println("Failure");
        }
    }
}
