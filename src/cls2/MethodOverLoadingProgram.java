package cls2;
import java.util.Scanner;
class Concatenation{
	void combo(String s1,String s2) {
		System.out.println(s1+" "+s2);
	}
	void combo(String s1,int num) {
		System.out.println(s1+" "+num);
	}
}

public class MethodOverLoadingProgram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Concatenation c=new Concatenation();
		System.out.println("enter two string values");
		c.combo(s.next(), s.next());
		System.out.println("enter string value and num value");
		c.combo(s.next(), s.nextInt());
		// TODO Auto-generated method stub

	}

}
