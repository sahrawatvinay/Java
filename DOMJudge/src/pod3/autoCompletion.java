package pod3;

import java.util.Scanner;

public class autoCompletion {
	static int getNumberOfCharactersEnteredForEachWord(String str, String[] arr) {
		char[] chArr = str.toCharArray();
		String s = "";
		int nCounter = 0;
		int nResult = 0;
		for(int i=0; i<chArr.length; i++) {
			nCounter = 0;
			s += chArr[i];
			for(int j=0; j<arr.length; j++) {
				if(arr[j].startsWith(s))
					nCounter++;
			}
			if(nCounter == 1 || s.equals(str)) {
				nResult = s.length();
				break;
			}
		}
		return nResult;
	}
	static int getEnteredCharacters(String[] arr) {
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			res += getNumberOfCharactersEnteredForEachWord(arr[i], arr);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] ip = sc.nextLine().split(",");
		int nResult = getEnteredCharacters(ip);
		System.out.println(nResult);
		sc.close();
	}

}