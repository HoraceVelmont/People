package web.game.sample.coffee;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Velmont on 2017-06-23.
 */
@Module
public class DripCoffeeModule {
    @Provides static Pump providePump(Thermosiphon pump){
        return pump;
    }

    @Provides static Heater provideHeater(){
        return new ElectricHeater();
    }

}
