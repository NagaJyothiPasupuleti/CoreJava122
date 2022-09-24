package cls4_InhrtMethodoverriding;
class Flowers{
	void color() {
		System.out.println("flowers are in different colors");
	}
	void petals() {
		System.out.println("different for each and every folwer");
	}
	void fragrance() {
		System.out.println("not necessary to all the flowers have fragrance");
	}
	}
class Jasmine extends Flowers{
	void color() {
		System.out.println("jasmine flowers are in white ");
	}
	void petals() {
		System.out.println("Jasmine has 5 Petals");
	}
	void fragrance() {
		System.out.println("The fragrance of jasmine is rich,sweet,fruity and sensual");
	}
}
class Daisy extends Flowers{
	void color() {
		System.out.println("the color of daisy is bright yellow center ");
	}
	void petals() {
		System.out.println("the petals of daisy are in white color");
	}
	void fragrance() {
		System.out.println("Daisy has herbaceous green scent fragrance");
	}
}

public class OwnTheme_Methodoverriding {

	public static void main(String[] args) {
		Flowers f=new Flowers();
		f.color();
		f.petals();
		f.fragrance();
		f=new Jasmine();
		f.color();
		f.petals();
		f.fragrance();
		f=new Daisy();
		f.color();
		f.petals();
		f.fragrance();// TODO Auto-generated method stub

	}

}
