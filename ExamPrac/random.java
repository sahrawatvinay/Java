public class random {

static void printArray(int[] a){
    for(int i=0; i<a.length; i++){
        System.out.print(a[i] + " ");
    }
    System.out.println();
}

    static void setFourFiveVals(int[] a){
        System.out.println(a);
        a[4] = 4;
        a[5] = 5;
    }

  public static void main(String args[]) {
    int[] scores = new int[10];
    System.out.println(scores.length);

    int[] a1 = { 10, 20, 30 };
    int[] a2 = { 1, 2, 3, 4, 5 };

    System.out.println(a1.length);
    System.out.println(a1[0]);
    a1 = a2;
    System.out.println(a1.length);
    System.out.println(a1[0]);

    char[][] page = new char[30][100];
    System.out.println(page.length);
    System.out.println(page[0].length);

    int[][] table = new int[5][10];
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        table[row][col] = row * 10 + col;
      }
    }
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print(table[row][col] + "\t");
      }
      System.out.println();
    }

    int[] arr =  new int[10];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    printArray(arr);
    setFourFiveVals(arr);
    printArray(arr);
  }
}
