package gr.aueb.cf.ch2;

/**
 * Random class demo,, random range between a range
 */

public class RandomApp {

    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1; // the math.random return double that why we convert into int
        System.out.println(die);
    }
}