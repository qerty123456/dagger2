package coffee.modules;

import coffee.api.Heater;
import coffee.api.Pump;
import coffee.impl.Thermosiphon;
import dagger.Module;
import dagger.Provides;

@Module
public class DripCoffeeModule {
	
	@Provides
	public static Pump providePump(Heater heater) {
		return new Thermosiphon(heater);
	}
}
