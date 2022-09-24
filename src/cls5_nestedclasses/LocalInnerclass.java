package cls5_nestedclasses;
class Universities{
	void announcement() {
		System.out.println("Exams will be conducted in November");
		class Department{
			void prepare() {
				System.out.println("Question paper will be prepared soon");
			}
		}
		Department d=new Department();
		d.prepare();
	}
}

public class LocalInnerclass {

	public static void main(String[] args) {
		University u =new University();
		u.announcement();// TODO Auto-generated method stub

	}

}
