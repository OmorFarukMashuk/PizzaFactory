
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		// TODO Auto-generated constructor stub

		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake for 25 mins at 350");

	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");

	}

}
