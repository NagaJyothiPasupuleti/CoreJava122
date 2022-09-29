package cls8_ExceptionhandlingPrograms;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		String s1="Naga Jyothi";
		String s2="Pasupuleti";
		String s3=s1+s2;
		String s4=null;
		System.out.println("Name is "+s1);
		System.out.println("Initial "+s2);
		System.out.println("Full name "+s3);
		try {
		System.out.println(s4.length());
		}
		catch(NullPointerException np){
			np.printStackTrace();
		}// TODO Auto-generated method stub
		System.out.println("The length of s1 is "+s1.length());
		System.out.println("The length of s1 is "+s2.length());
		System.out.println("The length of s1 is "+s3.length());
	}

}
