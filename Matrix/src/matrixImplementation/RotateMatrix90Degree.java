package matrixImplementation;
import java.util.Scanner;

public class RotateMatrix90Degree {
	static void rotateMatrixBy90(int arr[][], int r, int c) {
		//first transpose the matrix
		for(int i=0; i<r; i++) {
			for(int j = i+1; j<c; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//after transpose, reverse elements of individual column
		for(int i=0; i<c; i++) {
			int low = 0;
			int high = r - 1;
			while(low < high) {
				int temp = arr[low][i];
				arr[low][i] = arr[high][i];
				arr[high][i] = temp;
				low++;
				high--;
			}
		}
		
		//printing the rotated matrix
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				arr[i][j] = sc.nextInt();
		rotateMatrixBy90(arr,r,c);
		sc.close();
	}

}
