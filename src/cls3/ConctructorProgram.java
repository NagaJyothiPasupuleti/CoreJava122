package cls3;
class Employee{
	String name;
	int employee_id;
	double salary;
	Employee(){
		name="Anurag";
		System.out.println("enetr the employee name "+name);
	}
	Employee(int id,double money){
		employee_id=id;
		salary=money;
	}
	void show() {
		System.out.println("the employee id is "+employee_id);
		System.out.println("salary is "+salary);
	}
}
public class ConctructorProgram {

	public static void main(String[] args) {
		Employee e = new Employee(1234,50000);
		e.show();
		// TODO Auto-generated method stub

	}

}
