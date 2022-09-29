package cls10_collectionmapprograms;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		TreeMap<String, Integer>laptops=new TreeMap<String,Integer>();
		laptops.put("Asus", 25000);
		laptops.put("Hp", 60000);
		laptops.put("Dell", 30000);
		laptops.put("Lenovo", 29000);
		laptops.put("Apple", 46000);
		laptops.put("Acer", 35000);
		System.out.println(laptops);
		System.out.println(laptops.keySet());
		System.out.println(laptops.values());
		Set<Entry<String,Integer>>l=laptops.entrySet();
		Iterator<Entry<String,Integer>>i=l.iterator();
		while(i.hasNext()){
			Entry<String,Integer>e=i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}// TODO Auto-generated method stub

	}

}
