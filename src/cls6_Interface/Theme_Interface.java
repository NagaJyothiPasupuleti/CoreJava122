package cls6_Interface;
interface Electronics{
	void processor();
	void ram();
	void os();
}
abstract class Laptop implements Electronics{
	abstract void harddrive();
	abstract void intelcore();
	}
class Lenovo extends Laptop{
	void harddrive() {
		System.out.println("The hardderive storage of Lenovo is 500GB HDD");
	}
	void intelcore() {
		System.out.println("Lenovo comes with Intel Core i5 ");
	}
	public void processor() {
		System.out.println("the Processor of a Lenovo laptop is HM76 Express");
	}
	public void ram() {
		System.out.println("The ram of Lenovo is 2-78GB");
	}
	public void os() {
		System.out.println("The operating system of Lenvo is windows 10 or windows 10 pro");
	}
}
abstract class Mobile implements Electronics{
	abstract void backcamera();
	abstract void sim();
}
class Redmi9A extends Mobile{
	void backcamera() {
		System.out.println("The mega pixel quantity of Redmi9A mobile is 13MP");
	}
	void sim() {
		System.out.println("The sim card availability in Redmi9A mobile is Dual sim network available");
	}
	public void processor() {
		System.out.println("the Processor of a Redmi9A mobile  is Media Tek Helio G25");
	}
	public void ram() {
		System.out.println("The ram of Redmi9A mobile is 2-6GB RAM");
	}
	public void os() {
		System.out.println("The operating system of Redmi9A mobile is Android 10,MIUI12");
	}
}

public class Theme_Interface {

	public static void main(String[] args) {
		Laptop lp;
		lp=new Lenovo();
		lp.harddrive();
		lp.intelcore();
		lp.processor();
		lp.ram();
		lp.os();
		Mobile m;
		m= new Redmi9A();
		m.backcamera();
		m.sim();
		m.processor();
		m.ram();
		m.os();
		// TODO Auto-generated method stub

	}

}
