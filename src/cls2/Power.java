package cls2;
class Generation{
	void sources() {
		System.out.println("the resources are coal,solar,wind and water");
	}
	void input(String source) {
		System.out.println("We take the input is "+source);
	}
	String burning() {
		return "steam";
	}
	String outcome(String sending) {
		System.out.println("the turbine rotated by the "+sending);
		return "Electricity";
	}
}

public class Power {

	public static void main(String[] args) {
		Generation g=new Generation();
		g.sources();
		g.input("coal");
		System.out.println("After burning the coal "+g.burning()+" is released");
		System.out.println("the generator converts mechanical energy into "+g.outcome("steam"));// TODO Auto-generated method stub

	}

}
