package arraySearching;
import java.util.*;
public class SecondLargest {
	static int getSecondLargestElement(int[] arr) {
		int nLargest = arr[0];
		int nSecondLargest = Integer.MIN_VALUE;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > nLargest) {
				nSecondLargest = nLargest;
				nLargest = arr[i];
			}
		}
		return nSecondLargest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nSize = sc.nextInt();
		int[] arr = new int[nSize];
		for(int i=0; i<nSize; i++)
			arr[i] = sc.nextInt();
		System.out.println("Second largets element is: " + getSecondLargestElement(arr));
		sc.close();
	}

}
