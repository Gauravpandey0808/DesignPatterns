package strategydesignpattern.withoutsdpattern;

public class OffRoadCar extends SimpleCar {

    @Override
    public void drive() {
        System.out.println("This needs super drive capabilities");
    }
}
