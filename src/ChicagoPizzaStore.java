// creator class

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) { // factory method called and overriden here 
		// TODO Auto-generated method stub

		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else
			return null;
	}

}
