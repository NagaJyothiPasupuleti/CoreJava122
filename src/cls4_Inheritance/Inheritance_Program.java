package cls4_Inheritance;
import java.util.Scanner;
class Square{
	int a;
	Scanner sc= new Scanner(System.in);
	void input() {
		System.out.println("enter a value");
		a=sc.nextInt();
	}
	void area() {
		System.out.println("the area of square is "+(a*a));
	}
}
class Addition extends Square{
	int b;
	void take() {
		System.out.println("enter b value");
		b=sc.nextInt();
	}
	void sum() {
		System.out.println("the sum of two variables is "+(a+b));
	}
}

public class Inheritance_Program {

	public static void main(String[] args) {
		Addition a =new Addition();
		a.input();
		a.area();
		a.take();
		a.sum();// TODO Auto-generated method stub

	}

}
