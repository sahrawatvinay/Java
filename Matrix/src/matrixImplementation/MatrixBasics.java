package matrixImplementation;
import java.util.Scanner;
public class MatrixBasics {
	static void printMatrix(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nRows = sc.nextInt();
		int nColumns = sc.nextInt();
		int arr[][] = new int[nRows][nColumns];
		for(int i=0; i<nRows; i++)
			for(int j=0; j<nColumns; j++)
				arr[i][j] = sc.nextInt();
		printMatrix(arr);
		sc.close();
	}
}
