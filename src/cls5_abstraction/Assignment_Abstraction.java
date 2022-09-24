package cls5_abstraction;
abstract class Animal{
	abstract void lifespan();
	abstract void sound();
	void legs() {
		System.out.println("animals have 4 legs");
	}
}
class Lion extends Animal{
	void lifespan() {
		System.out.println("the lifespan of lion is 15-16 years");
	}
	void sound() {
		System.out.println("the lion roars while hunting ");
	}
}
class Monkey extends Animal{
	void lifespan() {
		System.out.println("The lifespan of monkey is 20 years");
	}
	void sound() {
		System.out.println("monkey screams");
	}
	
}

public class Assignment_Abstraction {

	public static void main(String[] args) {
			Animal a;
			a=new Lion();
			a.lifespan();
			a.sound();
			a.legs();
			a=new Monkey();
			a.lifespan();
			a.sound();
			a.legs();
			// TODO Auto-generated method stub

	}

}
