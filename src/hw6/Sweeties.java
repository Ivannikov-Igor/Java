package hw6;

import java.util.Arrays;

public class Sweeties {
	
	private int nextId = 0;
	private int id = nextId++;
	private String sweetietype;
	private String name;
	private double weight;
	private int sugarcontent;
	private String type;
	private double cost;

	public Sweeties(String name, String sweetietype, int weight, int sugarcontent, String type, double cost) {
		this.name = name;
		this.sweetietype = sweetietype;
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

	public double getWeight() {
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
	@Override
	public String toString() {
		return id + " " + name + " " + sweetietype +  " " + weight + " " + sugarcontent + " " + type + " " + " " + cost;
	}

	public String getSweetietype() {
		return sweetietype;
	}

	public static int get(int sweet_index) {
		// TODO Auto-generated method stub
		return sweet_index;
	}

}
