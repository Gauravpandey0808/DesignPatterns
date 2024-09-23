package strategydesignpattern.withoutsdpattern;

public class ToyCar extends SimpleCar {

    @Override
    public void drive() {
        System.out.println("It do not have any drive capabilities");
    }
}
