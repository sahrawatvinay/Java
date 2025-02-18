package problemsetone;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = sumOfDigits(input);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int dig = num % 10;
            sum += dig;
            num = num / 10;
        }
        return sum;
    }
}
