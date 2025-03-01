package arrays;

public class P102DArraySumAndAverage {
    public static long calculateSum(int[][] arr){
        long sum = 0;
        for(int[] i: arr){
            for(int j: i){
                sum += j;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] array = ArrayUtiliy.input2DArray();
        ArrayUtiliy.print2DArray(array);
        long sum = calculateSum(array);
        int rows = array.length;
        int columns = array[0].length;
        int size = rows * columns;
        double average = (double) sum /size;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
