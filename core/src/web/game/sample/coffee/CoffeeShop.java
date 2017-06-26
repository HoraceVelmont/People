package web.game.sample.coffee;

import dagger.Component;

/**
 * Created by Velmont on 2017-06-23.
 */
@Component(modules = DripCoffeeModule.class)
public interface CoffeeShop {
    web.game.sample.coffee.CoffeeMaker maker();
}
