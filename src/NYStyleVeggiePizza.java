
public class NYStyleVeggiePizza extends Pizza{

	public NYStyleVeggiePizza() {
		// TODO Auto-generated method stub
		
		name = "NY Style Sauce and Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Mushroom");
		toppings.add("Black olive");

		
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