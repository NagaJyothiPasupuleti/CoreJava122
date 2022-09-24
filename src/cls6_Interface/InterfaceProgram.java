package cls6_Interface;
interface Vehicle{
	void cost();
	void milage();
	void weight();
	}
abstract class Car implements Vehicle{
	abstract void airbags();
	abstract void seatbelts();
	}
class Jaguar extends Car{
 void airbags() {
	 System.out.println("Air bags minizie the injuries during accident");
 }
 void seatbelts() {
	 System.out.println("Wear seatbelt for safety while driving ");
 }
 public void cost() {
	 System.out.println("The cost of Jaguar car is 97 lakhs");
 }
 public void milage() {
	 System.out.println("the milage of Jaguar car is 9.28 to 12.3 kmpl");
 }
 public void weight() {
	 System.out.println("The weight of the car is 1639-1655kg");
 }
	}
abstract class Bike implements Vehicle{
	abstract void Disc();
	abstract void handlelock();
}
class TvsRaider extends Bike{
	void Disc() {
		System.out.println("brake model");
	}
	void handlelock() {
		System.out.println("handle lock is available for bikes.");
	}
	public void cost() {
		 System.out.println("The cost of TVS Raider is 85,173");
	 }
	 public void milage() {
		 System.out.println("the milage of TVS Raider is 67kmpl");
	 }
	 public void weight() {
		 System.out.println("The weight of bike kerb is 123kg");
	 }
}
public class InterfaceProgram {
public static void main(String[] args) {
		Car c;
		c=new Jaguar();
		c.airbags();
		c.seatbelts();
		c.cost();
		c.milage();
		c.weight();
		Bike b;
		b=new TvsRaider();
		b.Disc();
		b.handlelock();
		b.cost();
		b.milage();
		b.weight();// TODO Auto-generated method stub

	}

}
