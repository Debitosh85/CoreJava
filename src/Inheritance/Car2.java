package Inheritance;

public class Car2 {

    private Engine2 engine;

    public Car2(Engine2 engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car 2 is driving");
    }

    public static void main(String[] args) {
        Engine2 myengine = new Engine2();
        Car2 mycar = new Car2(myengine);
        mycar.drive();
    }
}
