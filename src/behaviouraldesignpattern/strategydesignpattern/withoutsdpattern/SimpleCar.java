package behaviouraldesignpattern.strategydesignpattern.withoutsdpattern;

/**
 * --SimpleCar class is being used as a parent class
 * which has a method named drive each car needs to be drived
 * hence we are printing how is the driving experience of the car
 * Other classes will inherit from this class and will use the methods.
 *
 */
public class SimpleCar {

    public void drive() {
        System.out.println("Simple driving capabilities");
    }
}
