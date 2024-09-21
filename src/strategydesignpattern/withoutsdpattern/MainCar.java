package strategydesignpattern.withoutsdpattern;


/**
 * This main class handles calling multiple car classes such as SimpleCar, SuperCar,
 * ToyCar, and OffRoadCar. The parent class is SimpleCar, from which all other classes inherit.
 * Each class uses a method called drive(), and advanced classes override this method to
 * implement more complex behavior.
 * <p>
 * However, overriding methods extensively can lead to code that is hard to maintain,
 * which is why the Strategy Design Pattern is implemented here to separate behavior and
 * correct this design flaw.
 * <p>
 * Different packages are created to implement the Strategy Design Pattern effectively.
 * <p>
 * As we scale up there will be problems an issue .We will have duplicate methods and hence
 * will have effect in the performance and there will be issue in  code maintainability .
 *
 */
public class MainCar {

    public static void main(String[] args) {
        OffRoadCar offRoadCar = new OffRoadCar();
        offRoadCar.drive();

        Truck truck = new Truck();
        truck.drive();
    }
}
