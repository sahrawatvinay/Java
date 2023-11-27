package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Random {
	static ArrayList<String> Alpha = new ArrayList<String>();
	
	public static String getFirstAlpha() {
		return Alpha.get(0);
	}
	
	public static void main(String[] args) {
		Alpha.add("x");
		Alpha.add("b");
		Alpha.add("c");
		Alpha.add("e");
		Alpha.add("d");
		System.out.println(getFirstAlpha().toUpperCase());
		// TODO Auto-generated method stub
		ArrayList<String> arrLstStr = new ArrayList<String>();
		arrLstStr.add("abc");
		arrLstStr.add("def");
		arrLstStr.add("ghi");
		arrLstStr.add("jkl");
		arrLstStr.remove(0);
		arrLstStr.remove(arrLstStr.size() - 1);
		arrLstStr.add(1, "xxx");
		arrLstStr.add(0, "yyy");
		System.out.println(arrLstStr);
		System.out.println(arrLstStr.get(2));
		for(String s: arrLstStr)
			System.out.println(s);
		
		ArrayList<Integer> arrLstInt = new ArrayList<Integer>();
		int a = 2;
		int b = 3;
		int c = 4;
		arrLstInt.add(a);
		arrLstInt.add(b);
		arrLstInt.add(c);
		arrLstInt.add(2);
		arrLstInt.add(2);
		arrLstInt.add(2);
		arrLstInt.add(3);
		arrLstInt.add(3);
		Collections.sort(arrLstInt);
		System.out.println(arrLstInt);
		Collections.sort(arrLstInt, Collections.reverseOrder());
		System.out.println(arrLstInt);
		
		Map<Integer, Integer> hsm = new HashMap<>();
		for(Integer i : arrLstInt) {
			if(hsm.containsKey(i)) {
				hsm.put(i, hsm.get(i) + 1);
			}
			else {
				hsm.put(i, 1);
			}
		}
		System.out.println(hsm);
		System.out.println(hsm.get(arrLstInt.get(0)));
		hsm.put(5, 8);
		System.out.println(hsm);
		hsm.put(5, hsm.get(5) + 1);
		System.out.println(hsm);
		for(Map.Entry<Integer, Integer> h : hsm.entrySet()) {
			System.out.println(h.getKey());
			System.out.println(h.getValue());
		}
	}

}
