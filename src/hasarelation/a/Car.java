package hasarelation.a;

public class Car {

    private Engine engine = new Engine();

    public void move() {
        engine.start();
        System.out.println("Car is moving");
    }
}
