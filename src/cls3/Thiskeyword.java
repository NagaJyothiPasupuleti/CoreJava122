package cls3;
class Employee1{
	static String companyname;
	int employee_id;
	double salary;
	
	Employee1(int employee_id,double salary){
		this("HCl");
		this.employee_id=employee_id;
		this.salary=salary;
		
	}
	Employee1(String companyname){
		System.out.println("enetr the company name "+companyname);
	}
	void show() {
		System.out.println("the employee id is "+employee_id);
		System.out.println("salary is "+salary);
	}
}
public class Thiskeyword {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(1234,2500);
		e1.show();
		
		Employee1 e2=new Employee1(2121,5000);
		e2.show();// TODO Auto-generated method stub

	}

}
