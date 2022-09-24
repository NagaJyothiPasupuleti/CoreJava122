package cls3_Superkeyword;
class Laptop3{
	String systemtype;
	Laptop3(int processor,int RAM,int HDD){
		
		System.out.println("enter the details");
	    System.out.println("processor of laptop is "+processor+"bit");
		System.out.println("ram of a laptopn is "+RAM+" in GB");
		System.out.println("the capacity of harddrive "+HDD+" In TB");
		System.out.println("os is "+systemtype+" bit operating system");
	}
	void specifications() {
		System.out.println("the details of laptop are displayed");
	}
}
	class Dell extends Laptop3{
		Dell(int processor,int RAM,int HDD){
			super(64,4,1);
			super.specifications();
			System.out.println("the specifications of Dell laptop is displayed");
		    System.out.println("processor of Dell laptop is "+processor+"bit");
			System.out.println("ram of a Dell laptopn is "+RAM+" in GB");
			System.out.println("the capacity of harddrive of Dell is "+HDD+" In GB");
		}
		void specifications() {
			System.out.println("the specifications of dell are displayed");
		}
	}

public  class Theme_Inhrt_super {

	public static void main(String[] args) {
		Dell d=new Dell(64,8,250);
		d.specifications();
		// TODO Auto-generated method stub

	}

}
