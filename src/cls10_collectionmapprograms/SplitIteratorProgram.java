package cls10_collectionmapprograms;

import java.util.*;

public class SplitIteratorProgram {

	public static void main(String[] args ) {
		List<String> fruitList = Arrays.asList("Mango", "Banana", "Apple");
   	 Spliterator<String> splitr = fruitList.spliterator();
   	 System.out.println("List of Fruit name-");
   	    	 while(splitr.tryAdvance((num) -> System.out.println("" +num)));
	
	List<String>names=Arrays.asList("jyo","yamu","anju","sai");
	Spliterator<String>sp=names.spliterator();
	Spliterator<String>s=sp.trySplit();
	sp.forEachRemaining(System.out::println);
	System.out.println("using spliterator");
	s.forEachRemaining(System.out::println);
}

}
