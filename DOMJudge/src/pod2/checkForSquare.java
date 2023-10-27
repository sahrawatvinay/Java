package pod2;
import java.util.Scanner;
import java.util.ArrayList;
public class checkForSquare {
	static double calculateDistance(String p1, String p2) {
		String[] pt1 = p1.split(" ");
		String[] pt2 = p2.split(" ");
		int x2 = Integer.parseInt(pt2[0]);
		int x1 = Integer.parseInt(pt1[0]);
		int y2 = Integer.parseInt(pt2[1]);
		int y1 = Integer.parseInt(pt1[1]);
		int xsq = (x2 - x1) * (x2 - x1);
		int ysq = (y2 - y1) * (y2 - y1);
		return Math.sqrt(xsq + ysq);
	}
	static String checkIfPointsFormSquare(ArrayList<String> strArrPoints) {
		String result = "false";
		double AB = calculateDistance(strArrPoints.get(0),strArrPoints.get(1)); //diagonal
		double AC = calculateDistance(strArrPoints.get(0),strArrPoints.get(2)); 
		double AD = calculateDistance(strArrPoints.get(0),strArrPoints.get(3));
		double BC = calculateDistance(strArrPoints.get(1),strArrPoints.get(2));
		double BD = calculateDistance(strArrPoints.get(1),strArrPoints.get(3)); 
		double CD = calculateDistance(strArrPoints.get(2),strArrPoints.get(3)); //diagonal
		if(AD == 0 || BD == 0 || BC == 0 || AC == 0 || CD == 0 || AB == 0) {
			return "false";
		}
		if ((AD == BD) && (BD == BC) && (BC == AC) && (AC == AD) && (AB == CD)) {
			result = "true";
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strArrPoints = new ArrayList<String>();
		for(int i=0; i<4; i++)
			strArrPoints.add(sc.nextLine());
		String result = checkIfPointsFormSquare(strArrPoints);
		System.out.println(result);
		sc.close();
	}
}