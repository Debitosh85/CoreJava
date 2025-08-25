package loosecoupling;

public class AutoMain {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car(vehicle);
        car.run();

    }
}
