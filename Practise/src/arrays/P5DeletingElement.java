package arrays;

import java.util.Scanner;

public class P5DeletingElement {
    public static int[] returnNewArrayAfterDeletion(int[] arr, int num) {
        int count = 0;
        for (int i : arr)
            if (i == num)
                count++;
        if (count == 0)
            return arr;
        int newSize = arr.length - count;
        int[] newArr = new int[newSize];
        int ctrNewArr = 0;
        for (int i : arr) {
            if (i != num) {
                newArr[ctrNewArr] = i;
                ctrNewArr++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be deleted");
        int num = sc.nextInt();
        int[] resArr = returnNewArrayAfterDeletion(arr, num);
        for (int i : resArr)
            System.out.print(i + " ");
    }
}
