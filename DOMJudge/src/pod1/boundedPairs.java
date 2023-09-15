package pod1;
import java.util.*;
public class boundedPairs {
	static int getPairsCount(int[] arr, int nUpperbound, int nLowerbound) {
		int nCounter = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] >= nLowerbound && arr[i]+arr[j] <= nUpperbound)
					nCounter++;
			}
		}
		return nCounter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nSize = sc.nextInt();
		int[] arr = new int[nSize];
		for(int i=0; i<arr.length; i++) 
			arr[i] = sc.nextInt();
		int nLowerbound = sc.nextInt();
		int nUpperbound = sc.nextInt();
		int nCountPairs = getPairsCount(arr, nUpperbound, nLowerbound); 
		System.out.println(nCountPairs);
		sc.close();
	}
}
