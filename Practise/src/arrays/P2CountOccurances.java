package arrays;

import java.util.Scanner;

public class P2CountOccurances {
    public static int countOccurences(int[] arr, int num) {
        int ctr = 0;
        for (int j : arr) {
            if (j == num)
                ctr++;
        }
        return ctr;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        System.out.println("Enter number to find and count it's occurence: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = countOccurences(arr, num);
        System.out.println("Number " + num + " is found " + count + " times.");
    }
}
