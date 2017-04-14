package coffee.modules;

import javax.inject.Singleton;

import coffee.api.Heater;
import coffee.impl.ElectricHeater;
import dagger.Module;
import dagger.Provides;

@Module
public class HeaterModule {
	
	@Provides
	@Singleton
	public Heater providesHeater() {
		return new ElectricHeater(); 
	}
	
}
