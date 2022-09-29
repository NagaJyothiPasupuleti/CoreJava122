package cls9_collectionssetprograms;


import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> odd=new TreeSet<Integer>();
		odd.add(1);
		odd.add(3);
		odd.add(5);
		odd.add(7);
		odd.add(9);
		odd.add(11);
		odd.add(13);
		odd.add(15);
		System.out.println(odd);
		System.out.println(odd.first());
		System.out.println(odd.last());
		odd.add(17);
		odd.add(19);
		odd.add(21);
		odd.add(23);
		System.out.println(odd);
		System.out.println(odd.lower(9));
		System.out.println(odd.floor(15));
		System.out.println(odd.ceiling(21));
		System.out.println(odd.higher(17));
		System.out.println(odd.pollFirst());
		System.out.println(odd.pollLast());
		System.out.println(odd.subSet(5, 19));
		System.out.println(odd.headSet(23));
		System.out.println(odd.tailSet(11));

	}

}
