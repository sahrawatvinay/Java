package problemsetone;

import java.util.Scanner;

// a number is said to be prime if it is divisible by 1 and the number itself
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = checkIfPrimeNumber(num);
        System.out.println(num + " is : " + res);
    }

    public static boolean checkIfPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
