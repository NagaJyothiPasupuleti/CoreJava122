package cls4;
import java.util.Scanner;
class Car{
	int year;
	String color;
	Scanner s =new Scanner(System.in);
	void models() {
		System.out.println("Different types of cars avilable in market");
	}
	}
class Bentayga extends Car{
	void type() {
		System.out.println("Bentayga is a fuel type car");
		System.out.println("enter the launched year of car");
		year=s.nextInt();
		System.out.println("the bentayga car was launched in "+year);
		System.out.println("enetr the color of the car");
		color=s.next();
		System.out.println("the first bentayga car color is "+color);
	}
}
class Suziki_Alto extends Car{
	void style() {
		System.out.println("bodystyle is 3/5-door hatchback");
		System.out.println("enter the launched year of suziki car");
		year=s.nextInt();
		System.out.println("the Suziki_Alto was introduced in "+year);
		System.out.println("enetr the color of the car");
		color=s.next();
		System.out.println("the color of Suziki_Alto is "+color);
		
	}
}
public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Suziki_Alto sa=new Suziki_Alto();
		sa.models();
		sa.style();
		Bentayga b=new Bentayga();
		b.models();
		b.type();// TODO Auto-generated method stub

	}

}
