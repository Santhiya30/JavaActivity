package abfacdp;

public class finalPizza {
	 public static void main(String[] args) {
	        SimplePizzaFactory factory = new SimplePizzaFactory();
	        PizzaStore store = new PizzaStore(factory);

	        AbstractFactory pizza = store.orderPizza("cheese");
	        System.out.println("We ordered a " + pizza.getName() + "\n");

	        pizza = store.orderPizza("veggie");
	        System.out.println("We ordered a " + pizza.getName() + "\n");
	    }
}
