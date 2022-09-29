package cls9_collectionssetprograms;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names=new HashSet<String>();
		names.add("Naga Jyothi");
		names.add("Yamini");
		names.add("Duraga Rao");
		names.add("Rajini");
		names.add("Pasupuleti");
		System.out.println(names);
		System.out.println("size of names list is "+names.size());
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Pasupuleti"));
		System.out.println(names.containsAll(names));
		names.remove("Pasupuleti");
		System.out.println(names);
		
		Set<Integer> marks=new HashSet<>();
		marks.add(98);
		marks.add(95);
		marks.add(73);
		marks.add(72);
		marks.add(60);
		marks.add(58);
		System.out.println("marks list "+marks);
		System.out.println("size of names list is "+marks.size());
		System.out.println(marks.isEmpty());
		System.out.println(marks.contains(92));
		System.out.println(marks.containsAll(marks));
		marks.remove(58);
		System.out.println("clone: "+((HashSet)marks).clone());
		System.out.println(marks);
		
	}

}
