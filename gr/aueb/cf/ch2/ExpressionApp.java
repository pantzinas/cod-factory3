package gr.aueb.cf.ch2;

public class ExpressionApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 1;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        num1++; // the num1 value will be increased by 1 OR num1= num1 + 1 OR num1 += 1
        --num2;

        result1 = num1++;  // assuming  that num1 = 8, result1 = 8, num1 = 9
        result2 = ++num2;  // assuming  that num2 = 8, result2 = 9, num2 = 9

        result1 = result1 *12;
        result1 *= 12;

        System.out.printf("the results are the said: %d sum, %d div", sum, div);


    }
}
