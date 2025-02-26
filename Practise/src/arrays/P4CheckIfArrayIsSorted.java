package arrays;

public class P4CheckIfArrayIsSorted {
    public static void checkIfArrayIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        checkIfArrayIsSorted(arr);
    }
}
