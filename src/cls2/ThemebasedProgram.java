package cls2;
import java.util.Scanner;
class Laptop1{
	void inputMethods() {
		System.out.println("Methods of inputs are:keyboard,scanner,flash drive,CD");
	}
	void inputMethods(String input) {
		System.out.println("The input is given by "+input);
	}
	void processing(String code, String storage) {
		System.out.println("CPU is the brain of system which stores "+code+" in the "+storage);
		}
	void processing(String CU,String ALU,String tempstorage) {
		System.out.println("Manipulations are handled by the "+CU);
		System.out.println("The matematical and logical computations are performed "+ALU);
		System.out.println("thoughts of CPU holded by the "+tempstorage);
	}
	String storage() {
		return"information saved";
	}
	String output(String instruction) {
		System.out.println("The program will "+instruction+"by giving instruction");
		return"displayed";
	}
}

public class ThemebasedProgram {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Laptop1 l=new Laptop1();
		l.inputMethods();
		System.out.println("enter the strings");
		l.inputMethods(s.next());
		l.processing(s.next(), s.next());
		l.processing(s.next(), s.next(), s.next());
		System.out.println(l.storage()+"in hard drive");
		System.out.println("The output is "+l.output(s.next()));
		// TODO Auto-generated method stub

	}

}
