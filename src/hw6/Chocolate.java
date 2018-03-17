package hw6;

public class Chocolate extends Sweeties{

	public Chocolate(String name, int weight, int sugarcontent, String type, double cost) {
		super(name, weight, sugarcontent, type, cost);
		Chocolate chocolate1 = new Chocolate("Milka", 125, 150, "milky", 25);
		Chocolate chocolate2 = new Chocolate("Corona", 100, 125, "black chocolate", 30);
		Chocolate chocolate3 = new Chocolate("Alpen Gold", 150, 100, "with nuts", 35);
		System.out.println(chocolate1);
		System.out.println(chocolate2);
		System.out.println(chocolate3);
	}
	

}
