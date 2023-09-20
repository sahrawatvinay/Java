package collections;
import java.util.*;
public class arrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		for(Integer i:list) {
			System.out.println(i);
			Class<?> objClass = i.getClass(); 
			System.out.println(objClass);
		}
		list.size();
		list.get(2);
		list.add(1,9);
		System.out.println(list);
		list.set(0, 69);
		list.remove(list.size()-1);
		System.out.println(list);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
