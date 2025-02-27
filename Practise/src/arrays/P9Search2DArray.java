package arrays;

import java.util.Scanner;

public class P9Search2DArray {
    public static void searchIn2DArray(int[][] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == num) {
                    System.out.println("Found at : arr[" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[][] array = ArrayUtiliy.input2DArray();
        ArrayUtiliy.print2DArray(array);
        System.out.println("Enter element to search");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        searchIn2DArray(array, num);
    }
}
