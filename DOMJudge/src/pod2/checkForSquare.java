package pod2;
import java.util.Scanner;
import java.util.ArrayList;
public class checkForSquare {
	static int calculateDistance(String p1, String p2) {
		String[] pt1 = p1.split(" ");
		String[] pt2 = p2.split(" ");
		int x2 = Integer.parseInt(pt2[0]);
		int x1 = Integer.parseInt(pt1[0]);
		int y2 = Integer.parseInt(pt2[1]);
		int y1 = Integer.parseInt(pt2[1]);
		return (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
	static boolean checkIfPointsFormSquare(ArrayList<String> strArrPoints) {
		boolean result = false;
		int AB = calculateDistance(strArrPoints.get(0),strArrPoints.get(3)); 
		int AC = calculateDistance(strArrPoints.get(0),strArrPoints.get(1)); // diagonal
		int AD = calculateDistance(strArrPoints.get(0),strArrPoints.get(2));
		int BC = calculateDistance(strArrPoints.get(3),strArrPoints.get(1));
		int BD = calculateDistance(strArrPoints.get(3),strArrPoints.get(2)); // diagonal
		int CD = calculateDistance(strArrPoints.get(1),strArrPoints.get(2)); 
		if(AB == 0 || BC == 0 || CD == 0 || AD == 0) {
			result = false;
		}
		if ((AB == BC) && (BC == CD) && (CD == AD) && (AB == AD) && (AC == BD)) {
			result = true;
		}
		System.out.println(AB + " " + BC + " " +  CD + " " + AD + " " + AC + " " + BD);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strArrPoints = new ArrayList<String>();
		for(int i=0; i<4; i++)
			strArrPoints.add(sc.nextLine());
		boolean result = checkIfPointsFormSquare(strArrPoints);
		System.out.println(result);
		sc.close();
	}
}
