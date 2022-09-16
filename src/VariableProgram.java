class Person{
	int age;
	String name;
	float weight;
	long aadharnumber;
	float height;
	char bloodgroup;
	static String gender;
	static String eyecolor;
	}
class Daughter{
	String name;
	int age;
	}
  public class VariableProgram {
   public static void main(String[] args) {
		Person p = new Person();
		p.age=25;
		p.name="Anu";
		p.weight=56.50f;
		p.aadharnumber=1235678345;
		p.height=5.8f;
		p.bloodgroup='A';
		p.gender="female";
		p.eyecolor="grey";
		System.out.println("Mother name is "+p.name);
		System.out.println("her age is "+p.age);
		System.out.println("weight of anu is "+p.weight);
		System.out.println("aadhar number is "+p.aadharnumber);
		System.out.println("height of anu is "+p.height);
		System.out.println("bloodgroup is "+p.bloodgroup+" positive");
		System.out.println(p.gender);
		System.out.println("her eyes are in "+p.eyecolor+"color");
		
		Daughter d = new Daughter();
		d.name="vinni";
		d.age=20;
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(Person.gender);
		System.out.println(Person.eyecolor);
		
		// TODO Auto-generated method stub

	}

}
