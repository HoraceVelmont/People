package web.game.sample.coffee;


/**
 * Created by Velmont on 2017-06-23.
 */
public class CoffeeApp {
    public static void main(String[] args){
        CoffeeShop coffeeShop = DaggerCoffeeShop.create();
        coffeeShop.maker().brew();
    }
}
