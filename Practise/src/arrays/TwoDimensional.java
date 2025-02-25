package arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] stud_marks = new int[3][4];
        int[][] stud_marks_inline = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int[] ints : stud_marks_inline) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < stud_marks_inline.length; i++) {
            for (int j = 0; j < stud_marks_inline[i].length; j++) {
                System.out.print(stud_marks_inline[i][j] + " ");
            }
            System.out.println();
        }

    }
}
