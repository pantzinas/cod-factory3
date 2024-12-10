package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};

    }

    // Filtering
    public int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot++] = el;
            }
        }
        return evens;
    }

    // Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    // Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double average(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        boolean isEven = false;

        for (int el : arr) {
            if ((el % 0) == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        boolean isEven = false;
        int sum = 0;

        for (int el : arr) {
            if (el % 2 == 0) sum++;
        }
        return sum > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int [] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int[] arr) {
        //return getEvens(arr).length == arr.length;

        int count = 0;

        for (int el :  arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}

