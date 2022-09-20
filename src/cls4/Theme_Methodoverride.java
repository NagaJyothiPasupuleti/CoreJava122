package cls4;
class Laptop{
	void cost() {
		System.out.println("no cost");
	}
	void os() {
		System.out.println("differents os for different laptops");
	}
	void ssd() {
		System.out.println("no storage");
	}
}
class Lenovo extends Laptop{
	void cost() {
		System.out.println("The cost of Lenovo laptop is starts at 24990");
	}
	void os() {
		System.out.println("operating system of Lenovo is windows10");
	}
	void ssd() {
		System.out.println("Lenovo comes with 256GB of SSD storage");
	}
	}
class Asus extends Laptop{
	void cost() {
		System.out.println("The cost of Asus laptop starts at 26990");
	}
	void os() {
		System.out.println("operating system of Asus is windows 10 pro");
	}
	void ssd() {
		System.out.println("Asus comes with 256GB/512GB/1TB PCle SSD");
	}
}

public class Theme_Methodoverride {
public static void main(String[] args) {
		Laptop lp=new Laptop();
		lp.cost();
		lp.os();
		lp.ssd();
		lp=new Lenovo();
		lp.cost();
		lp.os();
		lp.ssd();
		lp=new Asus();
		lp.cost();
		lp.os();
		lp.ssd();// TODO Auto-generated method stub

	}

}
