package cls11_streamoperations;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class CreatingStreamPrograms {

	public static void main(String[] args) {
		//ways to build streams from collections
		//Stream.of()
		System.out.println("first way");
		Stream<Integer>evennumbers=Stream.of(2,4,6,8,10,12,14,16,18,20);
		evennumbers.forEach(f->System.out.println(f));
		
		//creating stream from array using Stream.of(array)
		System.out.println("second way");
		Stream<Character>letters=Stream.of(new Character[] {'A','B','C','D','E','F','G','H'});
		letters.forEach(l->System.out.println(l));
		
		//Stream from list using List.stream()
		System.out.println("Third way");
		List<Integer>numbers= new ArrayList<Integer>();
		for(int i=2; i<10;i++) {
			numbers.add(i);
			}
		Stream<Integer>s=numbers.stream();
		numbers.forEach(x->System.out.println(x));
		
		//creating stream from generated elements using Stream.generate()
		System.out.println("fourth way");
		Stream<Integer>random=Stream.generate(()->(new Random().nextInt(10)));
		random.limit(5).forEach(System.out::println);
		
		//creating stream from characters of a string
		System.out.println("fifth way");
	    IntStream word="Naga_9010908505_jyothi".chars();
		word.forEach(w->System.out.println(w));
		
		
	}
}
