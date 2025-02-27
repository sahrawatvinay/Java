package arrays;

/// 3 pointers
/// we will maintain 3 pointers i and j points to the 1st elem of arrays resp.
/// compare the elements i and j, whichever is smaller, put it at k index which is for merged array
/// keep incrementing k and i/j, to compare following elements
/// extra checks if length of arrays not same
public class P8MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2, int[] mergedArr) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            // 1st cond, if j has reached end, just insert elements at i
            // 2nd cond, compare elements only if there are elements in 1st array, otherwise short circuit and enter elements in 2nd array
            if (j == arr2.length ||
                    (i < arr1.length && (arr1[i] < arr2[j]))) {
                mergedArr[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        ArrayUtiliy.printArray(mergedArr);
    }

    public static void main(String[] args) {
        int[] arr1 = ArrayUtiliy.inputArray();
        int[] arr2 = ArrayUtiliy.inputArray();
        int[] mergedArr = new int[arr1.length + arr2.length];
        merge(arr1, arr2, mergedArr);
    }
}
