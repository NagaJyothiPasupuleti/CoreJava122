package cls6_InterfaceVariable;
interface Laptop{
	String os="operating system";
	
	}
interface Asus extends Laptop{
	String os="Windows 10 pro";
	int ram=4;
	int hdd=1;
}
class Specifications implements Asus{
	void show() {
		System.out.println("Every laptop have "+Laptop.os);
		System.out.println("The os of Asus Laptop is "+Asus.os);
		System.out.println("The ram of Asus is "+ram+"GB");
		System.out.println("The hard drive Storage of Asus is "+hdd+"TB");
	}
}
public class Theme_Interfacevariable {

	public static void main(String[] args) {
		Specifications s=new Specifications();
		s.show();// TODO Auto-generated method stub

	}

}
