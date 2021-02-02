import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("\nPreparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("adding sauce...");
		System.out.println("Adding toppings...");

		for (var topping : toppings) {
			System.out.println(" " + topping);
		}

	}

	public abstract void bake();
	
	public abstract void cut();

	public void box() {
		System.out.println("Place pizza in official pizzastore box");

	}

}
