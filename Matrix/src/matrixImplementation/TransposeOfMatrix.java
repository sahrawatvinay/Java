package matrixImplementation;

import java.util.Scanner;

public class TransposeOfMatrix {
	static void transposeMatrix(int arr[][], int r, int c) {
		for(int i=0; i<r; i++)
			for(int j=i+1; j<c; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp; 
			}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
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
		transposeMatrix(arr, nRows, nColumns);
		sc.close();
	}

}
