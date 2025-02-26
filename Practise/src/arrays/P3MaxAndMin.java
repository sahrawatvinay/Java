package arrays;

public class P3MaxAndMin {
    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }

    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr)
            if (i < min)
                min = i;
        return min;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        int max = getMax(arr);
        int min = getMin(arr);
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }
}
