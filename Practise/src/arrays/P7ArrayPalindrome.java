package arrays;

public class P7ArrayPalindrome {
    public static void checkPalindromeArray(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            if (arr[st] != arr[end]) {
                System.out.println("Not a palindrome");
                return;
            }
            st++;
            end--;
        }
        System.out.println("Array is a palindrome");
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtiliy.inputArray();
        checkPalindromeArray(arr);
    }
}
