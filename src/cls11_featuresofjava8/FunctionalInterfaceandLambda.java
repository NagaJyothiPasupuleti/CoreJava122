package cls11_featuresofjava8;


interface LambdaExpressionProgram {
	void flavour();
}
interface Laptop1{
	void cpu();
}
interface Power{
	void source(String input);
}

public class FunctionalInterfaceandLambda {

	public static void main(String[] args) {
		LambdaExpressionProgram FunctionalInterfaceandLambda =()->System.out.println("Strawbeery ice-cream");
		FunctionalInterfaceandLambda.flavour();
		Laptop1 FunctionalInterfaceandLambda1=()->
		{
			System.out.println("CPU is the heart of Laptop");
			
		};
		FunctionalInterfaceandLambda1.cpu();// TODO Auto-generated method stub
		Power FunctionalInterfaceandLambda2=(input)->System.out.println("The input source for power generation is "+input);
		FunctionalInterfaceandLambda2.source("coal");
	}

}
