package coffee.app;

import coffee.api.CoffeeMaker;
import coffee.modules.DaggerCoffeeShop;

public class CoffeeApp {

	public static void main(String[] args) {
		//CoffeeMaker coffeeMaker = DaggerCoffeeShop.create().maker();
		CoffeeMaker coffeeMaker = DaggerCoffeeShop.builder().build().maker();
		coffeeMaker.makeCoffee();
	}

}
