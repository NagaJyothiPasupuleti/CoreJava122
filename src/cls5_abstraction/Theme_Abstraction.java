package cls5_abstraction;
abstract class Laptop{
	abstract void os();
	abstract void hdd();
	void processing() {
		System.out.println("The data is processed by the CPU");
	}
}
class Lenovo extends Laptop{
	void os() {
		System.out.println("the operating system of Lenovo is windows 10");
	}
	void hdd() {
		System.out.println("Lenovo comes with 256GB of SSD storage");
	}
}
class Asus extends Laptop{
	void os() {
		System.out.println("the operating system of Lenovo is windows 10 pro");
	}
	void hdd() {
		System.out.println("Asus comes with 256GB/512GB/1TB PCle SSD");
	}
}

public class Theme_Abstraction {

	public static void main(String[] args) {
		Laptop lp;
		lp=new Lenovo();
		lp.processing();
		lp.os();
		lp.hdd();
		lp=new Asus();
		lp.processing();
		lp.os();
		lp.hdd();// TODO Auto-generated method stub

	}

}
