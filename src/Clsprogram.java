class Student{
	int id;
	float marks;
	static String college;
}
class Employee{
	int employeeid;
	double salary;
    
}
public class Clsprogram {

	public static void main(String[] args) {
		Student s =new Student();
		s.id=215;
		s.marks=78.5f;
		System.out.println("id is "+s.id);
		System.out.println("marks are "+s.marks);
		System.out.println("college name is "+Student.college);
		Student s1=new Student();
		s1.id=201;
		s1.marks=93.2f;
		System.out.println("id is "+s1.id);
		System.out.println("marks got "+s1.marks);
		System.out.println("college name "+Student.college);
	     Employee e=new Employee();
	     e.employeeid=12345;
	     e.salary=35000f;
	     String company="HCL";
	     System.out.println("Employee id is "+e.employeeid);
	     System.out.println("salary of employ is "+e.salary);
	     System.out.println("company name is "+company);
		

	}

}
