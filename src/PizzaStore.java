
public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		// TODO Auto-generated constructor stub
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factory.createPizza(type); // factory method. pizza object will be created upon customer pizza order on the fly
		
		pizza.preapare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
		
				
				
	}

}
