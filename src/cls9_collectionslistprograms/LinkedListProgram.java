package cls9_collectionslistprograms;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>veg = new LinkedList<String>();
		veg.add("tomato");
		veg.add("potato");
		System.out.println("the veg list is "+veg);
		veg.addFirst("leafyveg");
		System.out.println("the  list is "+veg);
		veg.addLast("cuuryleaf");
		System.out.println("the total veg list is "+veg);
		veg.add(4, "biitergaurd");
		System.out.println(veg);
		veg.remove("leafyveg");
		System.out.println("the removed veg list is "+veg);
		System.out.println("the veg list is "+veg);
		veg.pop();
		System.out.println("the veg list is "+veg);
		veg.clear();
		System.out.println(veg);
	}

}
