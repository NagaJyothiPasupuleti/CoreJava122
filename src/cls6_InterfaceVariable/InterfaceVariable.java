package cls6_InterfaceVariable;
interface Parent{
	int age=56;
}
interface Child extends Parent{
	int age=22;
}
class Details implements Child{
	void details() {
		System.out.println("Parent age is "+Parent.age);
		System.out.println("Parent age is "+Child.age);
	}
}

public class InterfaceVariable {

	public static void main(String[] args) {
		Details d= new Details();
		d.details();// TODO Auto-generated method stub

	}

}
