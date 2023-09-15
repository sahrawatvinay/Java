package pod1;
import java.util.*;
public class minimumCharacterShifts {
	static int getNumberOfTries(String str1, String str2) {
		int result = -1;
		char[] chArray = str1.toCharArray();
		if(str1.equals(str2)) 
			return 0;
		else {
			int nTry = 1;
			while(nTry <= chArray.length) {
				char temp = chArray[0];
				for(int i=1; i<chArray.length; i++) {
					chArray[i-1] = chArray[i];
				}
				chArray[chArray.length - 1] = temp;
				String strCompare = new String(chArray);
				if(strCompare.equals(str2)) {
					result = nTry;
					break;
				}
				nTry++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] inp = sc.nextLine().split(" ");
		String str1 = inp[0];
		String str2 = inp[1];
		sc.close();
		int nNumberOfTries = getNumberOfTries(str1.toLowerCase(), str2.toLowerCase());
		System.out.println(nNumberOfTries);
	}

}
