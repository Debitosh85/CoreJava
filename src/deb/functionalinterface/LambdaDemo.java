package deb.functionalinterface;

@FunctionalInterface
interface Vehicle {
  public void run();
}
public class LambdaDemo {

  public static void main(String[] args) {

    Vehicle v = new Vehicle(){
      @Override
      public void run(){
        System.out.println("Generic Vehicle Running");
      }
    };
      
    Vehicle car = () -> System.out.println("Car is running");

    Vehicle bus = () -> System.out.println("Bus is running");

    Vehicle bike = () -> System.out.println("Bike is running");

    System.out.println("===================");

    car.run();
    bus.run();
    bike.run();
    v.run();

  }

}
