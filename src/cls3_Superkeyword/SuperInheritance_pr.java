package cls3_Superkeyword;
class Parent{
	Parent(int age,String name){
		System.out.println("parent age is "+age);
		System.out.println("parent name is "+name);
	}
}
class Child extends Parent{

	Child(int age,String name) {
		super(54,"Durga Rao");
		System.out.println("child age is "+age);
		System.out.println("child name is "+name);
		// TODO Auto-generated constructor stub
	}
	
}
public class SuperInheritance_pr {

	public static void main(String[] args) {
		Child c=new Child(10,"avni");// TODO Auto-generated method stub

	}

}
