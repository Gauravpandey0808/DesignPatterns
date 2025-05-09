package Revision.coffeeshop;

public class BasicCoffee implements BaseCoffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public Double getPrice() {
        return 10.00;
    }
}
