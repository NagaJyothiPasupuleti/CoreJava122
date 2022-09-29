package cls8_arraysprograms;
import java.util.Scanner;

public class ThemeArrayProgram {

	public static void main(String[] args) {
		String laptop[]=new String[5];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter different laptop models");
		for(int i=0;i<5;i++) {
		laptop[i]=s.next();
		}// TODO Auto-generated method stub
		for (String name:laptop) {
			System.out.println(name);
		}
	}

}
