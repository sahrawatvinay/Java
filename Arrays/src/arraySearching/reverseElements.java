package arraySearching;
import java.util.*;
public class reverseElements {
	static void reverseArrayElements(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while(s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nSize = sc.nextInt();
		int[] arr = new int[nSize];
		for(int i=0; i<nSize; i++)
			arr[i] = sc.nextInt();
		reverseArrayElements(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
