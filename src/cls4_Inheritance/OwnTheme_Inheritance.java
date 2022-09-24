package cls4_Inheritance;
import java.util.Scanner;
class Watch {
	String material;
	String bucklers;
	String strap;
    Scanner s = new Scanner(System.in);
	void display() {
		System.out.println("displays the time");
	}
}
class Delton extends Watch{
	void details() {
		System.out.println("enter watch material");
		material=s.next();
		System.out.println("enter watch type ");
		bucklers=s.next();
		System.out.println("enter strap");
		strap=s.next();
	}
	void show() {
		System.out.println("watch material is "+material);
		System.out.println("watch bucklers is "+bucklers);
		System.out.println("watch strap is "+strap);
	}
}
public class OwnTheme_Inheritance {

	public static void main(String[] args) {
		Delton d=new Delton();
		d.display();
		d.details();
		d.show();// TODO Auto-generated method stub

	}

}
