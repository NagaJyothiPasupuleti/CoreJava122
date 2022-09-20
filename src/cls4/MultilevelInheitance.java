package cls4;
import java.util.Scanner;
class Electronic_Devices{
	Scanner s=new Scanner(System.in);
	void functions() {
		System.out.println("three main functions are performed");
	}
	void types_Of_Functions() {
		System.out.println("amplification,switching and rectification");
	}
	}
class Mobile extends Electronic_Devices{
	int battery_capacity;
	int storage;
	String os;
	void features() {
		System.out.println("Internet connectivity,multipe windows");
	}
	}
class Redmi9i extends Mobile{
	void specifications() {
		System.out.println("enter battery capacity");
		battery_capacity=s.nextInt();
		System.out.println("the battery capacity of redmi9i mobile is "+battery_capacity+"in mAh");
		System.out.println("enter the storage");
		storage=s.nextInt();
		System.out.println("the storage capacity is "+storage+"in GB");
		System.out.println("enter type of os");
		os=s.next();
		System.out.println("the operating system is "+os);
	}
	void display() {
		System.out.println("Screen size 6.5 inches");
		System.out.println("available in blue,green,grey or midnightblack");
	}
}
public class MultilevelInheitance {

	public static void main(String[] args) {
		Redmi9i r=new Redmi9i();
		r.functions();
		r.types_Of_Functions();
		r.features();
		r.specifications();
		r.display();// TODO Auto-generated method stub

	}

}
