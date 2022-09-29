package cls9_collectionslistprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer >marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(52);
		marks.add(98);
		System.out.println(marks);
		System.out.println(marks.get(2));
		marks.set(1, 85);
		System.out.println(marks);
		marks.remove(1);
		System.out.println(marks);
		System.out.println("marks list size "+marks.size());
	}

}
