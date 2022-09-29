package cls8_arraysprograms;
import java.util.Scanner;
public class ArrayElementsSum {

	public static void main(String[] args) {
		int evennumbers[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter even numbers");
			evennumbers[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0; i<10; i++){
			sum=sum+evennumbers[i];
			System.out.println("a["+i+"]= "+evennumbers[i]);
		}// TODO Auto-generated method stub
			System.out.println("Sum of even numbers= "+sum);
	}

}
