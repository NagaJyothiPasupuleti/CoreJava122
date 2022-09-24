package cls5_nestedclasses;
class University1{
	static class Department{
		void prepare() {
			System.out.println("Question paper will be prepared soon");
		}
		static void announcement() {
			System.out.println("Exams will start in November");
		}
	}
}

public class StaticClass {

	public static void main(String[] args) {
		University1.Department.announcement();
		University1.Department ud=new University1.Department();
		ud.prepare();// TODO Auto-generated method stub

	}

}
