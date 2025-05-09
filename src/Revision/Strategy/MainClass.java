package Revision.Strategy;

import Revision.Strategy.DifferentCars.Camry;
import Revision.Strategy.DifferentCars.Creta;
import Revision.Strategy.DifferentCars.Harrier;
import Revision.Strategy.DifferentCars.Swift;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Select the brand which you want:");
        System.out.println("""
                1 Camry
                2 Creta
                3 Harrier
                4 Swift""");

        Scanner scanner = new Scanner(System.in);

        CarDescription description = switch (scanner.nextInt()) {
            case 1 -> new Camry();
            case 2 -> new Creta();
            case 3 -> new Harrier();
            case 4 -> new Swift();
            default -> throw new IllegalArgumentException("Only 1 to 4 options are allowed");
        };

        System.out.println(description.getCarName());
        System.out.println(description.getModelName());
        System.out.println(description.getPrice());
        System.out.println(description.getEngineName());
    }
}
