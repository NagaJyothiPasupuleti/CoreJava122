package cls3;
class Different_Op{
	String s1;
	String s2;
	int a;
	int b;
	int c;
	 Different_Op(){
		s1="Naga Jyothi";
		s2="Pasupuleti";
		System.out.println(s1+" "+s2);
	}
	 Different_Op(int x,int y,int z){
		 a=x;
		 b=y;
		 c=z;
	 }
	 void details() {
		 System.out.println("date of birth is "+a+"-"+b+"-"+c);
	 }
	 }

public class Own_constructor {
public static void main(String[] args) {
		Different_Op d=new Different_Op();
		Different_Op d1=new Different_Op(12,06,2001);
		d1.details();// TODO Auto-generated method stub

	}

}
