package matrixImplementation;
import java.util.Scanner;

public class SpiralTraversal {
	static void printSpiralTraversal(int arr[][], int r, int c) {
		int top = 0, right = c - 1, bottom = r - 1, left = 0;
		while(top <= bottom && left <= right) {
			//traverse top row
			for(int i = left; i <= right; i++) 
				System.out.print(arr[top][i] + " ");
			top++;
			
			//traverse right(last) column
			for(int i = top; i <= bottom; i++) 
				System.out.print(arr[i][right] + " ");
			right--;
			
			//print bottom row
			if(top <= bottom) {
				for(int i = right; i>=left; i--)
					System.out.print(arr[bottom][i] + " ");
				bottom--;
			}
			
			//print left(first) column
			if(left <= right) {
				for(int i = bottom; i>= top; i--)
					System.out.print(arr[i][left] + " ");
				left++;
			}
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
		printSpiralTraversal(arr,r,c);
		sc.close();
	}

}
