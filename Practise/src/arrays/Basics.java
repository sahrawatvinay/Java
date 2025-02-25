package arrays;

public class Basics {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[1] = 5;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        String[] strArray = new String[4];
        strArray[1] = "Vinay";
        strArray[3] = "";
        for (String x : strArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        boolean[] boolArr = new boolean[3];
        boolArr[1] = true;
        for (int i = 0; i < boolArr.length; i++) {
            System.out.print(boolArr[i] + " ");
        }
    }
}
