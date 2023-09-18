package basics;
import java.util.*;
public class ArrayConcepts {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int nSize = sc.nextInt();
			int[] arr = new int[nSize];
			for(int i = 0; i < nSize; i++) 
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			for(int i = 0; i < nSize; i++) 
				System.out.print(arr[i] + " ");
			System.out.println("Array length: "+ arr.length);
			String strName = "Vinay";
			System.out.printf("Hello %s %d",strName, arr[0]);
			System.out.printf("Math PI %.2f",Math.PI);
			sc.close();
		}
		catch(Exception ex) {
			System.out.println("Exception: "+ ex);
		}
		
	}

}
