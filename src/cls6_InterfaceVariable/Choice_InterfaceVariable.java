package cls6_InterfaceVariable;
interface Library{
	int n=200;
	String s="Different books";
}
interface Mythology extends Library{
	int n=50;
	String bk="MYTH AND THE MIND";
}
class Book implements Mythology{
	void info() {
		System.out.println("number of books in library "+Library.n);
		System.out.println("In library there are "+Library.s);
		System.out.println("Number of Mythology books in library"+Mythology.n);
		System.out.println("The mythology book name is "+Mythology.bk);
	}
}

public class Choice_InterfaceVariable {

	public static void main(String[] args) {
		Book b= new Book();
		b.info();// TODO Auto-generated method stub

	}

}
