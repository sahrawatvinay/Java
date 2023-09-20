package collections;
import java.util.*;
public class stackImplementation {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<String>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Horse");
		animals.push(null);
		System.out.println(animals);
		System.out.println(animals.get(animals.size() - 1));
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.add(0, "Giraffe");
		System.out.println(animals);
		animals.remove(2);
		System.out.println(animals);
		animals.clear();
		System.out.println(animals);
	}
}
