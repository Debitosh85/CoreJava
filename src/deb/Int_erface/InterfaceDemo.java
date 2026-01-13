package deb.Int_erface;

public class InterfaceDemo {

  public static void main(String[] args) {
    Car c = new Car();
    c.move();
    System.out.println("Speed access using className due to static:"+Car.SPEED);
  }

}
