package polymorphism;

abstract class Vehicles {
  public abstract void run();
}
public class Annonymous {
  
  public static void main(String[] args) {
    
    Vehicles Bike = new Vehicles()
    {
      @Override
      public void run(){
        System.out.println("Bike will run if we fill Petrol");
      }
    };
    System.out.println(Bike.getClass().getName());
    Bike.run();

    Vehicles car = new Vehicles()
    {
      @Override
      public void run(){
        System.out.println("Car have both engines petrol & diesel");
      }
    };
    System.out.println(car.getClass().getName());
    car.run();
  }
}
