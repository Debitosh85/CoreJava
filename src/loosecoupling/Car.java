
package loosecoupling;

public class Car {

    private Vehicle vehicle;

    public Car(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void run() {

        vehicle.run1();
        System.out.println("Car Moving In Style");

    }
}
