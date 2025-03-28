package StructuralDesignPattern.DecoratorDesignPattern.toppings;

import StructuralDesignPattern.DecoratorDesignPattern.pojo.Pizza;
import StructuralDesignPattern.DecoratorDesignPattern.pojo.Topping;

import java.util.HashSet;
import java.util.Set;

public class ExtraCheese extends Toppings {

    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Pizza getPizzaPrice(int totalPizzaRequired) {
        Topping topping = new Topping();

        topping.setToppingName("Extra Cheese");
        topping.setCost(40);
        topping.setTotalUnit(totalPizzaRequired);

        Set<Topping> toppingsSet = pizza.getToppings();
        if (toppingsSet == null) {
            toppingsSet = new HashSet<>();
        }
        toppingsSet.add(topping);
        pizza.setToppings(toppingsSet);

        return pizza;
    }
}
