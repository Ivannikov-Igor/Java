package hw6;

import java.io.IOException;
import java.util.ArrayList;;

public interface Giftbox {

	public double getFinalCost(ArrayList<Sweeties> list, double sum);
	public void findElementByCost(ArrayList<Sweeties> list);
	public StringBuilder findCandyByCost(double a, double b, ArrayList<Sweeties> list);
	public void displayCollection(ArrayList<Sweeties> list);
	public void saveToFile(ArrayList<Sweeties> list) throws IOException;
}