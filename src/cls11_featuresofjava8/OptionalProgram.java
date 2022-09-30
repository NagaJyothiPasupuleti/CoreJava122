package cls11_featuresofjava8;

import java.util.Optional;

public class OptionalProgram {

	public static void main(String[] args) {
		String[] s=new String[5];
		s[0]="Jyothi";
		s[1]="courses";
		s[2]="Bachelor of Technlogy";
		s[3]="Electrical and Electronics Engineering";
		for(String x:s) {
			System.out.println(x);
		}
		
		Optional<String> op=Optional.ofNullable(s[0]);
		if(op.isPresent()){
			System.out.println(s[0].length());
		}
		else {
		System.out.println("String is null");
		}
		Optional<String> op1=Optional.ofNullable(s[4]);
		if(op1.isPresent()) {
			System.out.println(s[4].length());
		}
		else {
			System.out.println("Null");
		}
		
		System.out.println("Jyo");
		System.out.println("Trivendram");
		System.out.println("pure");
		System.out.println("heart");
		System.out.println("affection");
		// TODO Auto-generated method stub

	}

}
