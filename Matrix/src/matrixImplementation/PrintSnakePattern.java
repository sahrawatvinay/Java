package matrixImplementation;
import java.util.Scanner;

public class PrintSnakePattern {
	static void printSnakePattern(int arr[][], int r, int c) {
		for(int i = 0; i<r; i++) {
			if(i%2 == 0) { //print left to right
				for(int j=0; j<c; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else { //print right to left
				for(int j = c - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nRows = sc.nextInt();
		int nColumns = sc.nextInt();
		int arr[][] = new int[nRows][nColumns];
		for(int i=0; i<nRows; i++)
			for(int j=0; j<nColumns; j++)
				arr[i][j] = sc.nextInt();
		printSnakePattern(arr, nRows, nColumns);
		sc.close();
	}

}
