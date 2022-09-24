package cls2_MethodOverloading;
import java.util.Scanner;
class Generationp{
	void sources() {
		System.out.println("the resources are coal,solar,wind and water");
	}
	void input(String source) {
		System.out.println("We take the input is "+source);
	}
	void input(String source1,String source2) {
		System.out.println("the two another input sources are "+source1+" and "+source2);
	}
	String burning() {
		return "steam";
	}
	String burning(String source1) {
		return "steam";
	}
	String outcome(String sending) {
		System.out.println("the turbine rotated by the "+sending);
		return "Electricity";
	}
}
public class Powergen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Generationp gp=new Generationp();
		gp.sources();
		System.out.println("enter the string values");
		gp.input(s.next());
		gp.input(s.next(), s.next());
		System.out.println("by burning the coal "+gp.burning()+" is released");
		System.out.println("by boiling the water "+gp.burning(s.next())+"is released");
		System.out.println("the generator converts the mechanical energy to "+gp.outcome(s.next()));
		// TODO Auto-generated method stub

	}

}
