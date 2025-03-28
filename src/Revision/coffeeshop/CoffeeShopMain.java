package Revision.coffeeshop;

import Revision.coffeeshop.decorators.CaramelDecorator;
import Revision.coffeeshop.decorators.MilkDecorator;
import Revision.coffeeshop.decorators.SugarDecorator;
import Revision.coffeeshop.decorators.WhippedCreamDecorator;


public class CoffeeShopMain {

    public static void main(String[] args) {
        BaseCoffee caramel = new CaramelDecorator
                (new WhippedCreamDecorator
                        (new SugarDecorator
                                (new MilkDecorator
                                        (new BasicCoffee()))));

        System.out.println("Basic description about the coffee : " + caramel.getDescription());
        System.out.println("Final price in usd : $" + caramel.getPrice());
    }
}
