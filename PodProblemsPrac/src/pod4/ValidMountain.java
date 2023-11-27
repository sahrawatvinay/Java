package pod4;

import java.util.Scanner;

public class ValidMountain {
	static boolean checkIfValidMountain(int[] arr) {
		boolean bResult = false;
		int maxIndex = -1;
		int tempMaxIndex = -1;
		int nMax = Integer.MIN_VALUE;
		if(arr.length >= 3) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] > nMax) {
					nMax = arr[i];
					maxIndex = i;
					tempMaxIndex = maxIndex;
				}
			}
			//check if all elements on left are smaller 
			//check if all on left are small 2 to 0
			boolean allSmallOnLeft = true;
			boolean allSmallOnRight = true;
			while(maxIndex >= 1) {
				if(arr[maxIndex - 1] >= arr[maxIndex]) {
					allSmallOnLeft = false;
					break;
				}
				maxIndex--;
			}
			if(allSmallOnLeft) {
				while(tempMaxIndex <= (arr.length - 2)) {
					if(arr[tempMaxIndex + 1] >= arr[tempMaxIndex]) {
						allSmallOnRight = false;
						break;
					}
					tempMaxIndex++;
				}
			}
			bResult = (allSmallOnLeft && allSmallOnRight);
		}
		return bResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nSize = sc.nextInt();
		int[] nArr = new int[nSize];
		for(int i=0 ; i<nSize; i++)
			nArr[i] = sc.nextInt();
		boolean bResult = checkIfValidMountain(nArr);
		System.out.println(bResult);
		sc.close();
	}

}
