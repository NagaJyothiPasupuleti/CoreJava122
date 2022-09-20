package cls4;
class Car1{
	void cost() {
		System.out.println("no cost");
	}
	void milage() {
		System.out.println("No milage");
	}
}
class Jaguar extends Car1{
	void cost() {
		System.out.println("The coat of Jaguar car is 97 lakhs ");
	}
	void milage() {
		System.out.println("the milage of Jaguar car is 9.28 to 12.3 kmpl");
	}
}
class HondaCity extends Car1{
	void cost() {
		System.out.println("The cost of HondaCity car starts at 11.57lakhs");
	}
	void milage() {
		System.out.println("the milage of Honda City car is 24.1 kmpl");
	}
}

public class MethodOverridingProgram {

	public static void main(String[] args) {
		Car1 c1=new Car1();
		c1.cost();
		c1.milage();
		c1=new Jaguar();
		c1.cost();
		c1.milage();
		c1=new HondaCity();
		c1.cost();
		c1.milage();
		// TODO Auto-generated method stub

	}

}
