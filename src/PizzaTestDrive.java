
public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza;
		pizza = nyStore.orderPizza("cheese");
		System.out.println("Pizza ordered: " + pizza.getName());
		
		
		pizza = nyStore.orderPizza("veggie");
		System.out.println("Pizza ordered: " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Pizza ordered: " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Pizza ordered: " + pizza.getName());
		

	}
	
}
