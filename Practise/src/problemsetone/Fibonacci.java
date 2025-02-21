package problemsetone;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        printFibonacci(range);
    }

    public static void printFibonacci(int range) {
        if (range == 1)
            System.out.println(0);
        else if (range == 2)
            System.out.println(0 + " " + 1);
        else {
            int prev = 0;
            int next = 1;
            System.out.print(prev + " " + next);
            for (int i = 3; i <= range; i++) {
                int nxt = prev + next;
                prev = next;
                next = nxt;
                System.out.print(" " + nxt);
            }
        }
    }
}
