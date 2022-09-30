package cls11_featuresofjava8;
interface Laptop {
	void input();
	static void processing() {
		System.out.println("The data is processed by the CPU");
	}
	static void dataStorage() {
		System.out.println("Cpu is the geart of the laptop");
	}
	default void analysis() {
		System.out.println("manipulations are done by the control unit");
	}
	default void display() {
		System.out.println("Output apperas on the screen");
	}
}

public class DefaultAndStaticMethodsInterface implements Laptop {

	public static void main(String[] args) {
		DefaultAndStaticMethodsInterface ds=new DefaultAndStaticMethodsInterface();
		ds.input();
		ds.analysis();
		ds.display();
		Laptop.processing();
		Laptop.dataStorage();
		// TODO Auto-generated method stub
}

	public void input() {
		System.out.println("Input will be taken from keyboard");
		
	}
	
}
