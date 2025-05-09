package StructuralDesignPattern.DecoratorDesignPattern.toppings;

import StructuralDesignPattern.DecoratorDesignPattern.pojo.Pizza;
import StructuralDesignPattern.DecoratorDesignPattern.pojo.Topping;

import java.util.Set;

public class Panner extends Toppings {
    Pizza pizza;

    public Panner(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Pizza getPizzaPrice(int totalPizzaRequired) {
        Topping topping = new Topping();

        topping.setToppingName("Panner");
        topping.setCost(50);
        topping.setTotalUnit(totalPizzaRequired);
        Set<Topping> toppingsSet = pizza.getToppings();

        toppingsSet.add(topping);
        return pizza;
    }
}
