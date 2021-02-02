
public class ChicagoStyleVeggiePizza extends Pizza{

	public ChicagoStyleVeggiePizza() {
		// TODO Auto-generated method stub
		
		name = "Chicago Style Sauce and Veggie Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Mushroom");
		toppings.add("Black olive");

		
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