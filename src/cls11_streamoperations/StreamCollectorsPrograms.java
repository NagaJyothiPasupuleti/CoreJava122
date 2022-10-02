package cls11_streamoperations;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsPrograms {

	public static void main(String[] args) {
		//collect stream elements to a list using collect.(Collectors.toList())
		List<Integer>numberlist=new ArrayList<Integer>();
		for(int i=1; i<20;i++) {
			numberlist.add(i);
		}
		Stream<Integer>s=numberlist.stream();
		List<Integer>evennumbers=s.filter(f->f%2==0).collect(Collectors.toList());
		System.out.println(evennumbers);
		
		//collect stream elements from an array
		List<Integer>numbers=new ArrayList<Integer>();
		for(int i=1; i<20;i++) {
			numbers.add(i);
		}
		Stream<Integer>i=numbers.stream();
		Integer[] oddnumbers=i.filter(x->x%2==1).toArray(Integer[]::new);
		System.out.println(oddnumbers);
	}

}
