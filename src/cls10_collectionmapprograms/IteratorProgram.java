package cls10_collectionmapprograms;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class IteratorProgram {

	public static void main(String[] args) {
		Set<Integer> marks=new HashSet<>();
		marks.add(98);
		marks.add(95);
		marks.add(73);
		marks.add(72);
		marks.add(60);
		marks.add(58);
		System.out.println("marks list "+marks);
		Iterator i=marks.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		Set<String> fruits=new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("cherry");
		fruits.add("Guva");
		fruits.add("Banana");
		System.out.println(fruits);
		Iterator i1=fruits.iterator(); 
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		// TODO Auto-generated method stub

	}

}
