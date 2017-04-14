package coffee.api;

import javax.inject.Inject;

public class CoffeeMaker {
	
	private Heater heater;
	private Pump pump;

	@Inject
	public CoffeeMaker( Heater heater, Pump pump) {
		this.pump = pump;
		this.heater = heater;
	}
	
	public void makeCoffee() {
		pump.pump();
		heater.heat();
		System.out.println("CoffeeMaker: " + heater);
		System.out.println("make coffee");
	}

}
