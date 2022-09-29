package cls9_collectionslistprograms;

import java.util.Vector;

public class VectorListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		int capacity=v1.capacity();
		System.out.println("the default capacity of vector is "+capacity);
		v1.add(3);
		v1.add(56);
		System.out.println("the vector list is "+v1);
		System.out.println("the size of vector is "+v1.size());
		v1.add("bani");
		v1.add("puppy");
		System.out.println(v1);
		System.out.println("the size of vector is "+v1.size());
		v1.add(5.8f);
		v1.add(72.3f);
		System.out.println(v1);
		System.out.println("the size of final vector is "+v1.size());
		v1.remove("bani");
		System.out.println(v1);
		v1.add(2,23);
		v1.add(6,"jyo");
		System.out.println(v1);
		
		
	}

}
