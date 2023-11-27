package strings;

import java.util.HashSet;
import java.util.Scanner;

public class CombinationOfString {
	static HashSet<String> hsset = new HashSet<String>();
	
    static void getCombination(String str, int idx, String ans) {
        if(str.length() == idx)
        {
        	hsset.add(ans);
            return;
        }
        getCombination(str, idx + 1, ans + str.charAt(idx));
        getCombination(str, idx + 1, ans);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		getCombination(str , 0, "");
		System.out.println(hsset);
		sc.close();
	}
}
