package StructuralDesignPattern.DecoratorDesignPattern.BasePizzaDecorator;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizza;
import StructuralDesignPattern.DecoratorDesignPattern.pojo.Pizza;

public class NeapolitanPizza extends BasePizza {
    @Override
    public Pizza getPizzaPrice(int totalPizzaRequired) {
        Pizza pizza = new Pizza();
        pizza.setPizzaName("Neapolitan");
        pizza.setBasePrice(400);
        pizza.setTotalUnit(totalPizzaRequired);
        return pizza;
    }
}
