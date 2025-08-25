package dependencyinjection;

public class DependencyMain {

    public static void main(String[] args) {

        Engine myEngine = new DieselEngine();
        Car myCar = new Car(myEngine);
        myCar.drive();

    }
}
