package arrays;

public class P6ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        reverseArray(arr);
    }
}
