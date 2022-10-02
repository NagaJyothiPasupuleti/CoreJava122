package cls11_streamoperations;
import java.util.*;
import java.util.stream.Collectors;

public class IntermediateandTerminateOperationsPrograms {

	public static void main(String[] args) {
		List<String> laptops=new ArrayList<String>();
		laptops.add("Asus");
		laptops.add("Lenovo");
		laptops.add("Dell");
		laptops.add("HP");
		laptops.add("Apple");
		laptops.add("Acer");
		laptops.add("AVITA");
		laptops.add("Sony");
		laptops.add("Xiaomi");
		System.out.println("Available laptops in market are"+laptops);
		String brands=laptops.stream().map(x->x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(brands);
		List lp=laptops.stream().sorted().collect(Collectors.toList());
		System.out.println(lp);
		
		List<Integer> naturalnumbers =new ArrayList<Integer>();
		naturalnumbers.add(2);
		naturalnumbers.add(12);
		naturalnumbers.add(6);
		naturalnumbers.add(2001);
		naturalnumbers.add(2004);
		naturalnumbers.add(26);
		naturalnumbers.add(1999);
		naturalnumbers.add(18);
		naturalnumbers.add(5);
		System.out.println("The natural numbers are"+naturalnumbers);
		List<Integer>nn=naturalnumbers.stream().map(m->m*m).collect(Collectors.toList());
		System.out.println(nn);
		
		IntSummaryStatistics s= naturalnumbers.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(s);
		
		List l=naturalnumbers.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		
		int even=naturalnumbers.stream().filter(f->f%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		

	}

}
