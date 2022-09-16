import java.util.Scanner;
public class Areaoftriangle {
	
   public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base value");
		int base=s.nextInt();
		System.out.println("the base value is "+base);
		System.out.println(" enter the height value");
		float height=s.nextFloat();
		System.out.println("the height value is "+height);
		System.out.println("the area of the traingle is "+(0.5*base*height));// TODO Auto-generated method stub

	}

}
