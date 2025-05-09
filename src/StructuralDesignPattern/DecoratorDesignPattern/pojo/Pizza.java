package StructuralDesignPattern.DecoratorDesignPattern.pojo;

import StructuralDesignPattern.DecoratorDesignPattern.toppings.Toppings;

import java.util.Iterator;
import java.util.Set;

public class Pizza {

    String pizzaName;

    int totalUnit;
    Set<Topping> toppings;
    int basePrice;

    public Set<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(Set<Topping> toppings) {
        this.toppings = toppings;
    }

    public int getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(int totalUnit) {
        this.totalUnit = totalUnit;
    }

    public int getFinalPrice() {
        int total = totalUnit * totalUnit;

        if (toppings != null) {
            for (Topping currentTopping : toppings) {
                total += (currentTopping.getTotalUnit() * currentTopping.getCost());
            }
        }

        return total;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
}
