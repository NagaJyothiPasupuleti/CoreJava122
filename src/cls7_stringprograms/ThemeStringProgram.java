package cls7_stringprograms;

public class ThemeStringProgram {

	public static void main(String[] args) {
		String Laptop="Lenovo";
		String os="Windows 10 pro  ";
		String s= Laptop+os;
		System.out.println(s);
		String s1=s.concat("version");
		System.out.println(s1);
		System.out.println(os.trim());
		System.out.println(Laptop.equals("LENOVO"));
		System.out.println(os.equalsIgnoreCase("windows 10 pro "));
		System.out.println(s.contains("pro"));
		System.out.println(Laptop.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(8));
		System.out.println(s.substring(3,8));
		String [] s2=s.split(" ");
		for (String s3 :s2) {
			System.out.println(s3);
		}
		// TODO Auto-generated method stub

	}

}
