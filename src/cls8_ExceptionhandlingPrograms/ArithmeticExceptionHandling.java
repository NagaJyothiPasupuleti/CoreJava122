package cls8_ExceptionhandlingPrograms;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		int x=15;
		int y=20;
		int z=x+y;
		System.out.println("The sum of two variables is= "+z);
		try {
		System.out.println(z/0);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println(y);// TODO Auto-generated method stub
		System.out.println("The difference between two variables "+(y-x));
		System.out.println("The multiplication of two variables "+(x*y));
	}

}
