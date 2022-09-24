package cls5_nestedclasses;
class University{
	Department d=new Department();
	void announcement() {
		System.out.println("Exams start from 1st November");
		d.prepre();
	}
	class Department{
		void prepre() {
			System.out.println("question paper will be prepared before 10 days of exams");
		}
	}
}

public class MemberInnerclassProgram {

	public static void main(String[] args) {
		University u =new University();
		u.announcement();// TODO Auto-generated method stub

	}

}
