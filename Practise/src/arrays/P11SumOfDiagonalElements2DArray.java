package arrays;

import java.lang.reflect.Array;

public class P11SumOfDiagonalElements2DArray {
    /// checking all elements on the left diagonal
    /// take pointer keep incrementing till you get max number of rows
    public static int sumOfLeftDiagonal(int[][] arr) {
        int idx = 0;
        int sum = 0;
        while (idx < arr.length) {
            sum += arr[idx][idx];
            idx++;
        }
        return sum;
    }

    /// in case of right diagonal, idx on left keeps incrementing, right keeps decrementing
    /// loop accordingly
    public static int sumOfRightDiagonal(int[][] arr) {
        int col = arr.length - 1;
        int row = 0;
        int sum = 0;
        while (row < arr.length) {
            sum += arr[row][col];
            row++;
            col--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = ArrayUtiliy.input2DArray();
        ArrayUtiliy.print2DArray(arr);
        int sumOfLeftDiagonal = sumOfLeftDiagonal(arr);
        int sumOfRightDiagonal = sumOfRightDiagonal(arr);
        int sumOfDiagonalElements = sumOfLeftDiagonal + sumOfRightDiagonal;
        if (arr.length % 2 != 0) {
            int idx = arr.length / 2;
            sumOfDiagonalElements -= arr[idx][idx];
        }
        System.out.println("Sum of diagonal elements: " + sumOfDiagonalElements);
    }
}
