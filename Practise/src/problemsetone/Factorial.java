package problemsetone;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int x) {
        int fac = 1;
        for (int i = x; i >= 1; i--)
            fac *= i;
        return fac;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int factorial = factorial(input);
        System.out.println("Factorial: " + factorial);
    }
}
