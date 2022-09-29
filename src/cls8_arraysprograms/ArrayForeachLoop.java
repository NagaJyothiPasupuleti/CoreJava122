package cls8_arraysprograms;
import java.util.Scanner;
public class ArrayForeachLoop {

	public static void main(String[] args) {
		int primenum[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.println("enter 5 prime numbers");
			primenum[i]=sc.nextInt();
		}
		for(int p:primenum){
			System.out.println(p);
		}// TODO Auto-generated method stub

	}

}
