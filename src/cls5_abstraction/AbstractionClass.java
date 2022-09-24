package cls5_abstraction;
abstract class Car{
	abstract void cost();
	abstract void milage();
	void type() {
		System.out.println("fuel type car");
	}
}
class Jaguar extends Car{
	void cost() {
		System.out.println("the cost of jaguar car is 97 lakhs");
	}
	void milage() {
		System.out.println("The milage of Jaguar car is 9 to 12kmpl");
	}
}
class HondaCity extends Car{
	void cost() {
		System.out.println("the cost of jaguar car is 11.7 lakhs");
	}
	void milage() {
		System.out.println("The milage of Jaguar car is 24kmpl");
	}
}

public class AbstractionClass {

	public static void main(String[] args) {
		Car c;
		c=new Jaguar();
		c.cost();
		c.milage();
		c.type();
		c=new HondaCity();
		c.cost();
		c.milage();
		c.type();
		// TODO Auto-generated method stub

	}

}
