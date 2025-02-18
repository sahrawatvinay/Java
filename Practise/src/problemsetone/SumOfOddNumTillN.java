package problemsetone;

import java.util.Scanner;

public class SumOfOddNumTillN {
    public static void main(String[] args) {
        System.out.println("Enter range: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = sumOfOddNumbersTillRange(range);
        System.out.println("Result: " + sum);
        sc.close();
    }

    public static int sumOfOddNumbersTillRange(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        return sum;
    }
}
