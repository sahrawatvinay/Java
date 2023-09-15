package pod1;
import java.util.*;
public class identicalArrays {
	static String checkIfArraysCanBeMadeIdentical(int[] arr1, int[] arr2, int size) {
		String result = "NO";
		int counter = 0;
		int[] arrDissimilarIndexes = new int[size];
		int nDissimilarArrayIndex = 0;
		for(int i=0; i<size; i++) {
			if(arr1[i] != arr2[i]) {
				counter++;
				arrDissimilarIndexes[nDissimilarArrayIndex] = i;
				nDissimilarArrayIndex++;
			}
		}
		if(counter == 0) {
			//do nothing
			result = "YES";
		}
		else if(counter == 2) {
			if(arr1[arrDissimilarIndexes[0]] == arr2[arrDissimilarIndexes[1]] && arr2[arrDissimilarIndexes[0]] == arr1[arrDissimilarIndexes[1]]) {
				result = "YES";
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nSize = sc.nextInt();
		int[] arr1 = new int[nSize];
		int[] arr2 = new int[nSize];
		for(int i=0; i<arr1.length; i++) 
			arr1[i] = sc.nextInt();
		for(int i=0; i<arr2.length; i++) 
			arr2[i] = sc.nextInt();
		sc.close();
		String result = checkIfArraysCanBeMadeIdentical(arr1, arr2, nSize);
		System.out.println(result);
	}

}
