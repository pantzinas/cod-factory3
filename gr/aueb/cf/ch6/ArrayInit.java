package gr.aueb.cf.ch6;

/**
 * Declaration and initialisation of a table
 * Populate
 * - new
 * - unsized init
 * - array initializer
 * - print the table elements
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];  //declare and init
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = new int[] {1, 2, 3, 4, 5};


        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse, diasxisi tou pinaka
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Enhanced for
        for (int el: arr3) {
            System.out.print(el + "");
        }
    }
}
