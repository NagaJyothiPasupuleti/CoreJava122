package cls7_stringprograms;


public class StringProgram {

	public static void main(String[] args) {
		String name="Naga Jyothi";
		String initial=name.concat(" Pasupuleti");
		System.out.println(name);
		System.out.println(initial);
		System.out.println(name.equals("jyo"));
		System.out.println(name.equals("naga jyothi"));
		System.out.println(name.equalsIgnoreCase("naga jyothi"));
		System.out.println(name.contains("Jyo"));
		System.out.println(name.charAt(6));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(5, 10));
		String[] s=initial.split(" ");
		for(String f : s){
			System.out.println(f);
	
		StringBuffer s1=new StringBuffer("Welcome to");
		StringBuilder s2= new StringBuilder("White color");
		s1.append("Nature world");
		s2.append("represents peace");// TODO Auto-generated method stub

	}

}
}
