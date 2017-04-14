package coffee.modules;

import javax.inject.Singleton;

import coffee.api.CoffeeMaker;
import dagger.Component;

@Component(modules = { HeaterModule.class, DripCoffeeModule.class })
@Singleton
public interface CoffeeShop {
	CoffeeMaker maker();
}
