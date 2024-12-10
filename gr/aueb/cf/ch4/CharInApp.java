package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Read a char as a byte
 */
public class CharInApp {

    public static void main(String[] args) {
        char ch = ' ';
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character");
//        ch = (char) System.in.read();
        ch = in.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
