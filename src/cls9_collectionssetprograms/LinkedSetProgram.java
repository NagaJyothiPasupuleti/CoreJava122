package cls9_collectionssetprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits=new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("cherry");
		fruits.add("Guva");
		fruits.add("Banana");
		System.out.println(fruits);
		
		Set<Integer> even=new LinkedHashSet<>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		even.add(12);
		even.add(14);
		even.add(16);
		even.add(18);
		even.add(20);
		System.out.println(even);

	}

}
