package matrixImplementation;

import java.util.Scanner;

public class BoundaryTraversal {
	static void printBoundaryTraversal(int arr[][], int r, int c) {
		if(r == 1) {
			for(int i=0; i<c; i++)
				System.out.print(arr[0][i] + " ");
		}
		else if(c == 1) {
			for(int i = 0; i < r; i++)
				System.out.print(arr[i][0] + " ");
		}
		else {
			for(int i=0; i<c; i++)
				System.out.print(arr[0][i] + " ");
			for(int i=1; i<r; i++)
				System.out.print(arr[i][c-1] + " ");
			for(int i=c-2; i>=0; i--)
				System.out.print(arr[r-1][i] + " ");
			for(int i=r-2; i>=1; i--)
				System.out.print(arr[i][0] + " ");
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
		printBoundaryTraversal(arr, nRows, nColumns);
		sc.close();
	}

}
