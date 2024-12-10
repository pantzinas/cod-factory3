package gr.aueb.cf.ch2;

/**
 * It appears the types od integers,
 * int, byt short, long along with their size,
 * and the respective range (min,max).
 */

public class IntApp {

    public static void main(String[] args) {
        System.out.printf("int:Size: %d bits, Min: %,d, Max: %,d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d bits, Min: %,d, Max: %,d\n" , Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d bits, Min: %,d, Max: %,d\n" , Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Siz" +
                "+" +
                "e: %d bits, Min: %,d, Max: %,d\n" , Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }

}
