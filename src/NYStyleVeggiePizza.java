
public class NYStyleVeggiePizza extends Pizza{

	@Override
	public void preapare() {
		// TODO Auto-generated method stub
		
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

}