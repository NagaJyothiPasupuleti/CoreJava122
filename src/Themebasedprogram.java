class Laptop{
	String laptopname;
	int processor;
	int RAM;
	String generation;
	String core;
	int HDD;
	static String systemtype;
}
class Hp{
	int processor;
	int RAM;
}
public class Themebasedprogram {
public static void main(String[] args) {
		Laptop l =new Laptop();
		l.laptopname="ASUS";
		int processor=64;
		l.RAM=4;
		l.generation="7th generation";
		l.core="i3";
		int HDD=1;
		l.systemtype="64-bit operating system";
		System.out.println("laptop: "+l.laptopname);
		System.out.println("processor"+processor+"bit");
		System.out.println("ram of laptop"+l.RAM+"GB");
		System.out.println(l.generation);
		System.out.println(l.core);
		System.out.println(HDD+"TB");
		System.out.println(Laptop.systemtype);
		Hp h=new Hp();
		h.processor=64;
		h.RAM=8;
		System.out.println("prosessor of Hp lotop"+h.processor);
		System.out.println("RAM of Hp laptop is "+h.RAM+"GB");
		System.out.println(Laptop.systemtype);
		// TODO Auto-generated method stub

	}

}
