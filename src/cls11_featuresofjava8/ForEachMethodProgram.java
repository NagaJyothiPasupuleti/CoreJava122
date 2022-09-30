package cls11_featuresofjava8;
import java.util.*;
import java.util.stream.Collectors;
class Laptops{
	public Laptops(String laptopname, int ram, String os, int cost) {
		super();
		this.laptopname = laptopname;
		this.ram = ram;
		this.os = os;
		this.cost = cost;
	}
	public String getLaptopname() {
		return laptopname;
	}
	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	private String laptopname;
	private int ram;
	private String os;
	private int cost;
	
}

public class ForEachMethodProgram {

	public static void main(String[] args) {
		List<Laptops> l=new ArrayList<Laptops>();
		l.add(new Laptops("Lenovo",4,"windows 10", 45000));
		l.add(new Laptops("Hp",5,"windows 11", 60000));
		l.add(new Laptops("Asus",4,"windows 10 pro", 27000));
		l.add(new Laptops("Dell",8,"windows 11", 50000));
		l.add(new Laptops("Apple",4,"windows 10", 45000));
		l.add(new Laptops("Acer",4,"windows 10", 4000));
		for(Laptops s:l) {
			System.out.println(s.getLaptopname()+" "+s.getRam()+" "+s.getOs()+" "+s.getCost());
		}
		List<Laptops>t=l.stream().filter(x->x.getLaptopname()=="Asus").collect(Collectors.toList());
		t.forEach(f->System.out.println("Laptop name is "+f.getLaptopname()+"having the ram "+f.getRam()+"with os "+f.getOs()+"of cost "+f.getCost()));
				
				

	}

}
