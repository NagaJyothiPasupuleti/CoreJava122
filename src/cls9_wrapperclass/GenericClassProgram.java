package cls9_wrapperclass;
class Example<generic>{
	void details(generic x) {
		System.out.println(x);
	}
}

public class GenericClassProgram {

	public static void main(String[] args) {
		Example<Integer>i=new Example<Integer>();
		i.details(12);
		i.details(2001);
		Example<String>s=new Example<String>();
		s.details("Naga Jyothi");
		s.details("Pasupuleti");
		Example<Double>d=new Example<Double>();
		d.details(58.5);
		

	}

}
