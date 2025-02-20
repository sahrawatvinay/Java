package problemsetone;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printReverse(num);
        sc.close();
    }

    public static void printReverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        System.out.println("Reversed number : " + rev);
    }
}
