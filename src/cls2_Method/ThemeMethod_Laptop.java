package cls2_Method;
class FunctionsOfLaptop{
	void inputMethods() {
		System.out.println("Methods of inputs are:keyboard,scanner,flash drive,CD");
	}
	void processing(String code, String storage) {
		System.out.println("CPU is the brain of system which stores "+code+" in the "+storage);
		
	}
	String storage() {
		return"information saved";
	}
	String output(String instruction) {
		System.out.println("The program will "+instruction+"by giving instruction");
		return"displayed";
	}
}
public class ThemeMethod_Laptop {
public static void main(String[] args) {
		FunctionsOfLaptop fl=new FunctionsOfLaptop();
		fl.inputMethods();
		fl.processing("data", "RAM");
		System.out.println(fl.storage()+"in Hard drive");
		System.out.println("The output is "+fl.output("run"));// TODO Auto-generated method stub

	}

}
