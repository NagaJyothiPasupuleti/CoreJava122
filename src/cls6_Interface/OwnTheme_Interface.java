package cls6_Interface;
interface PowerPlants{
	void turbine();
	void generator();
}
abstract class ConventionalPowerPlants implements PowerPlants{
	abstract void boiler();
	abstract void condenser();
}
class ThermalPlant extends ConventionalPowerPlants{
	void boiler() {
		System.out.println("Burn the coal and emitts the steam ");
	}
	void condenser() {
		System.out.println("to exhaust the turbine");
	}
	public void turbine() {
		System.out.println("steam rotates the turbine and that generates energy");
		}
	
	public void generator() {
		System.out.println("it converts mechanical energy to electrical energy");
		}
}
abstract class NonconventionalPlants implements PowerPlants{
	 abstract void storage();
}
class Hydroplant extends NonconventionalPlants{
	void storage() {
		System.out.println("Reservoir stores the water and passes to the turbine with a speed");
	}
	public void turbine() {
		System.out.println(" Turbine rotates due to spped of water and that generates energy");
		}
	
	public void generator() {
		System.out.println("it converts mechanical energy to electrical energy");
		}
	}

public class OwnTheme_Interface {

	public static void main(String[] args) {
		ConventionalPowerPlants cpv;
		cpv=new ThermalPlant();
		cpv.boiler();
		cpv.condenser();
		cpv.turbine();
		cpv.generator();
		NonconventionalPlants np;
		np=new Hydroplant();
		np.storage();
		np.turbine();
		np.generator();
		// TODO Auto-generated method stub

	}

}
