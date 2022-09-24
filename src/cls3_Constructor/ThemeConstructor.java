package cls3_Constructor;
class Laptop{
	String laptopname;
	int processor;
	int RAM;
	int HDD;
	static String systemtype;
	Laptop(){
		laptopname="HP";
		Laptop.systemtype="64-bit operating system";
		System.out.println("the laptop name is "+laptopname);
		}
	Laptop(int p,int r,int hdd){
		processor=p;
		RAM=r;
		HDD=hdd;
	}
	void print_details() {
		System.out.println("processor"+processor+"bit");
		System.out.println("ram of laptop"+RAM+"GB");
		System.out.println("hard disk "+HDD+"TB");
		System.out.println("the laptop os is "+Laptop.systemtype);
	}
}

public class ThemeConstructor {
public static void main(String[] args) {
	    Laptop lp=new Laptop();
		Laptop l=new Laptop(64,4,1);
		l.print_details();
		Laptop l1=new Laptop(32,8,120);
		l1.print_details();// TODO Auto-generated method stub

	}

}
