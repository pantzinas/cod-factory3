package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {
        int a = 10;
        int n = 5;
        System.out.println(power(a, n));
    }

    /**
     * Recursive version of poer app.
     *
     * @param a the base.
     * @param n the power.
     * @return the base raised to the power.
     */
    public static int power(int a, int n) {
        return (n == 0) ? 1 : power(a, n-1) * a;
    }
}
