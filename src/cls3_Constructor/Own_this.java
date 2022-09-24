package cls3_Constructor;
class Concatenation{
	String s1;
	String s2;
	int a;
	int b;
	int c;
	Concatenation(String s1,String s2){
		this(12,06,2001);
		this.s1=s1;
		this.s2=s2;
	}
	Concatenation(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	void dob() {
		System.out.println("Name is "+s1+" "+s2);
		System.out.println("Date_of_birth is "+a+"-"+b+"-"+c);
	}
}

public class Own_this {
public static void main(String[] args) {
	Concatenation c=new Concatenation("Naga Jyothi","Pasupuleti");
	c.dob();
	Concatenation c1=new Concatenation("Yamini","Pasupuleti");
	c1.dob();
	
		// TODO Auto-generated method stub

	}

}
