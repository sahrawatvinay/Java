package functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        greet();
        int numOne = readNumber();
        int numTwo = readNumber();
        int sum = calculateSum(numOne, numTwo);
        int sum2 = calculateSum(23, 34); //23 and 34 are arguments here
        System.out.println("Sum: " + sum);
        System.out.println("Sum2: " + sum2);
    }

    public static void greet() {
        System.out.println("Hello, How are you?");
    }

    // a and b are parameters here
    public static int calculateSum(int a, int b) {
        return (a + b);
    }

    public static int readNumber() {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
