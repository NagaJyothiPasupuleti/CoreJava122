package cls2_Method;
class Bank{
	void form() {
		System.out.println("Fill the details name_age_number");
	}
	void proof(String id, String address) {
		System.out.println("id "+id+""+"address proof is "+address);
	}
	String passbook() {
		return "Passbook";
		
	}
	String deposit(int amount) {
		System.out.println("amount given "+amount);
		return "deposited";
	}
}

public class Customer_Method {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.form();
		b.proof("Nj1023P2001","Aadharnumber:6062 345 324");
		System.out.println("Bank employee given"+b.passbook()+"to customer");
		System.out.println("The Amount was "+b.deposit(1500));
		
		// TODO Auto-generated method stub

	}

}
