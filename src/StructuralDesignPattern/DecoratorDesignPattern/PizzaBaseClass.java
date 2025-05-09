package StructuralDesignPattern.DecoratorDesignPattern;

import StructuralDesignPattern.DecoratorDesignPattern.BasePizzaDecorator.NeapolitanPizza;
import StructuralDesignPattern.DecoratorDesignPattern.pojo.Pizza;
import StructuralDesignPattern.DecoratorDesignPattern.toppings.ExtraCheese;
import StructuralDesignPattern.DecoratorDesignPattern.toppings.Toppings;

public class PizzaBaseClass {

    public static void main(String[] args) {
        BasePizza basePizza = new NeapolitanPizza();
        Pizza pizza = basePizza.getPizzaPrice(4);

        Toppings topping = new ExtraCheese(pizza);
        Pizza obj1 = topping.getPizzaPrice(2);

        System.out.println(obj1.getPizzaName());
        System.out.println(obj1.getFinalPrice());

    }
}
