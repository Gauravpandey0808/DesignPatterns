package strategydesignpattern.withsdpattern;

import java.util.Objects;
import java.util.Scanner;

/**
 * <H1>Strategy Design Pattern</H1>
 * <p>
 * This class allows the user to choose from multiple driving strategies based on input.
 * It follows the Strategy Design Pattern, where business logic and algorithms are
 * encapsulated in separate classes.
 * <p>
 * The following classes implement different driving strategies:
 *     <ul>
 *         <li><b>FastDrive</b></li>
 *         <li><b>NoDrive</b></li>
 *         <li><b>NormalDrive</b></li>
 *     </ul>
 * These classes implement the <b>Drive</b> interface, which defines a common method
 * for driving behavior.
 * <p>
 * Whenever new business requirements demand a different strategy, a new class
 * implementing the <b>Drive</b> interface can be added, avoiding code duplication
 * and keeping the design flexible.
 *
 */

public class MainCar {
    private final Drive drive ;

    MainCar(Drive drive) {
        this.drive = drive;
    }

    void callDriveClass() {
        drive.driving();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select any one of them \s
                1 for FastDrive \s
                2 for NormalDriving \s
                3 for No Driving""");
        int data = sc.nextInt();
        Drive drive1 = switch (data) {
            case 1 -> new FastDrive();
            case 2 -> new NormalDriving();
            case 3 -> new NoDriving();
            default -> null;
        };
        if(Objects.isNull(drive1)) {
            throw new Exception("Wrong option selected");
        }
        MainCar mainCar = new MainCar(drive1);
        mainCar.callDriveClass();
    }
}
