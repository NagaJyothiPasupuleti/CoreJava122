package cls10_collectionmapprograms;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SplitIteratorProgram {

	public static void main(String[] args, Consumer<? super String> n) {
		Set<String>s=new LinkedHashSet<String>();// TODO Auto-generated method stub
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("f");
		s.add("g");
		System.out.println(s);
		Spliterator<String>str=s.spliterator();
		while(str.tryAdvance(n)) {
			System.out.println(str);
		}
	}

}
