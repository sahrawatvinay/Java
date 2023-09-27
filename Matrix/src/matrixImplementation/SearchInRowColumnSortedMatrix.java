package matrixImplementation;

import java.util.Scanner;

public class SearchInRowColumnSortedMatrix {
	static void searchLocation(int arr[][], int n, int k) {
		int i = 0, j = n - 1; //start search with top right corner
		while(i < n && j >= 0) {
			if(arr[i][j] == k) {
				System.out.println("Element found at: ["+ i + "][" +j+"]" );
				return;
			}
			else if(k > arr[i][j]) // if k is greater than current element move down as all the left side elements will be smaller than current value, no use going there
				i++;
			else // if k is smaller, then search this element on the left side as all the elements down will be greater than current element, then no use going down
				j--;
		}
		System.out.println("Element not found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j] = sc.nextInt();
		System.out.println("Enter element to search for: ");
		searchLocation(arr, n, k);
		sc.close();
	}

}
