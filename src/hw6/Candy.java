package hw6;

class Candy extends Sweeties {
	public Candy(String name, int weight, int sugarcontent, String type, double cost) {
		super(name, weight, sugarcontent, type, cost);

		Candy candy1 = new Candy("Crazy bee", 5, 3, "jelly", 1.5);
		Candy candy2 = new Candy("Red poppy", 10, 8, "chocolate", 3.45);
		Candy candy3 = new Candy("Cow", 8, 6, "wafers", 2.75);
		Candy[] candyes = { candy1, candy2, candy3 };
		System.out.println(candy1);
		System.out.println(candy2);
		System.out.println(candy3);
		System.out.println(candyes);


}
}
