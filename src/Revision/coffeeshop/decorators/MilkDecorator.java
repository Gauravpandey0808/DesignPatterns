package Revision.coffeeshop.decorators;

import Revision.coffeeshop.BaseCoffee;

public class MilkDecorator implements BaseCoffee {
    private final BaseCoffee next;

    public MilkDecorator(BaseCoffee next) {
        this.next = next;
    }

    @Override
    public String getDescription() {
        return next.getDescription() + " + milk";
    }

    @Override
    public Double getPrice() {
        return next.getPrice() + 2.00;
    }
}
