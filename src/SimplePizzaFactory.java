
public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYStCheesePizza();
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")) {
			pizza = new ChicagoStyleCheesePizza();
		}else if(type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
		
	}
}
