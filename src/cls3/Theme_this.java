package cls3;
class Laptop1{
	String laptopname;
	int processor;
	int RAM;
	int HDD;
	static String systemtype;
	Laptop1(int processor,int RAM,int HDD){
		this("ASUS");
		this.processor=processor;
		this.RAM=RAM;
		this.HDD=HDD;
	}
	Laptop1(String n){
		laptopname=n;
		Laptop.systemtype="64-bit operating system";
		System.out.println("my laptop name is "+n);
	}
	void print_details() {
		System.out.println("processor"+processor+"bit");
		System.out.println("ram of laptop"+RAM+"GB");
		System.out.println("hard disk "+HDD+"TB");
		System.out.println("the laptop os is "+Laptop.systemtype);
	}
}
public class Theme_this {
public static void main(String[] args) {
		Laptop1 l1=new Laptop1(64,4,1);
		l1.print_details();
		Laptop1 l2=new Laptop1(32,8,220);
		l2.print_details();// TODO Auto-generated method stub

	}

}
