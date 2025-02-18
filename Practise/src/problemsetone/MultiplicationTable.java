package problemsetone;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter number for which you want to print table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printTable(num);
        sc.close();
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
