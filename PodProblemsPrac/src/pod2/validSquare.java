package pod2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class validSquare {
	static int getDistance(String[] s1, String[] s2) {
		int x2 = Integer.parseInt(s2[0]);
		int x1 = Integer.parseInt(s1[0]);
		int y2 = Integer.parseInt(s2[1]);
		int y1 = Integer.parseInt(s1[1]);
		return ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	static String checkForValidSquare(ArrayList<String> arrStrPoints) {
		ArrayList<Integer> dist = new ArrayList<Integer>();
		dist.add(getDistance(arrStrPoints.get(0).split(" "), arrStrPoints.get(1).split(" ")));
		dist.add(getDistance(arrStrPoints.get(0).split(" "), arrStrPoints.get(2).split(" ")));
		dist.add(getDistance(arrStrPoints.get(0).split(" "), arrStrPoints.get(3).split(" ")));
		dist.add(getDistance(arrStrPoints.get(1).split(" "), arrStrPoints.get(2).split(" ")));
		dist.add(getDistance(arrStrPoints.get(1).split(" "), arrStrPoints.get(3).split(" ")));
		dist.add(getDistance(arrStrPoints.get(2).split(" "), arrStrPoints.get(3).split(" ")));
		//now out of these 2 will be diagonal lengths and 4 will be sides, put it in hashmap, anything
		//other than this will be error
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for(Integer e: dist) {
			if(!hashmap.containsKey(e))
				hashmap.put(e, 1);
			else
				hashmap.put(e, hashmap.get(e) + 1);
		}
		if(hashmap.size() != 2)
			return "false";
		else {
			for(Map.Entry<Integer, Integer> e : hashmap.entrySet()) {
				if(e.getValue() == 4 || e.getValue() == 2)
					return "true";
			}
		}
		return "false";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrStrPoints = new ArrayList<String>();
		arrStrPoints.add(sc.nextLine());
		arrStrPoints.add(sc.nextLine());
		arrStrPoints.add(sc.nextLine());
		arrStrPoints.add(sc.nextLine());
		String result = checkForValidSquare(arrStrPoints);
		System.out.println(result);
		sc.close();
	}

}
