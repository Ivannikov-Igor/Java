package hw6;

public class Sweeties {
	private final String name;
	private int weight;
	private int sugarcontent;
	private String type;
	private double cost;

	public Sweeties(String name, int weight, int sugarcontent, String type, double cost) {
		this.name = name;
		this.weight = weight;
		this.sugarcontent = sugarcontent;
		this.type = type;
		this.cost = cost;
	}

	public double getCost() {

		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSugarcontent() {
		return sugarcontent;
	}

	public void setSugarcontent(int sugarcontent) {
		this.sugarcontent = sugarcontent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

}
