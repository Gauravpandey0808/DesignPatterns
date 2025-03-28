package Revision.coffeeshop.decorators;

import Revision.coffeeshop.BaseCoffee;

public class WhippedCreamDecorator implements BaseCoffee {
    private final BaseCoffee next;

    public WhippedCreamDecorator(BaseCoffee next) {
        this.next = next;
    }

    @Override
    public String getDescription() {
        return next.getDescription() + "+ Whipped cream";
    }

    @Override
    public Double getPrice() {
        return next.getPrice() + 2.00;
    }
}