package cls3;
class Flower{
	Flower(String c){
		System.out.println("different flowers are in different "+c);
	}
}
class Rose extends Flower{
	Rose(String c){
		super("color");
		System.out.println("the rose is in "+c);
	}
}
	class Jasmine extends Flower{
		Jasmine(String c) {
			super(c);
			System.out.println("the jasmine is in "+c);
			// TODO Auto-generated constructor stub
		}
}
public class Own_super {

	public static void main(String[] args) {
		Jasmine j=new Jasmine("White color");
		Rose r=new Rose("Red color");// TODO Auto-generated method stub

	}

}
