package cls10_collectionmapprograms;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {
		List<Integer> even=new LinkedList<>();
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
		System.out.println("print even numbers from 1 to 20"+even);
		ListIterator i=even.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("print previous even numbers");// TODO Auto-generated method stub
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
	}

}
