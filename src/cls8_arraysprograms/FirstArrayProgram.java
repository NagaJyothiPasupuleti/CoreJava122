package cls8_arraysprograms;
import java.util.Scanner;
public class FirstArrayProgram {

	public static void main(String[] args) {
		int a[];
		a=new int[6];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<6; i++) {
		System.out.println("Enter array elements");
		a[i]=s.nextInt();
		}
		for(int i=0; i<6; i++){
			System.out.println(a[i]);
		}// TODO Auto-generated method stub
        
		
	}

}
