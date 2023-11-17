package strings;

import java.util.HashSet;
import java.util.Scanner;

public class PermutationOfString {
	static HashSet<String> hsset = new HashSet<String>();
	static void printPermutation(String str, String ans) {
		if(str.length() == 0) {
			hsset.add(ans);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutation(ros, ans + ch);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printPermutation(str, "");
		System.out.println(hsset);
		sc.close();
	}

}
