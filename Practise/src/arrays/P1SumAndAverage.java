package arrays;

import java.util.Scanner;

public class P1SumAndAverage {
    public static long sumOfElements(int[] arr){
        long sum = 0;
        for(int i: arr)
            sum+=i;
        return sum;
    }
    public static float averageOfElements(int[] arr){
        long sum = sumOfElements(arr);
        return (float) sum /arr.length;
    }
    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        long sumOfElements = sumOfElements(arr);
        float averageOfElements = averageOfElements(arr);
        System.out.println("Sum: " + sumOfElements);
        System.out.println("Average: " + averageOfElements);
    }
}
