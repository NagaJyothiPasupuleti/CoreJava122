package cls8_arraysprograms;
import java.util.Scanner;
public class ArrayIndexPosition {

	public static void main(String[] args) {
		int oddnumbers[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10; i++){
			System.out.println("Enter odd numbers");
			oddnumbers[i]=s.nextInt();
		}
		for(int i=0; i<10;i++){
			System.out.println("oddnumbers["+i+"]= "+oddnumbers[i]);
		}// TODO Auto-generated method stub

	}

}
