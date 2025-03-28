package Revision.coffeeshop.decorators;

import Revision.coffeeshop.BaseCoffee;

public class SugarDecorator implements BaseCoffee{
    private final BaseCoffee next;

    public SugarDecorator(BaseCoffee next) {
        this.next = next;
    }

    @Override
    public String getDescription() {
        return next.getDescription() + "+ sugar";
    }

    @Override
    public Double getPrice() {
        return next.getPrice() + 1.00;
    }
}
