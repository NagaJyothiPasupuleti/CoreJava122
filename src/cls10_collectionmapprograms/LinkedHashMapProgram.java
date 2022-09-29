package cls10_collectionmapprograms;

import java.util.Iterator;
import java.util.LinkedHashMap;


public class LinkedHashMapProgram {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer>laptops=new LinkedHashMap<String,Integer>();
		laptops.put("Asus", 25000);
		laptops.put("Hp", 60000);
		laptops.put("Dell", 30000);
		laptops.put("Lenovo", 29000);
		laptops.put("Apple", 46000);
		laptops.put("Acer", 35000);
		System.out.println(laptops);
		System.out.println(laptops.keySet());
		System.out.println(laptops.values());
		
		// TODO Auto-generated method stub

	}

}
