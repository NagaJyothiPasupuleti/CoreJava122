package cls5_abstraction;
abstract class Manufacturing{
	abstract void castingAndMolding();
	abstract void machining();
	void nurturing() {
		System.out.println("Market research will be happened in this stage");
	}
}
class Cottage extends Manufacturing{
	void castingAndMolding() {
		System.out.println("cottage is small scale industry");
		System.out.println("combine the skilled and semi-skilled labour for production");
	}
	void machining() {
		System.out.println("daily essential goods are produced");
	}
}
class Fertilizers extends Manufacturing{
	void castingAndMolding() {
		System.out.println("mixing nitrogen from air with hydrogen from natural gas");
	}
	void machining() {
		System.out.println("Fertilizer bottels are sealed in machining process");
	}
}
public class Owntheme_Abstraction {

	public static void main(String[] args) {
		Manufacturing m;
		m=new Cottage();
		m.nurturing();
		m.castingAndMolding();
		m.machining();
		m=new Fertilizers();
		m.nurturing();
		m.castingAndMolding();
		m.machining();
		
		// TODO Auto-generated method stub

	}

}
