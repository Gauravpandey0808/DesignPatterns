package Revision.coffeeshop.decorators;

import Revision.coffeeshop.BaseCoffee;

public class CaramelDecorator implements BaseCoffee {
    private final BaseCoffee next;

    public CaramelDecorator(BaseCoffee next) {
        this.next = next;
    }

    @Override
    public String getDescription() {
        return next.getDescription() + "+ Caramel";
    }

    @Override
    public Double getPrice() {
        return next.getPrice() + 3.00;
    }
}