package cls10_factorymethod;

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
class Flowerspecfications{
	Flowers getFlowers(String flowername) {
		if(flowername.equals("Jasmine"))
			return new Jasmine();
		else if(flowername.equals("Daisy"))
			return new Daisy();
		else
			return null;
	}
}

public class InstanceFactoryMethod {

	public static void main(String[] args) {
		Flowerspecfications fs=new Flowerspecfications();
		Flowers f =fs.getFlowers("Daisy");
		f.color();
		f.petals();
		f.fragrance();// TODO Auto-generated method stub

	}

}
