package cls4;
import java.util.Scanner;
class Laptop1{
	int RAM;
	String os;
	Scanner s=new Scanner(System.in);
	void specifications(){
		System.out.println("recent technologies are used");
	}
}
class Asus1 extends Laptop1{
	void details() {
		System.out.println("enter ram value");
		RAM=s.nextInt();
		System.out.println("enter os");
		os=s.next();
	}
	void display() {
		System.out.println("the ram of asus laptop is "+RAM+" in GB");
		System.out.println("the os is "+os);
	}
	
}

public class Theme_Inheritance {

	public static void main(String[] args) {
		Asus1 a=new Asus1();
		a.specifications();
		a.details();
		a.display();// TODO Auto-generated method stub

	}

}
