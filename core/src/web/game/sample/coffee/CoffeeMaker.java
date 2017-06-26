package web.game.sample.coffee;

import javax.inject.Inject;

/**
 * Created by Velmont on 2017-06-19.
 */
public class CoffeeMaker {
    @Inject
    Heater heater;
    @Inject public Pump pump;

    @Inject CoffeeMaker(Heater heater, Pump pump){
        this.heater = heater;
        this.pump = pump;
    }

    public void brew(){
        pump.pump();
    }

}
