package arrays;

import java.util.Scanner;

public class ArrayUtiliy {
    public static int[] inputArray(){
        System.out.println("Enter size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
