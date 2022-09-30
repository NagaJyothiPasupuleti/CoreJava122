package cls10_collectionmapprograms;
import java.util.*;
public class ForloopProgram {

	public static void main(String[] args) {
		Map<String,Integer>marklist=new HashMap<String,Integer>();
		marklist.put("Sanskrit", 98);
		marklist.put("English", 95);
		marklist.put("Maths-2A", 73);
		marklist.put("Maths-2B", 72);
		marklist.put("Physics", 60);
		marklist.put("Chemistry", 57);
		System.out.println(marklist);
		marklist.forEach((key,value)->System.out.println(key+" "+value));
		
		Map<String,Integer>details=new LinkedHashMap<String,Integer>();
		details.put("Asus", 27000);
		details.put("HP", 27000);
		details.put("Dell", 27000);
		details.put("Lenovo", 27000);
		details.put("Apple", 27000);
		details.put("Acer", 27000);
		System.out.println(details);
		for(Map.Entry<String, Integer>f:details.entrySet()){
			System.out.println("Laptopname "+f.getKey()+" cost "+f.getValue());
		}// TODO Auto-generated method stub

	}

}
