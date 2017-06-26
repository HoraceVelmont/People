package web.game.di;

import org.junit.Test;
import web.game.sample.coffee.CoffeeShop;
import web.game.coffee.DaggerCoffeeShop;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Velmont on 2017-06-22.
 */
public class DaggerDITest {
    @Test
    public void daggerAutoImportTest(){
        CoffeeShop coffeeShop = DaggerCoffeeShop.create();
        coffeeShop.maker().brew();
        assertNotNull(coffeeShop.maker());
    }

}
