//product class

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated method stub
		
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake for 35 mins at 400");

		
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");

	}

}